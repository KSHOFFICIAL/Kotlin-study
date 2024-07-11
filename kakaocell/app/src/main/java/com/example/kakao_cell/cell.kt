package com.example.kakao_cell


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class cell(val name : String, var notReadableNum : Int, var chatText : Array<String>){
    val contentDescription : String = "Profile Image"

    @Composable
    fun DrawCell(modifier: Modifier){
        val painter : Painter = painterResource(id = R.drawable.ic_launcher_background);
       Surface(
           modifier = modifier
               .fillMaxWidth()
               .height(80.dp)
               .padding(20.dp, 10.dp)
       ) {
           Row (
               modifier = modifier
                   .fillMaxSize(),
               horizontalArrangement = Arrangement.spacedBy(10.dp)
           ){
               Box(modifier = modifier
                   .weight(0.15f)
                   .fillMaxHeight()
                   .padding(0.dp, 5.dp),

                   ){
                   Image(
                       modifier = modifier
                           .clip(RoundedCornerShape(20.dp)),
                       painter = painter,
                       contentDescription = contentDescription,
                       contentScale = ContentScale.Crop
                   )
               }


               Box(modifier = modifier
                   .weight(0.85f)
                   .fillMaxHeight(),
               )
               {
                   Column (
                       modifier = modifier
                           .fillMaxSize(),
                       verticalArrangement = Arrangement.Center

                   ){
                       Row (
                           modifier = modifier
                               .fillMaxWidth(),
                           horizontalArrangement = Arrangement.SpaceBetween,
                           verticalAlignment = Alignment.Bottom
                       ) {
                           Text(
                               text = name,
                               fontSize = 14.sp,
                               fontWeight = FontWeight.Bold
                           )
                           Text(
                               text = "오전 11:12",
                               fontSize = 12.sp,
                               color = Color.Gray
                           )
                       }

                       Row (
                           modifier = modifier
                               .fillMaxWidth()
                               .padding(0.dp, 2.dp),
                           horizontalArrangement = Arrangement.SpaceBetween,
                           verticalAlignment = Alignment.Top
                       ){
                           Text(
                               text = chatText[0],
                               fontSize = 12.sp,
                               color = Color.Gray
                           )
                           if (notReadableNum != 0){
                               Text(
                                   text = notReadableNum.toString(),
                                   fontSize = 10.sp,
                                   color = Color.White,
                                   modifier = modifier
                                       .background(Color.Red, shape = CircleShape)
                                       .padding(7.dp, 3.dp)
                               )
                           }
                       }

                   }
               }

           }
       }
   }
}