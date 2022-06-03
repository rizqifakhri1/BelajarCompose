package com.rizqi.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rizqi.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeTheme(darkTheme = false) { //Buat Matiin darkmode
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
/*                    Greeting("Android")*/
                    HeaderLogin()
                }
            }
        }
    }
}

@Composable
fun HeaderLogin() {
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Login", fontSize = 32.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Image(painter = painterResource(id = R.drawable.login),
            contentDescription = "Image Login",
            Modifier.size(256.dp),
            contentScale = ContentScale.FillBounds
        )
    }
}

/*@Composable
fun InputForm() {
    TextField(value = , onValueChange = )
}*/

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true, device = "id:pixel", showSystemUi = true) //biar tampilan mobile
@Composable
fun DefaultPreview() {
    FirstComposeTheme {
        /*Greeting("Android")*/
        HeaderLogin()
    }
}