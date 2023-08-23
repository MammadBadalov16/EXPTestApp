package az.mb.exbtestapp.presentation.home.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import az.mb.exbtestapp.ui.theme.White2

@Composable
fun CategoryIcon(
    color: Color,
    iconId: Int,
) {
    val strokeWidth: Dp = 4.dp

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(50.dp)
    ) {
        Canvas(modifier = Modifier.size(50.dp)) {

            drawArc(
                color = White2,
                startAngle = -90f,
                sweepAngle = 360f,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round),
            )

            drawArc(
                color = color,
                startAngle = -90f,
                sweepAngle = 360 * 0.60f,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round),

                )
        }
        Icon(
            modifier = Modifier.size(30.dp),
            painter = painterResource(id = iconId),
            contentDescription = "Category Icon",
            tint = color
        )
    }
}






