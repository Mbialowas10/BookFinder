package com.mbialowas.bookfinder.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.mbialowas.bookfinder.BookDataSet
import com.mbialowas.bookfinder.BookModel


@Composable
fun BookList(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Book List", fontWeight = FontWeight.Bold)

        LazyColumn{
            items(BookDataSet.bookList){
            }
        }
    }
}