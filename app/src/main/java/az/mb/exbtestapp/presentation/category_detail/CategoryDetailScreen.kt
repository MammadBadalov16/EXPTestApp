package az.mb.exbtestapp.presentation.category_detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import az.mb.exbtestapp.domain.model.Category
import az.mb.exbtestapp.domain.model.Transaction
import az.mb.exbtestapp.presentation.category_detail.components.TransactionItem
import az.mb.exbtestapp.ui.theme.EXPBlack
import az.mb.exbtestapp.ui.theme.White
import az.mb.exbtestapp.ui.theme.White2

@Composable
fun CategoryDetailScreen(
    cardIndex: Int,
    categoryIndex: Int,
    viewModel: CategoryDetailViewModel = hiltViewModel()
) {
    viewModel.getCoin(cardIndex = cardIndex, categoryIndex = categoryIndex)
    val state = viewModel.state.value

    Box(
        Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Column(Modifier.fillMaxWidth()) {

            state.coin?.let { category ->
                HeaderSection(category = category)
                SplitSection()
                TransactionSection(transactions = category.transactions)
            }
        }
    }
}

@Composable
fun HeaderSection(category: Category) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Column(
            Modifier
                .padding(start = 25.dp, bottom = 25.dp, top = 30.dp)
                .align(Alignment.TopStart)
        ) {
            Text(
                text = category.name,
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold,
                color = EXPBlack
            )
            Text(
                text = "Expenses for February 2021",
                fontSize = 17.sp,
                color = EXPBlack,
                modifier = Modifier.padding(top = 10.dp)
            )
            Row(
                modifier = Modifier
                    .padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = category.expenseAmount,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = EXPBlack
                )
                Text(
                    text = "${category.percent} of all",
                    fontSize = 20.sp,
                    color = EXPBlack,
                    modifier = Modifier.padding(start = 15.dp)
                )
            }
        }

        Icon(
            painter = painterResource(id = category.iconId),
            contentDescription = "Icon",
            modifier = Modifier
                .padding(top = 10.dp, end = 10.dp)
                .align(Alignment.TopEnd)
                .size(40.dp),
            tint = category.color,

            )


    }
}

@Composable
fun SplitSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .padding(start = 10.dp, end = 10.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(color = White2)

    )
}

@Composable
fun TransactionSection(transactions: List<Transaction>) {
    LazyColumn(Modifier.padding(start = 10.dp, end = 10.dp, top = 25.dp)) {
        items(transactions) { transaction ->
            TransactionItem(transaction = transaction)
        }
    }

}



