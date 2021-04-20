/**
 * Created by Ilia Shelkovenko on 20.04.2021.
 */

package com.gmail.hostov47.leroytest.ui.home

import com.gmail.hostov47.leroytest.R
import com.gmail.hostov47.leroytest.data.local.CatalogPreviewContent
import com.gmail.hostov47.leroytest.extensions.load
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_catalog.*

class CatalogItem(
    private val content: CatalogPreviewContent,
    private val onClick: (item: CatalogPreviewContent) -> Unit
) : Item() {
    override fun getLayout() = R.layout.item_catalog

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {

        viewHolder.iv_background_image.setOnClickListener { onClick.invoke(content) }
        viewHolder.tv_title.text = content.title
        viewHolder.iv_background_image.load(content.image)
    }


}