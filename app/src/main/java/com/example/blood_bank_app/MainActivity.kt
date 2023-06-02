package com.example.blood_bank_app

import android.content.Intent
import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import java.time.format.TextStyle


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
            .fillMaxHeight(),
        ) {
        Image(painter = painterResource(id = R.drawable.r), contentDescription = "Blood")
        val tex = remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = tex.value,
            maxLines = 1,
            onValueChange ={
                tex.value = it
            },
            label = {
                Text(text = "Enter Your Name",fontWeight = FontWeight.Bold
                )
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Black
            ),
            leadingIcon = {
                Icon(painter = painterResource(id =R.drawable.baseline_person_24),
                    contentDescription = "Email")
            }
        )
        val tex1 = remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = tex1.value,
            maxLines = 1,
            onValueChange ={
                tex1.value = it
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Black
            ),
            label = {
                Text(text = "Enter Your Gmail-Id",
                    fontWeight = FontWeight.Bold
                )
            },
            leadingIcon = {
                Icon(painter = painterResource(id =R.drawable.baseline_email_24),
                    contentDescription = "Email")
            }
        )
        Spacer(modifier = Modifier.size(30.dp))
        val context = LocalContext.current
        Button(onClick = {

                val nav = Intent(context,login_next_Activity::class.java)
                context.startActivity(nav)
            }, colors = ButtonDefaults.buttonColors(Color.Black)) {
                Text(text = "Sign Up",
                    fontWeight = FontWeight.Bold,

                )
            }
        Spacer(modifier = Modifier.size(15.dp))
        Text(text = "Or SIgn In WIth", fontWeight = FontWeight.Bold,
            fontSize = 17.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.size(20.dp))
        Image(painter = painterResource(id = R.drawable.google4), contentDescription ="Google Icon" ,
            modifier = Modifier
                .width(85.dp)
                .height(50.dp)
            )



    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefultPreview(){
    FrontPage()
}
