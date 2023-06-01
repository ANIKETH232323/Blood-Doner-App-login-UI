package com.example.blood_bank_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.background(Color.Red))
            FrontPage()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FrontPage(){

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.Red)
            .fillMaxHeight()
        ) {
        Image(painter = painterResource(id = R.drawable.r), contentDescription = "Blood")
        val tex = remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = tex.value,
            onValueChange ={
                tex.value = it
            },
            label = {
                Text(text = "Enter Your Name")
            },
            leadingIcon = {
                Icon(painter = painterResource(id =R.drawable.baseline_email_24),
                    contentDescription = "Email")
            }
        )

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefultPreview(){
    FrontPage()
}
