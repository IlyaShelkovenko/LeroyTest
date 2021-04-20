package com.gmail.hostov47.leroytest.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gmail.hostov47.leroytest.R
import com.gmail.hostov47.leroytest.data.repositories.MockRepository
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {
    private val repository = MockRepository
    private val adapter by lazy {
        GroupAdapter<GroupieViewHolder>()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        val list = repository.catalogList.map {
            CatalogItem(it){item ->}}.toList()

        rv_catalog.adapter = adapter.apply { update(list) }
    }

    private fun initRecyclerView(){
        val spacing = 50
        rv_catalog.addItemDecoration(SpacingItemDecoration(spacing))
    }
}