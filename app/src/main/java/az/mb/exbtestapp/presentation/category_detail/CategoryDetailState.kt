package az.mb.exbtestapp.presentation.category_detail

import az.mb.exbtestapp.domain.model.Category

data class CategoryDetailState(
    val isLoading: Boolean = false,
    val coin: Category? = null,
    val error: String = ""
)