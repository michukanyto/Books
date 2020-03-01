package com.example.books.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val title: String,
    val author: String,
    val summary: String,
    @ColumnInfo(name = "picture_url")
    val pictureUrl: String

)