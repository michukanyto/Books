package com.example.books.repository

import com.example.books.model.Book
import timber.log.Timber

private val BOOKS = listOf<Book>(
    Book(0,"To Kill a Mockingbird",
        "Harper Lee",
        "Published in 1960, this timeless classic explores human behaviour and the collective conscience of The Deep South in the early 20th century. Humour entwines the delicate strands of prejudice, hatred, hypocrisy, love and innocence to create one of the best novels ever written.,",
        "https://d1w7fb2mkkr3kw.cloudfront.net/assets/images/book/lrg/9780/4463/9780446310789.jpg"),
    Book(0,"1984",
        "George Orwell",
        "Although 1984 has passed us by, George Orwell’s dystopian, totalitarian world of control, fear and lies has never been more relevant. Delve into the life of Winston Smith as he struggles with his developing human nature in a world where individuality, freewill and love are forbidden.",
        "https://s3.amazonaws.com/criterion-production/films/9b263f6358cf0bae18244c759d4592f0/BonyZ4taymxrfBiRqY6K42NBh0jsop_large.jpg"),
    Book(0,"Harry Potter and the Philosopher’s Stone",
        "J.K. Rowling",
        "I’m willing to bet you’ve heard of Harry Potter, but have you read the books? Join Harry Potter as he begins his journey into the world of magic, where he is the celebrated Boy Who Lived. Visit Hogwarts, meet your favourite characters and watch Harry grow into the one of the most famous literary characters in the world.",
        "https://images-na.ssl-images-amazon.com/images/I/81YOuOGFCJL.jpg"),
    Book(0,"The Lord of the Rings",
        "J.R.R. Tolkien",
        "Middle Earth is a wonderful, expansive fantasy world filled with turmoil, heroes, evil and innocence. Although our protagonist Frodo Baggins’ quest seems impossible to complete, this trilogy is a tale of triumph in the most impossible circumstances.",
        "https://images-na.ssl-images-amazon.com/images/I/51tW-UJVfHL._SX321_BO1,204,203,200_.jpg"),
    Book(0,"The Great Gatsby",
        "Scott Fitzgerald",
        "Published in 1925, Fitzgerald’s The Great Gatsby explores the decadence of the Jazz Age, and one man’s introduction into a world where even those with the most indulgent lives cannot earn love.",
        "https://images-na.ssl-images-amazon.com/images/I/81af%2BMCATTL.jpg"),
    Book(0,"The Book Thief",
        "Markus Zusak",
        "Set in Germany during 1939, The Book Thief follows Liesel as she rescues books from the tyranny of Nazi rule. Meanwhile, her family has hidden a Jewish fighter in their basement and death looks down on the family, narrating our tale. Experience bravery that is rarely found in the world, and friendship that is formed in the most unlikely of situations.",
        "https://images-na.ssl-images-amazon.com/images/I/9123eop9gIL.jpg"),
    Book(0,"Lord of the Flies",
        "William Golding",
        "This classic novel follows the lives of boys marooned on an island as they regress into savages; and their beautiful, enjoyable island existence collapses into a primitive and cruel nightmare.",
        "https://images-na.ssl-images-amazon.com/images/I/81WUAoL-wFL.jpg")
)

private const val INDEX = 2

class FakeBookApi {
    companion object{
        private var bookIndex = 0
    }
    fun loadBooks() : List<Book> {
        val bookSize = BOOKS.size
        var newBookIndex = (bookIndex + INDEX) % bookSize

        if (newBookIndex == 0) {
            newBookIndex = bookSize
        }
        Timber.i("Book range -----> $bookIndex / $newBookIndex")
        var bookSlice = BOOKS.subList(bookIndex,newBookIndex)

        bookIndex = newBookIndex % bookSize

        return bookSlice
    }

//    fun loadBooks(): List<Book> {
//         return BOOKS
//    }
}