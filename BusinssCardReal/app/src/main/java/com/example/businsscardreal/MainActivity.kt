package com.example.businsscardreal

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businsscardreal.ui.theme.BusinssCardRealTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinssCardRealTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(modifier: Modifier = Modifier) {
    BusinssCardRealTheme {
    val image = painterResource(id = R.drawable.sirbasic_0)
        

        Column(
            modifier = Modifier.background(androidx.compose.ui.graphics.Color.Cyan)
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Column (
                verticalArrangement = Arrangement.Center,
                modifier = modifier.padding(8.dp)
            ) {
                Text(
                    text = "Him Global International",
                    fontSize = 50.sp,
                    lineHeight = 40.sp,
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "General Contractor",
                    fontSize = 20.sp,
                    lineHeight = 40.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
            Row(
                modifier = modifier.padding(8.dp)
            ) {
                Column(modifier = Modifier.padding(end = 128.dp)) {
                    Text(
                        text = "Osas Potter"
                    )
                    Text(
                        text = "7349256368"
                    )
                }
                Column(
                    // modifier = modifier.padding(8.dp)
                ) {
                    Text(
                        text = "150 West St. Detroit",
                        modifier = Modifier.align(Alignment.End)
                    )
                    Text(
                        text = "www.himglobal.net",
                        modifier = Modifier.align(Alignment.End)

                    )
                }
            }
        }


        // Greeting("Android")
    }
}