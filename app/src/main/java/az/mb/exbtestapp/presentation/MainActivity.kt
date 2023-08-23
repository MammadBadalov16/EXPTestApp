package az.mb.exbtestapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import az.mb.exbtestapp.presentation.home.HomeScreen
import az.mb.exbtestapp.ui.theme.EXBTestAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EXBTestAppTheme {

                HomeScreen()

            }
        }
    }
}


