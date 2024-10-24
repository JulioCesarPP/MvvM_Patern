package mx.edu.uttt.mvvm_patern

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mx.edu.uttt.mvvm_patern.ui.theme.MvvM_PaternTheme
import mx.edu.uttt.mvvm_patern.viewModels.LoteriaViewModel
import mx.edu.uttt.mvvm_patern.views.LoteriaView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: LoteriaViewModel by viewModels()

        setContent{
            MvvM_PaternTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    LoteriaView(viewModel = viewModel)
                }
            }
        }
    }
}