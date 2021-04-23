/**
 * Created by Ilia Shelkovenko on 21.04.2021.
 */

package com.gmail.hostov47.leroytest.ui.home

import androidx.annotation.StringRes
import com.gmail.hostov47.leroytest.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_main_screen.*

class MainCardContainer(
        @StringRes
        private val title: Int,
        private val items: List<Item>
) : Item() {

    override fun getLayout() = R.layout.item_main_screen

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.tv_category_title.text = viewHolder.tv_category_title.context.getString(title)
        viewHolder.rv_items_container.adapter = GroupAdapter<GroupieViewHolder>().apply { addAll(items) }
        val space = 50
        viewHolder.rv_items_container.addItemDecoration(SpacingItemDecoration(space))
    }
}