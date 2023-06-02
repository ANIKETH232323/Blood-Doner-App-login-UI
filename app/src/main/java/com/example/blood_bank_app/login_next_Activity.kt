package com.example.blood_bank_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class login_next_Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val i = intent.getStringExtra("Name")
//        val h = intent.getStringExtra("Gmail")
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally ,
                modifier = Modifier.fillMaxSize(),
            ) {
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(20.dp),
                    shape = RoundedCornerShape(15.dp),
                ){
                    Column(modifier = Modifier.padding(25.dp)) {
                        Row {
                            Text(text = "Name:", fontSize = 16.sp, fontWeight = FontWeight.Bold)

                            Text(i?: "No Name",fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        }

//                        Row() {
//                            Text(text = "Gmail:",fontSize = 16.sp, fontWeight = FontWeight.Bold)
//
//                            Text(h?: "i",fontSize = 16.sp, fontWeight = FontWeight.Bold)
//                        }
                    }

                }
            }
        }
    }
}
//@Composable
//fun card_view(){
//
//}



//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun GreetingPreview() {
//    card_view()
//}