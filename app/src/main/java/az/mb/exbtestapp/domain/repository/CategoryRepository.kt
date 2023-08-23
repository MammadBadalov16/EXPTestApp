package az.mb.exbtestapp.domain.repository

import az.mb.exbtestapp.domain.model.Card
import az.mb.exbtestapp.domain.model.Category

interface CategoryRepository {

    suspend fun getCards(): List<Card>

    suspend fun getCard(cardIndex: Int): Card

    suspend fun getCategoryIndex(cardIndex: Int, categoryIndex: Int): Category


}