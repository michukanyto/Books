package com.example.books.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.books.dao.IBookDao
import com.example.books.model.Book

const val DATABASE_NAME = "book_db"

@Database (entities = [Book::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun bookDao(): IBookDao
}