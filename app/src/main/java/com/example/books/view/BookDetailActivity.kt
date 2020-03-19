package com.example.books.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.books.R
import com.example.books.model.Book
import timber.log.Timber

class BookDetailActivity : AppCompatActivity() {

    companion object {
        val BOOK_ID = "book_id"
    }
    lateinit var viewModel: BookDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_book)

        val bookId = intent.getIntExtra(BOOK_ID,1)
        Timber.d("\nBook ID ----> $bookId")

        val factory = BookDetailViewModelFactory(bookId)
        viewModel = ViewModelProviders.of(this,factory).get(BookDetailViewModel::class.java)
        viewModel.book.observe(this, Observer { printOutBook(it) })

    }

    private fun printOutBook(book: Book) {

    }
}
