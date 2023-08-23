package az.mb.exbtestapp.presentation.home.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import az.mb.exbtestapp.presentation.home.HomeViewModel
import az.mb.exbtestapp.ui.theme.Blue
import az.mb.exbtestapp.ui.theme.Green
import az.mb.exbtestapp.ui.theme.Orange
import az.mb.exbtestapp.ui.theme.Orange2
import az.mb.exbtestapp.ui.theme.Red2
import az.mb.exbtestapp.ui.theme.SkyBlue
import az.mb.exbtestapp.ui.theme.White

@Composable
fun Circle(
    clickedIndex: State<Int>,
    viewModel: HomeViewModel = hiltViewModel(),
    onClick: () -> Unit
) {
    var index = clickedIndex.value
    var category = viewModel.state.value.card!!.categories[index]
    var items = category.expenseAmount.split("\\s".toRegex())

    val strokeWidth: Dp = 25.dp
    val strokeWidthBig: Dp = 35.dp


    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(330.dp)
            .background(White)
            .padding(10.dp)
    ) {
        Canvas(modifier = Modifier.size(330.dp)) {

            drawArc(
                color = Green,
                startAngle = -90f,
                sweepAngle = 95f,
                useCenter = false,
                style = Stroke(strokeWidthBig.toPx(), cap = StrokeCap.Butt)
            )
            drawArc(
                color = Blue,
                startAngle = 6f,
                sweepAngle = 50f,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Butt)
            )
            drawArc(
                color = SkyBlue,
                startAngle = 57f,
                sweepAngle = 75f,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Butt)
            )
            drawArc(
                color = Red2,
                startAngle = 133f,
                sweepAngle = 50f,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Butt)
            )
            drawArc(
                color = Orange,
                startAngle = 184f,
                sweepAngle = 45f,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Butt)
            )
            drawArc(
                color = Orange2,
                startAngle = 230f,
                sweepAngle = 39f,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Butt)
            )
        }
        Box() {
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "${category.name} ${category.percent}")
                Spacer(modifier = Modifier.height(7.dp))
                Text(
                    text = "${items[0]} ${items[1]}",
                    style = (MaterialTheme.typography.titleLarge),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 40.sp
                )
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "AZN / month")
                Spacer(modifier = Modifier.height(7.dp))
                Text(
                    modifier = Modifier
                        .clickable {
                            onClick()
                        },
                    text = "View Statement",
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}
