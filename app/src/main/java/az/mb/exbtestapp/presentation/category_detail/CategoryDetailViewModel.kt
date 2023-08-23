package az.mb.exbtestapp.presentation.category_detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import az.mb.exbtestapp.common.Resource
import az.mb.exbtestapp.domain.use_case.get_category.GetCategoryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CategoryDetailViewModel @Inject constructor(
    private val getCategoryUseCase: GetCategoryUseCase,
) : ViewModel() {

    private val _state = mutableStateOf(CategoryDetailState())
    val state: State<CategoryDetailState> = _state

    fun getCoin(cardIndex: Int, categoryIndex: Int) {
        getCategoryUseCase(
            cardIndex = cardIndex,
            categoryIndex = categoryIndex
        ).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = CategoryDetailState(coin = result.data)
                }

                is Resource.Error -> {
                    _state.value = CategoryDetailState(
                        error = result.message ?: "Error"
                    )
                }

                is Resource.Loading -> {
                    _state.value = CategoryDetailState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}