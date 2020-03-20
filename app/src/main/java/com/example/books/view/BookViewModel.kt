package com.example.books.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.books.App
import com.example.books.model.Book

class BookViewModel: ViewModel() {

    val books: LiveData<List<Book>> = App.dataBase.bookDao().getAllBooks()

    fun refreshBooks() {
        App.repository.syncBooks()
    }
}