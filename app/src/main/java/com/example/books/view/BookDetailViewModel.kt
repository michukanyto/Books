package com.example.books.view

import android.view.animation.Transformation
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.books.App
import com.example.books.model.Book

class BookDetailViewModel(bookID : Int): ViewModel() {
    private val liveDataBook = MutableLiveData<Int>()
    val book:LiveData<Book> = Transformations.switchMap(liveDataBook) {id ->
        App.dataBase.bookDao().getBook(id)
    }

    init {
        liveDataBook.value = bookID
    }
}