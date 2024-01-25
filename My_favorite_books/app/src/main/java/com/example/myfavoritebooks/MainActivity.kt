package com.example.myfavoritebooks


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfavoritebooks.ui.theme.MyFavoriteBooksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFavoriteBooksTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BookApp()

                }
            }
        }
    }
}

@Composable
fun BookApp() {
    var currentStep by remember { mutableStateOf(1) }
    val buttonColor = Color(red = 113,  green =71, blue =117)


    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        when (currentStep) {
            1 -> {
                BookPage(
                    image = R.drawable.gone_with_the_wind,
                    bookName = R.string.book_gone_with_the_wind,
                    author = R.string.author_gone_with_the_wind
                )

                Spacer(modifier = Modifier.height(64.dp))

                Row (){
                    Button(
                        onClick = { currentStep = 7 },
                        colors = ButtonDefaults.buttonColors( Color.White,  buttonColor),
                        border = BorderStroke(2.dp, buttonColor),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Previous")
                    }

                    Spacer(modifier = Modifier.width(width = 64.dp))

                    Button(
                        onClick = { currentStep = 2 },
                        colors = ButtonDefaults.buttonColors( buttonColor,  Color.White),
                        modifier = Modifier
                            .width(width = 120.dp)
                        ) {
                        Text("Next")
                    }
                }




            }

            2 -> {
                BookPage(
                    image = R.drawable.martin_eden,
                    bookName = R.string.book_martin_eden,
                    author = R.string.author_martin_eden
                )

                Spacer(modifier = Modifier.height(64.dp))

                Row (){
                    Button(
                        onClick = { currentStep = 1 },
                        colors = ButtonDefaults.buttonColors( Color.White,  buttonColor),
                        border = BorderStroke(2.dp, buttonColor),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Previous")
                    }

                    Spacer(modifier = Modifier.width(width = 64.dp))

                    Button(
                        onClick = { currentStep = 3 },
                        colors = ButtonDefaults.buttonColors( buttonColor,  Color.White),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Next")
                    }
                }

            }

            3 -> {
                BookPage(
                    image = R.drawable.jane_eyre,
                    bookName = R.string.book_jane_eyre,
                    author = R.string.autho_jane_eyre
                )

                Spacer(modifier = Modifier.height(64.dp))

                Row (){
                    Button(
                        onClick = { currentStep = 2 },
                        colors = ButtonDefaults.buttonColors( Color.White,  buttonColor),
                        border = BorderStroke(2.dp, buttonColor),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Previous")
                    }

                    Spacer(modifier = Modifier.width(width = 64.dp))

                    Button(
                        onClick = { currentStep = 4 },
                        colors = ButtonDefaults.buttonColors( buttonColor,  Color.White),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Next")
                    }
                }

            }

            4 -> {
                BookPage(
                    image = R.drawable.the_tenant_of_wildfell_hall ,
                    bookName = R.string.book_the_tenant_of_wildfell_hall,
                    author = R.string.author_the_tenant_of_wildfell_hall
                )

                Spacer(modifier = Modifier.height(64.dp))

                Row (){
                    Button(
                        onClick = { currentStep = 3 },
                        colors = ButtonDefaults.buttonColors( Color.White,  buttonColor),
                        border = BorderStroke(2.dp, buttonColor),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Previous")
                    }

                    Spacer(modifier = Modifier.width(width = 64.dp))

                    Button(
                        onClick = { currentStep = 5 },
                        colors = ButtonDefaults.buttonColors( buttonColor,  Color.White),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Next")
                    }
                }

            }

            5 -> {
                BookPage(
                    image = R.drawable.three_comrades,
                    bookName = R.string.book_three_comrades,
                    author = R.string.author_three_comrades
                )

                Spacer(modifier = Modifier.height(64.dp))

                Row (){
                    Button(
                        onClick = { currentStep = 4 },
                        colors = ButtonDefaults.buttonColors( Color.White,  buttonColor),
                        border = BorderStroke(2.dp, buttonColor),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Previous")
                    }

                    Spacer(modifier = Modifier.width(width = 64.dp))

                    Button(
                        onClick = { currentStep = 6 },
                        colors = ButtonDefaults.buttonColors( buttonColor,  Color.White),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Next")
                    }
                }

            }

            6 -> {
                BookPage(
                    image = R.drawable.perfumer,
                    bookName = R.string.book_perfumer,
                    author = R.string.author_perfumer
                )

                Spacer(modifier = Modifier.height(64.dp))

                Row (){
                    Button(
                        onClick = { currentStep = 5 },
                        colors = ButtonDefaults.buttonColors( Color.White,  buttonColor),
                        border = BorderStroke(2.dp, buttonColor),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Previous")
                    }

                    Spacer(modifier = Modifier.width(width = 64.dp))

                    Button(
                        onClick = { currentStep = 7 },
                        colors = ButtonDefaults.buttonColors( buttonColor,  Color.White),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Next")
                    }
                }

            }

            7 -> {
                BookPage(
                    image = R.drawable.dandelion_wine ,
                    bookName = R.string.book_dandelion_wine , 
                    author = R.string.author_dandelion_wine 
                )

                Spacer(modifier = Modifier.height(64.dp))

                Row (){
                    Button(
                        onClick = { currentStep = 6 },
                        colors = ButtonDefaults.buttonColors( Color.White,  buttonColor),
                        border = BorderStroke(2.dp, buttonColor),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Previous")
                    }

                    Spacer(modifier = Modifier.width(width = 64.dp))

                    Button(
                        onClick = { currentStep = 1 },
                        colors = ButtonDefaults.buttonColors( buttonColor,  Color.White),
                        modifier = Modifier
                            .width(width = 120.dp)
                    ) {
                        Text("Next")
                    }
                }

            }
        }

    }



}

@Composable
fun BookPage(image: Int, bookName: Int, author: Int, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter =  painterResource(id = image),
            contentDescription = stringResource(id = bookName),
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .clip(shape = RoundedCornerShape(32.dp))
        )
        
        Spacer(modifier = Modifier.height(height = 4.dp))
        
        Text(
            text = stringResource(id = bookName),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id =author),
            fontSize = 16.sp
        )
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        BookApp()
}