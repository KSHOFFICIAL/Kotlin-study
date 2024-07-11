package com.example.kakao_cell
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onResume() {
        super.onResume()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStop() {
        super.onStop()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val Dongcell = cell(
            name = "홍길동",
            chatText = arrayOf<String>("안녕", "하세요"),
            notReadableNum = 1,
        )
        setContent {
                // A surface container using the 'background' color from the theme
                Surface {
                    Column {
                        val modifier = Modifier;
                        Dongcell.DrawCell(modifier = modifier)
                    }
                }
        }
    }
}