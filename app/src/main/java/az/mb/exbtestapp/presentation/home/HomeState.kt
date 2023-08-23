package az.mb.exbtestapp.presentation.home

import az.mb.exbtestapp.domain.model.Card

data class HomeState(
    val isLoading: Boolean = false,
    val card: Card? = null,
    val error: String = ""
)
