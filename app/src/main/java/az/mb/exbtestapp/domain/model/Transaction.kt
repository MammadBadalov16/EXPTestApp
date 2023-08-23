package az.mb.exbtestapp.domain.model

import androidx.annotation.DrawableRes

data class Transaction(
    @DrawableRes val iconId: Int,
    val title: String,
    val amount: String,
    val time: String,
    val date: String
)
