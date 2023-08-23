package az.mb.exbtestapp.presentation.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import az.mb.exbtestapp.common.Resource
import az.mb.exbtestapp.domain.use_case.get_card.GetCardUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getCardUseCase: GetCardUseCase
) : ViewModel() {

    private val _state = mutableStateOf(HomeState())
    val state: State<HomeState> = _state

    init {
        getCard(0)
    }


    fun getCard(cardIndex: Int) {
        getCardUseCase(cardIndex = cardIndex).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = HomeState(card = result.data)
                }

                is Resource.Error -> {
                    _state.value = HomeState(error = result.message ?: "Error")

                }

                is Resource.Loading -> {
                    _state.value = HomeState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

}