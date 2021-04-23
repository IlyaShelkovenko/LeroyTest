/**
 * Created by Ilia Shelkovenko on 21.04.2021.
 */

package com.gmail.hostov47.leroytest.extensions

import android.text.Editable
import android.widget.EditText
import androidx.core.widget.addTextChangedListener

fun EditText.afterTextChanged(action: (s: Editable?) -> Unit) =
        addTextChangedListener(afterTextChanged = action)