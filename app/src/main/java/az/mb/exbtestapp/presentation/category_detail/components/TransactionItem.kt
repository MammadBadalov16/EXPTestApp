package az.mb.exbtestapp.presentation.category_detail.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import az.mb.exbtestapp.domain.model.Transaction
import az.mb.exbtestapp.ui.theme.Gray
import az.mb.exbtestapp.ui.theme.LineColor

@Composable
fun TransactionItem(
    transaction: Transaction
) {
    Box(modifier = Modifier.padding(top = 10.dp)) {
        Row(
            Modifier
                .fillMaxWidth()
        ) {
            RoundImage(image = transaction.iconId)

            Column(Modifier.padding(start = 10.dp)) {
                Row(
                    Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text(text = transaction.title, style = MaterialTheme.typography.bodyLarge)
                        Spacer(modifier = Modifier.size(size = 5.dp))
                        Row() {
                            Text(
                                text = transaction.time,
                                Modifier.padding(end = 10.dp),
                                color = Gray
                            )
                            Text(text = transaction.date, color = Gray)
                        }
                    }
                    Text(text = transaction.amount)
                }
                Spacer(modifier = Modifier.height(10.dp))
                Divider(
                    color = LineColor,
                    thickness = 1.dp,
                )
            }
        }
    }
}