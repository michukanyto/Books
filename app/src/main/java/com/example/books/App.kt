package com.example.books

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.books.database.AppDataBase
import com.example.books.database.DATABASE_NAME
import com.example.books.repository.BookRepository
import com.example.books.repository.SyncRepository
import timber.log.Timber

class App: Application() {
    companion object {
        lateinit var dataBase: AppDataBase
        lateinit var repository: SyncRepository
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        //Create DB
        dataBase = Room.databaseBuilder(this,
        AppDataBase::class.java,
        DATABASE_NAME).build()
        repository = SyncRepository()
        repository.syncBooks()
    }
}