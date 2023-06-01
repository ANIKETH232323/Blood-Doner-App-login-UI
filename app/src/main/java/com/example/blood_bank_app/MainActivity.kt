package com.example.blood_bank_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.node.modifierElementOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.blood_bank_app.ui.theme.BloodBankAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FrontPage()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FrontPage(){
    Box(modifier = Modifier.background(Color.Red))
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
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
                Icon(imageVector = Icons.Filled.Email,
                    contentDescription ="Email-icon" )
            }
        )

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefultPreview(){
    FrontPage()
}
