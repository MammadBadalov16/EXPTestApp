package az.mb.exbtestapp.domain.use_case.get_card

import az.mb.exbtestapp.common.Resource
import az.mb.exbtestapp.domain.model.Card
import az.mb.exbtestapp.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCardUseCase @Inject constructor(
    private val repository: CategoryRepository
) {
    operator fun invoke(cardIndex: Int): Flow<Resource<Card>> = flow {
        try {
            emit(Resource.Loading<Card>())
            val card = repository.getCard(cardIndex = cardIndex)
            emit(Resource.Success<Card>(card))
        } catch (e: Exception) {
            emit(
                Resource.Error<Card>(
                    e.toString()
                )
            )
        }
    }
}