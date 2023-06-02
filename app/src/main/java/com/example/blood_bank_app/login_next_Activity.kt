package com.example.blood_bank_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blood_bank_app.ui.theme.BloodBankAppTheme
import com.example.blood_bank_app.ui.theme.Purple40
import java.util.jar.Attributes
import java.util.jar.Attributes.Name

class login_next_Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val i = intent.getStringExtra("Name")
        val h = intent.getStringExtra("Gmail")
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
                    Column(modifier = Modifier.padding(15.dp)) {
                        Row {
                            Text(text = "Name:", fontSize = 16.sp, fontWeight = FontWeight.Bold)

                            Text(i?: "No Name",fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        }

                        Row() {
                            Text(text = "Gmail:",fontSize = 16.sp, fontWeight = FontWeight.Bold)

                            Text(h?: "i",fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        }
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