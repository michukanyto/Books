package com.example.books.repository

import androidx.work.Worker
import com.example.books.App
import timber.log.Timber

//class SyncRepositoryWorker : Worker() {
//    override fun doWork(): Result {
//        Timber.i("Synchronyzing books . . .")
//        val bookApi = FakeBookApi()
//        val bookDao = App.dataBase.bookDao()
//
//        bookDao.insertBooks(bookApi.loadBooks())
//
//        return Result.success()
//    }
//}

class SyncRepositoryWorker {

}