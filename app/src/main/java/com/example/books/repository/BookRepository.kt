package com.example.books.repository

import androidx.annotation.Keep
import androidx.work.*
import timber.log.Timber
import java.util.concurrent.TimeUnit

class BookRepository {

    private val constraints = Constraints.Builder()
        .setRequiredNetworkType(NetworkType.CONNECTED)


//    fun syncBookNow() {
//        Timber.i("Synchronizing books now . . .")
//        val work = OneTimeWorkRequestBuilder<SyncRepositoryWorker>()
//            .setConstraints(constraints)
//            .build()
//
//        WorkManager.getInstance()
//            .beginUniqueWork("SyncBooksNow", ExistingWorkPolicy.KEEP, work)
//            .enqueue()
//    }
//
//
//    fun syncBooksSchedule() {
//        Timber.i("Synchronizing books now . . .")
//        val work = PeriodicWorkRequestBuilder<SyncRepositoryWorker>(12,TimeUnit.HOURS)
//            .setConstraints(constraints)
//            .build()
//
//        WorkManager.getInstance()
//            .enqueueUniquePeriodicWork("SynBookSchedule",
//            ExistingPeriodicWorkPolicy.KEEP,
//            work)
//
//    }
}

