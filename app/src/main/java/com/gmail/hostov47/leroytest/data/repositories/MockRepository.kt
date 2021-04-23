package com.gmail.hostov47.leroytest.data.repositories

import com.gmail.hostov47.leroytest.R
import com.gmail.hostov47.leroytest.data.local.CatalogPreviewContent
import com.gmail.hostov47.leroytest.data.local.ProductPreviewContent

object MockRepository {
    val catalogList = listOf<CatalogPreviewContent>(
        CatalogPreviewContent("1", "Каталог", R.drawable.catalog),
        CatalogPreviewContent("2", "Сад", R.drawable.garden),
        CatalogPreviewContent("3", "Освещение",  R.drawable.light),
        CatalogPreviewContent("4", "Сад",  R.drawable.garden),
        CatalogPreviewContent("5", "Освещение", R.drawable.light),
    )

    val productList = listOf<ProductPreviewContent>(
            ProductPreviewContent("1", "Ламинат Artens \"Тангай\" 33 класс толщина 8 мм", 930.60f, "кор", R.drawable.tangay),
            ProductPreviewContent("2", "Ламинат Artens \"Лансия\" 33 класс толщина 8 мм", 1150.35f, "кор", R.drawable.lansia),
            ProductPreviewContent("3", "Штукатурка гипсовая knauf", 120.99f, "кор", R.drawable.plaster),
            ProductPreviewContent("1", "Ламинат Artens \"Тангай\" 33 класс толщина 8 мм", 930.60f, "кор", R.drawable.tangay),
            ProductPreviewContent("2", "Ламинат Artens \"Лансия\" 33 класс толщина 8 мм", 1150.35f, "кор", R.drawable.lansia),
            ProductPreviewContent("3", "Штукатурка гипсовая knauf", 120.99f, "кор", R.drawable.plaster),
    )
}