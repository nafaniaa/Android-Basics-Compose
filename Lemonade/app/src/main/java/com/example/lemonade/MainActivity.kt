package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                App()
            }
        }
    }
}

@Composable
fun LemonApp() {
    var currentStep by remember { mutableStateOf(1) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        when(currentStep){
            1 -> {
                //first page
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                    Image(
                        painterResource(R.drawable.lemon_tree),
                        stringResource(R.string.lemon_tree),
                        modifier = Modifier
                            .background(
                                color = colorResource(R.color.image_background_color),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .width(width = 250.dp)
                            .height(height = 250.dp)
                            .wrapContentSize()
                            .clickable {
                                currentStep = 2
                            })
                    Text(
                        stringResource(R.string.lemon_tree ),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 16.dp)


                    )
                }
            }
            2 -> {
                //second page
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                    Image(
                        painterResource(R.drawable.lemon_squeeze),
                        stringResource(R.string.lemon),
                        modifier = Modifier
                            .background(
                                color = colorResource(R.color.image_background_color),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .width(width = 250.dp)
                            .height(height = 250.dp)
                            .wrapContentSize()
                            .clickable {
                                currentStep = (2..3).random()
                            })
                    Text(
                        stringResource(R.string.lemon),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 16.dp))
                }
            }
            3 -> {
                //third page
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                    Image(
                        painterResource(R.drawable.lemon_drink),
                        stringResource(R.string.glass_of_lemonade),
                        modifier = Modifier
                            .background(
                                color = colorResource(R.color.image_background_color),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .width(width = 250.dp)
                            .height(height = 250.dp)
                            .wrapContentSize()
                            .clickable {
                                currentStep = 4
                            })
                    Text(
                        stringResource(R.string.glass_of_lemonade ),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 16.dp))
                }
            }
            4 -> {
                //fourth page
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ){
                    Image(
                        painterResource(R.drawable.lemon_restart),
                        stringResource(R.string.empty_glass),
                        modifier = Modifier
                            .background(
                                color = colorResource(R.color.image_background_color),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .width(width = 250.dp)
                            .height(height = 250.dp)
                            .wrapContentSize()
                            .clickable {
                                currentStep = 1
                            })
                    Text(
                        stringResource(R.string.empty_glass ),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 16.dp))
                }
            }
        }
    }
}

@Composable
fun Header(){
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .fillMaxWidth()
            .background(colorResource(R.color.image_background_color))
    ) {
        Text(
            text = "Lemonade",
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            modifier = Modifier
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun App() {
    LemonadeTheme {
        Column {
            Header()
            LemonApp()
        }

    }
}