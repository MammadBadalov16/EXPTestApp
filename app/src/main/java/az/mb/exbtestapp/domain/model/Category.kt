package az.mb.exbtestapp.domain.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Category(
    val id: Int,
    @DrawableRes val iconId: Int,
    val name: String,
    val expenseAmount: String,
    val percent: String,
    val color: Color,
    val transactions: List<Transaction>
)
