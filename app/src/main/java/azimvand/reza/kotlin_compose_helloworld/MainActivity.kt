package azimvand.reza.kotlin_compose_helloworld

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import azimvand.reza.kotlin_compose_helloworld.ui.theme.KotlincomposehelloworldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlincomposehelloworldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp)
                    ) {
                        DisplayHelloWorld()
                    }
                }
            }
        }
    }
}

@Composable
fun DisplayHelloWorld() {
    val txtDisplay = remember {
        mutableStateOf("")
    }

    Button(onClick = {
        txtDisplay.value = "hello world!"
    }) {
        Text(text = "display hello world!")
    }
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = txtDisplay.value,
        fontSize = 18.sp,
        color = Color.Black
    )
}