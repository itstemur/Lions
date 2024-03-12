package com.tz.btmonitor.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.leo.animalhunt.infoab.R
import com.tz.btmonitor.ui.navigation.Screen


@Composable
fun BlogListScreen(navController: NavController) {
    BlogListScreenContent(onClick = { index ->
        navController.navigate(Screen.Blog.route.replace("{index}", index.toString()))
    })
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BlogListScreenContent(onClick: (index: Int) -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Lions") })
        }
    ) {
        Column(
            modifier = Modifier.padding(top = it.calculateTopPadding()).fillMaxSize(),
            verticalArrangement = Arrangement.Center,

            ) {
            BlogItem(
                image = R.drawable.strongest_types_of_lions,
                title = "Types of lions in Africa"
            ) {
                onClick(0)
            }
            Spacer(modifier = Modifier.height(8.dp))
            BlogItem(image = R.drawable.types_of_lions, title = "Types of lions around a world") {
                onClick(1)
            }
            Spacer(modifier = Modifier.height(8.dp))
            BlogItem(image = R.drawable.white_lion, title = "Lion population") {
                onClick(2)
            }
            Spacer(modifier = Modifier.height(8.dp))
            BlogItem(image = R.drawable.lions_we_must_save, title = "Lions we must save") {
                onClick(3)
            }
            Spacer(modifier = Modifier.height(8.dp))
            BlogItem(image = R.drawable.lionhunt, title = "Lions as hunters") {
                onClick(4)
            }
        }
    }
}

@Composable
fun BlogItem(image: Int, title: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(color = 0xFFE3F2FD))
            .clickable(onClick = onClick)
            .padding(all = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = image), contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(50.dp)
                .clip(shape = RoundedCornerShape(size = 16.dp))
        )

        Spacer(modifier = Modifier.width(16.dp))

        Text(text = title, style = MaterialTheme.typography.titleSmall)
    }
}

@Preview
@Composable
fun BlogListScreenPreview() {
    BlogListScreenContent(onClick = {})
}