package az.mb.exbtestapp.presentation.home.components


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import az.mb.exbtestapp.R
import az.mb.exbtestapp.domain.model.Category
import az.mb.exbtestapp.ui.theme.Gray2
import az.mb.exbtestapp.ui.theme.LineColor
import az.mb.exbtestapp.ui.theme.Orange
import az.mb.exbtestapp.ui.theme.White


@Composable
fun CategoryItem(
    category: Category,
    onItemClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(White)
            .clickable { onItemClick() },
        contentAlignment = Alignment.Center

    ) {
        Row(
            Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically

        ) {

            Spacer(modifier = Modifier.width(5.dp))
            CategoryIcon(color = category.color, iconId = category.iconId)
            Spacer(modifier = Modifier.width(15.dp))

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Spacer(modifier = Modifier.height(0.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {

                    Box(modifier = Modifier.weight(2f)) {
                        Text(
                            text = category.name,
                            style = MaterialTheme.typography.titleSmall,
                            maxLines = 2
                        )
                    }

                    Row(
                        modifier = Modifier.weight(2f),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {

                        Text(
                            text = "${category.percent}",
                            style = MaterialTheme.typography.bodySmall,
                            color = Gray2
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Icon(
                            modifier = Modifier.size(5.dp),
                            imageVector = ImageVector.vectorResource(id = R.drawable.ic_circle),
                            contentDescription = "Icon",
                            tint = Orange
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "${category.expenseAmount}",
                            style = MaterialTheme.typography.bodySmall,
                            color = Gray2
                        )
                    }
                }

                Divider(
                    color = LineColor,
                    thickness = 1.dp,
                )
            }
        }
    }
}




