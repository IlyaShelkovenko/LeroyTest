package com.gmail.hostov47.leroytest.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gmail.hostov47.leroytest.R
import com.gmail.hostov47.leroytest.RootActivity
import com.gmail.hostov47.leroytest.data.repositories.MockRepository
import com.google.android.material.appbar.AppBarLayout
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import kotlinx.android.synthetic.main.appbar_layout.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {
    private val repository = MockRepository
    private val adapter by lazy {
        GroupAdapter<GroupieViewHolder>()
    }
    private val productAdapter by lazy {
        GroupAdapter<GroupieViewHolder>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        (requireActivity() as RootActivity).setSupportActionBar(toolbar)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        initAppbar(view)
        val list = repository.catalogList.map {
            CatalogItem(it) { item -> }
        }.toList()

        rv_catalog.adapter = adapter.apply { update(list) }

        val listOfItems = repository.productList.map {
            ProductItem(it) { item -> }
        }.toList()
        val productList = listOf(
                MainCardContainer(
                        R.string.now_offer,
                        listOfItems
                ),
                MainCardContainer(
                        R.string.best_price,
                        listOfItems
                )
        )
        rv_products.adapter = productAdapter.apply { addAll(productList) }

        refresh.setOnRefreshListener {
            refresh.isRefreshing = false
        }
    }

    private fun initAppbar(view: View) {
        val appBar : AppBarLayout = view.findViewById(R.id.appBar_layout)
        appBar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
            if (Math.abs(verticalOffset) == appBarLayout.getTotalScrollRange()) {
                // If collapsed, then do this
                search_toolbar.visibility = View.GONE
                btn_qrcode.visibility = View.GONE
                tv_search_title.visibility = View.GONE
                toolbar.title = "Поиск"
            } else if (verticalOffset == 0) {
                // If expanded, then do this
                search_toolbar.visibility = View.VISIBLE
                btn_qrcode.visibility = View.VISIBLE
                toolbar.title = " "
                tv_search_title.visibility = View.VISIBLE
            }
        })
    }


    private fun initRecyclerView() {
        val spacing = 50
        val decoration = SpacingItemDecoration(spacing)
        rv_catalog.addItemDecoration(decoration)
    }
}
