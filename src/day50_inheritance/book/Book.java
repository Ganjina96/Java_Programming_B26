package day50_inheritance.book;

public class Book {

    String title;
    Author author;
    String genre;
    int chapters;
    double price;
    boolean hasAMovie;

}

/*
we originally had String author
but this was only a String type, so it could only have characters
We made a separate Author class so be able to define the info of an Author better
that allowed us to replace the string author with Author
-----> Author author
        becomes an instance variable it belongs to the object of the class which were Book objects
    summary: Give us more info about the author besides just a name
 */


/*
Create a Book class

    - create variables:
        title, author, genre, chapter, price, has a movie
 */