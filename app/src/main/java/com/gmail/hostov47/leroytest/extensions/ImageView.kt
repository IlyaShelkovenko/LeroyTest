/**
 * Created by Ilia Shelkovenko on 20.04.2021.
 */

package com.gmail.hostov47.leroytest.extensions

import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.squareup.picasso.Picasso

fun ImageView.load(@DrawableRes imageRes: Int){
    Picasso.get()
        .load(imageRes)
        .into(this)
}