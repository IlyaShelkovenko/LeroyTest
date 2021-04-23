/**
 * Created by Ilia Shelkovenko on 21.04.2021.
 */

package com.gmail.hostov47.leroytest.data.local

import androidx.annotation.DrawableRes

data class ProductPreviewContent(
    val productId: String,
    val title: String,
    val price: Float,
    val productAmount: String,
    @DrawableRes
    val imageRes: Int
){
    val priceString: String
    get() = "$price ₽/${productAmount}"
}