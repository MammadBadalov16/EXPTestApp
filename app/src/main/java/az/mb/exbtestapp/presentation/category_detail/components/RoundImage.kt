package az.mb.exbtestapp.presentation.category_detail.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun RoundImage(image: Int) {
    Image(
        painter = painterResource(image),
        contentDescription = "avatar",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(CircleShape)
    )
}