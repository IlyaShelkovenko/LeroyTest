/**
 * Created by Ilia Shelkovenko on 21.04.2021.
 */

package com.gmail.hostov47.leroytest.ui.home

import com.gmail.hostov47.leroytest.R
import com.gmail.hostov47.leroytest.data.local.CatalogPreviewContent
import com.gmail.hostov47.leroytest.data.local.ProductPreviewContent
import com.gmail.hostov47.leroytest.extensions.load
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_product.*

class ProductItem(
        private val content: ProductPreviewContent,
        private val onClick: (item: ProductPreviewContent) -> Unit
) : Item() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        with(viewHolder){
            iv_product_preview.load(content.imageRes)
            tv_title.text = content.title
            tv_price.text = content.priceString
            iv_product_preview.setOnClickListener { onClick.invoke(content) }
        }
    }

    override fun getLayout(): Int = R.layout.item_product
}