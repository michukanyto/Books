package com.example.books.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.books.model.Book

@Dao
interface IBookDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insertBook(book : Book)

    @Insert
    fun insertBooks(books: List<Book>)

    @Query("SELECT * FROM book")
    fun getAllBooks(): LiveData<List<Book>>

    @Query("SELECT * FROM book WHERE title = :bookTitle")
    fun getBook(bookTitle: String): LiveData<Book>
}