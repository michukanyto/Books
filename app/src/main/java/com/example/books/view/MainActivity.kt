package com.example.books.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.books.R
import com.example.books.model.Book
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : AppCompatActivity(), BookListAdapter.BookListAdapterListener {
    lateinit var books: MutableList<Book>
    lateinit var bookListAdapter: BookListAdapter
    lateinit var viewModel: BookViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        books = mutableListOf()

        bookListAdapter = BookListAdapter(books,this)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = bookListAdapter
        }

        swipeRefresh.setOnRefreshListener { viewModel.refreshBooks() }

        viewModel = ViewModelProviders.of(this).get(BookViewModel::class.java)
        viewModel.books.observe(this, Observer { listOfBooks -> updateBooks(listOfBooks) })
    }

    fun updateBooks(listOfBooks: List<Book>) {
        Timber.d("List of books")
        books.clear()
        books.addAll(listOfBooks)
        bookListAdapter.notifyDataSetChanged()
        swipeRefresh.isRefreshing = false
    }

    override fun onBookSelected(book: Book) {
        TODO("Not yet implemented")
    }
}
