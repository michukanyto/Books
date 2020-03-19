package com.example.books.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.books.R
import timber.log.Timber

class BookDetailActivity : AppCompatActivity() {

    companion object {
        val BOOK_ID = "book_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_book)

        val bookId = intent.getIntExtra(BOOK_ID,1)
        Timber.d("\nBook ID ----> $bookId")
    }
}
