package az.mb.exbtestapp.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import az.mb.exbtestapp.R
import az.mb.exbtestapp.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun <T> ExposedMenu(
    myArray: Array<T>, iconId: Int?, onClick: (Int) -> Unit
) {

    var isExpanded by remember {
        mutableStateOf(false)
    }

    var value by remember {
        mutableStateOf(myArray[0].toString())
    }

    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = { isExpanded = it },
        modifier = Modifier.clip(RoundedCornerShape(10.dp))

    ) {
        if (iconId == null) {
            TextField(value = value, onValueChange = {}, readOnly = true, trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.drop_down_menu_icon),
                    contentDescription = "Menu Icon"
                )
            }, colors = ExposedDropdownMenuDefaults.textFieldColors(
                focusedIndicatorColor = White,
                unfocusedIndicatorColor = White,
                unfocusedContainerColor = White,
                focusedContainerColor = White
            ), modifier = Modifier.menuAnchor()
            )
        } else {
            TextField(
                value = value,
                onValueChange = {},
                readOnly = true,
                leadingIcon = {
                    Image(
                        painter = painterResource(id = iconId), contentDescription = "mm"
                    )
                },
                trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.drop_down_menu_icon),
                        contentDescription = "Trailing Icon"
                    )
                },
                colors = ExposedDropdownMenuDefaults.textFieldColors(
                    focusedIndicatorColor = White,
                    unfocusedIndicatorColor = White,
                    unfocusedContainerColor = White,
                    focusedContainerColor = White
                ),
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth(),
            )

        }

        ExposedDropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false },
            modifier = Modifier.background(Color.White)

        ) {

            myArray.forEachIndexed { index, i ->
                DropdownMenuItem(text = {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Row(modifier = Modifier.fillMaxWidth()) {
                            if (iconId != null) {
                                Image(
                                    painter = painterResource(id = iconId),
                                    contentDescription = "mm"
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                            }

                            Text(text = i.toString())
                        }
                    }
                }, onClick = {
                    value = i.toString()
                    isExpanded = false
                    onClick(index)
                }, Modifier.background(color = White)
                )
            }
        }
    }
}

