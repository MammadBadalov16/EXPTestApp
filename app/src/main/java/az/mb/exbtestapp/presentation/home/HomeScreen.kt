package az.mb.exbtestapp.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import az.mb.exbtestapp.R
import az.mb.exbtestapp.common.FakeDb
import az.mb.exbtestapp.domain.model.Card
import az.mb.exbtestapp.domain.model.Category
import az.mb.exbtestapp.presentation.home.components.CategoryItem
import az.mb.exbtestapp.presentation.home.components.ExposedMenu
import az.mb.exbtestapp.ui.theme.White
import az.mb.exbtestapp.ui.theme.White2
import az.mb.exbtestapp.presentation.category_detail.CategoryDetailScreen
import az.mb.exbtestapp.presentation.home.components.AmountItem
import az.mb.exbtestapp.presentation.home.components.Circle

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    val card: Card = state.card!!

    val arrayCards = FakeDb.arrayCards
    val arrayYear = FakeDb.arrayYear
    val arrayMonth = FakeDb.arrayMonth

    val cardIndex = remember { mutableStateOf(0) }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White2)
            .verticalScroll(rememberScrollState())
    ) {
        Column {
            HeaderSection()
            MenuSection(
                arrayYear = arrayYear,
                arrayMonth = arrayMonth,
                arrayCards = arrayCards,
                onclick = {
                    viewModel.getCard(it)
                    cardIndex.value = it
                }
            )
            BodySection(cardIndex = cardIndex, card = card)
        }
    }
}


@Composable
fun HeaderSection() {
    Box(Modifier.fillMaxWidth()) {
        IconButton(modifier = Modifier.align(Alignment.CenterStart), onClick = { }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_back), contentDescription = "Back Icon"
            )
        }
        Text(
            text = "Stats", modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun MenuSection(
    arrayYear: Array<Int>,
    arrayMonth: Array<String>,
    arrayCards: Array<String>,
    onclick: (Int) -> Unit
) {
    Box(Modifier.padding(10.dp)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            ExposedMenu(myArray = arrayCards, R.drawable.ic_express_bank, onClick = { onclick(it) })
            Spacer(modifier = Modifier.height(15.dp))
            Row(Modifier.fillMaxWidth()) {
                Box(
                    Modifier.weight(0.4f)
                ) {
                    ExposedMenu(myArray = arrayYear, null, onClick = {})
                }
                Spacer(modifier = Modifier.width(15.dp))
                Box(Modifier.weight(0.5f)) {
                    ExposedMenu(myArray = arrayMonth, null, onClick = {})
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

@Composable
fun BodySection(cardIndex: State<Int>, card: Card) {
    val clickedIndex = remember { mutableStateOf(0) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = White, shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)
            )
    ) {
        Column() {
            AmountSection(card = card)
            Spacer(modifier = Modifier.height(25.dp))
            CircleSection(cardIndex = cardIndex.value, clickedIndex = clickedIndex)
            CategorySection(categories = card.categories, onclick = {
                clickedIndex.value = it

            })

        }
    }
}

@Composable
fun AmountSection(card: Card) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            AmountItem(amount = card.expenses, title = "Expenses")
            AmountItem(amount = card.incoming, title = "Incoming")
            AmountItem(amount = card.cashback, title = "Cashback")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CircleSection(cardIndex: Int, clickedIndex: State<Int>) {
    var openBottomSheet by remember { mutableStateOf(false) }

    if (openBottomSheet) {
        ModalBottomSheet(
            containerColor = White2,
            onDismissRequest = { openBottomSheet = false }
        ) {
            CategoryDetailScreen(
                cardIndex = cardIndex,
                categoryIndex = clickedIndex.value,
            )
        }

    }

    Box(
        modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Circle(
            clickedIndex = clickedIndex, onClick = {
                openBottomSheet = true
            }
        )
    }
    Spacer(modifier = Modifier.height(25.dp))
}

@Composable
fun CategorySection(
    categories: List<Category>,
    onclick: (Int) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(White)
            .padding(10.dp)
    ) {
        Column() {
            Text(
                text = "Categories", style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(25.dp))
            LazyColumn(Modifier.height(270.dp)) {
                itemsIndexed(categories) { index, category ->
                    CategoryItem(category = category, onItemClick = {
                        onclick(index)
                    })
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }
        }
    }
}