package com.yatinagg.coroutineflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.yatinagg.coroutineflow.ui.theme.CoroutineFlowTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlowComponent(countdownFlow())
//
//            CoroutineFlowTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//                }
//            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoroutineFlowTheme {
        Greeting("Android")
    }
}

@Composable
fun FlowComponent(flow: Flow<Int>) {
    val countDownValue by flow.collectAsState(initial = 20)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        when (countDownValue) {
            in 1..20 -> {
                CountdownText("Countdown: $countDownValue")
            }
            else -> {
                CountdownText("MERRY CHRISTMAS!!!!", Color.Magenta)
            }
        }
    }

}

@Composable
fun CountdownText(text: String, color: Color = Color.Black) {
    Text(
        text = text,
        color = color,
        style = TextStyle(
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold
        )
    )
}

fun countdownFlow() = flow<Int> {
    for (i in 19 downTo 0) {
        delay(1000L)
        emit(i)
    }
}
