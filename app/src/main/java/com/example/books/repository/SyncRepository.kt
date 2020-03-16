package com.example.books.repository

import com.example.books.App
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class SyncRepository {

    val bookApi = FakeBookApi()
    val bookDao = App.dataBase.bookDao()

    fun syncBooks() {
        CoroutineScope(Dispatchers.Default).launch {
            Timber.i("Synchronyzing books . . .")
            bookDao.insertBooks(bookApi.loadBooks())
        }
    }
}