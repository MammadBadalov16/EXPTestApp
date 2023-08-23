package az.mb.exbtestapp.domain.model

data class Card(
    val cardName: String,
    val expenses: String,
    val incoming: String,
    val cashback: String,
    val categories: List<Category>
)
