package com.example.books.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.books.R
import com.example.books.model.Book
import com.squareup.picasso.Picasso
import timber.log.Timber

class BookListAdapter(private val books: List<Book>,
                      private val listener: BookListAdapterListener
): RecyclerView.Adapter<BookListAdapter.ViewHolder>(), View.OnClickListener {

    interface BookListAdapterListener {
        fun onBookSelected(book: Book)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById<CardView>(R.id.cardView)
        val imageView = itemView.findViewById<ImageView>(R.id.imageView)
        val bookTitle = itemView.findViewById<TextView>(R.id.bookTitleTextView)
        val bookWriter = itemView.findViewById<TextView>(R.id.bookWriterTextView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book_layout,parent,false)

        return ViewHolder(viewItem)

    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = books[position]
        with (holder) {
            cardView.setOnClickListener(this@BookListAdapter)
            cardView.tag = book
            bookTitle.text = book.title
            bookWriter.text = book.author

            Picasso.get()
                .load(book.pictureUrl)
                .placeholder(R.drawable.ic_book_placeholder)
                .into(imageView)
            Timber.d("------>  ${book.pictureUrl}")
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}