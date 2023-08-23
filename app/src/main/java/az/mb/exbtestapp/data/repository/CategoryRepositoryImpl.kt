package az.mb.exbtestapp.data.repository

import az.mb.exbtestapp.common.Constants
import az.mb.exbtestapp.common.FakeDb
import az.mb.exbtestapp.domain.model.Card
import az.mb.exbtestapp.domain.model.Category
import az.mb.exbtestapp.domain.repository.CategoryRepository

class CategoryRepositoryImpl : CategoryRepository {

    override suspend fun getCards(): List<Card> {
        return FakeDb.cards
    }

    override suspend fun getCard(cardIndex: Int): Card {
        return FakeDb.cards[cardIndex]
    }

    override suspend fun getCategoryIndex(cardIndex: Int, categoryIndex: Int): Category {
        return FakeDb.cards[cardIndex].categories[categoryIndex]
    }
}