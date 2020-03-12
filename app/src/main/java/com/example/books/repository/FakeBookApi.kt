package com.example.books.repository

import com.example.books.model.Book

private val BOOKS = listOf<Book>(
    Book(0,"To Kill a Mockingbird",
        "Harper Lee",
        "Published in 1960, this timeless classic explores human behaviour and the collective conscience of The Deep South in the early 20th century. Humour entwines the delicate strands of prejudice, hatred, hypocrisy, love and innocence to create one of the best novels ever written.,",
        "https://en.wikipedia.org/wiki/To_Kill_a_Mockingbird#/media/File:To_Kill_a_Mockingbird_(first_edition_cover).jpg"),
    Book(0,"1984",
        "George Orwell",
        "Although 1984 has passed us by, George Orwell’s dystopian, totalitarian world of control, fear and lies has never been more relevant. Delve into the life of Winston Smith as he struggles with his developing human nature in a world where individuality, freewill and love are forbidden.",
        "https://en.wikipedia.org/wiki/Nineteen_Eighty-Four#/media/File:1984first.jpg"),
    Book(0,"Harry Potter and the Philosopher’s Stone",
        "J.K. Rowling",
        "I’m willing to bet you’ve heard of Harry Potter, but have you read the books? Join Harry Potter as he begins his journey into the world of magic, where he is the celebrated Boy Who Lived. Visit Hogwarts, meet your favourite characters and watch Harry grow into the one of the most famous literary characters in the world.",
        "https://en.wikipedia.org/wiki/Harry_Potter_and_the_Philosopher%27s_Stone_(film)#/media/File:Harry_Potter_and_the_Philosopher's_Stone_banner.jpg"),
    Book(0,"The Lord of the Rings",
        "J.R.R. Tolkien",
        "Middle Earth is a wonderful, expansive fantasy world filled with turmoil, heroes, evil and innocence. Although our protagonist Frodo Baggins’ quest seems impossible to complete, this trilogy is a tale of triumph in the most impossible circumstances.",
        "https://en.wikipedia.org/wiki/The_Lord_of_the_Rings_(film_series)#/media/File:Lotr_logos.png"),
    Book(0,"The Great Gatsby",
        "Scott Fitzgerald",
        "Published in 1925, Fitzgerald’s The Great Gatsby explores the decadence of the Jazz Age, and one man’s introduction into a world where even those with the most indulgent lives cannot earn love.",
        "https://en.wikipedia.org/wiki/The_Great_Gatsby#/media/File:TheGreatGatsby_1925jacket.jpeg"),
    Book(0,"The Book Thief",
        "Markus Zusak",
        "Set in Germany during 1939, The Book Thief follows Liesel as she rescues books from the tyranny of Nazi rule. Meanwhile, her family has hidden a Jewish fighter in their basement and death looks down on the family, narrating our tale. Experience bravery that is rarely found in the world, and friendship that is formed in the most unlikely of situations.",
        "https://en.wikipedia.org/wiki/The_Book_Thief#/media/File:The_Book_Thief_by_Markus_Zusak_book_cover.jpg"),
    Book(0,"Lord of the Flies",
        "William Golding",
        "This classic novel follows the lives of boys marooned on an island as they regress into savages; and their beautiful, enjoyable island existence collapses into a primitive and cruel nightmare.",
        "https://en.wikipedia.org/wiki/Lord_of_the_Flies#/media/File:LordOfTheFliesBookCover.jpg")
)

private const val INDEX = 2

class FakeBookApi {

    fun loadBooks() : List<Book> {
        return BOOKS
    }
}