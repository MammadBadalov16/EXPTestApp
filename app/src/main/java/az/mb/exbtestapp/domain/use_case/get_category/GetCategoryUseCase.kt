package az.mb.exbtestapp.domain.use_case.get_category

import az.mb.exbtestapp.common.Resource
import az.mb.exbtestapp.domain.model.Category
import az.mb.exbtestapp.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCategoryUseCase @Inject constructor(
    private val repository: CategoryRepository
) {
    operator fun invoke(cardIndex: Int, categoryIndex: Int): Flow<Resource<Category>> = flow {
        try {
            emit(Resource.Loading<Category>())
            val coin = repository.getCategoryIndex(
                cardIndex = cardIndex,
                categoryIndex = categoryIndex
            )
            emit(Resource.Success<Category>(coin))
        } catch (e: Exception) {
            emit(Resource.Error<Category>(e.toString()))
        }
    }
}