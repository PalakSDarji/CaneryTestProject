package com.palak.canerytestproject.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.palak.canerytestproject.R
import com.palak.canerytestproject.ui.home.ui.theme.CaneryTestProjectTheme


class ComposeActivity : AppCompatActivity() {

    val isDark: Boolean = false

    val Yellow200 = Color(0xffffeb46)
    val Blue200 = Color(0xff91a4fc)

    val DarkColors = darkColors(
        primary = Yellow200,
        secondary = Blue200,
    )
    val LightColors = lightColors(
        primary = Yellow200,
        secondary = Blue200,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewGreeting()
        }
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = name)
    }

    @Composable
    fun NewsStory() {
        val image = imageResource(id = R.drawable.header)
        MaterialTheme(
            colors = if (isDark) DarkColors else LightColors) {

            Surface(color = Color.Blue) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .background(color = Color.White)
                ) {

                    val imageModifier = Modifier
                        .preferredHeight(180.dp)
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(4.dp))
                    Image(
                        image, modifier = imageModifier,
                        contentDescription = "header",
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.preferredHeight(10.dp))
                    Text(
                        text = "Palak is asjdna sbas aysdyagsuydgayusgdu yiusga diuy gassiudy gasiudyg ausdg iuy asd asdaww",
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.preferredHeight(10.dp))
                    Text(text = "Darji")
                    Text(text = "Suresh")
                }

            }
        }
    }

    @Preview
    @Composable
    fun PreviewGreeting() {
        NewsStory()
    }


}
