package com.example.books

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.books.database.AppDataBase
import com.example.books.database.DATABASE_NAME

class App: Application() {
    companion object {
        lateinit var dataBase: AppDataBase
    }

    override fun onCreate() {
        super.onCreate()
        //Create DB
        dataBase = Room.databaseBuilder(this,
        AppDataBase::class.java,
        DATABASE_NAME).build()
    }
}