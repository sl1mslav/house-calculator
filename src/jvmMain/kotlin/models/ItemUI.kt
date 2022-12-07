package models

import androidx.compose.runtime.Composable
sealed class ItemUI {

    @Composable
    abstract fun draw()
}
