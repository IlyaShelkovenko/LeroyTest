package com.gmail.hostov47.leroytest.data.repositories

import com.gmail.hostov47.leroytest.R
import com.gmail.hostov47.leroytest.data.local.CatalogPreviewContent

object MockRepository {
    val catalogList = mutableListOf<CatalogPreviewContent>(
        CatalogPreviewContent("1", "Каталог", R.drawable.catalog),
        CatalogPreviewContent("2", "Сад", R.drawable.garden),
        CatalogPreviewContent("3", "Освещение",  R.drawable.light),
        CatalogPreviewContent("4", "Каталог", R.drawable.catalog),
        CatalogPreviewContent("2", "Сад",  R.drawable.garden),
        CatalogPreviewContent("3", "Освещение", R.drawable.light),
    )
}