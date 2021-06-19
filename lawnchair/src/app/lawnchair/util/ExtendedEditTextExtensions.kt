package app.lawnchair.util

import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import androidx.annotation.ColorInt
import com.android.launcher3.ExtendedEditText
import com.android.launcher3.Utilities

fun ExtendedEditText.setCursorColor(@ColorInt color: Int) {
    if (Utilities.ATLEAST_Q) {
        this.textCursorDrawable?.colorFilter = BlendModeColorFilter(color, BlendMode.SRC)
    }
}

fun ExtendedEditText.setTextSelectHandleColor(@ColorInt color: Int) {
    if (Utilities.ATLEAST_Q) {
        this.apply {
            listOf(textSelectHandle, textSelectHandleLeft, textSelectHandleRight).forEach {
                it?.colorFilter = BlendModeColorFilter(color, BlendMode.SRC_IN)
            }
        }
    }
}