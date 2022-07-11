package assignment11_objects;

public class Book {

    //2. Create a class called Book and have the following properties:
    //        Title, Author, number of pages, Type, price, ISBN, rating
    //        Use variable accordingly to match the type of properties. Create all argument as well as non-argument constructor.
    //        Create a Test class with a main method and create 3 book objects and print their properties
    //
    String title;
    String [] authors;
    int numberOfPages;
    String type;
    double price;
    double isbn;
    int rating;


    public Book(String title, String[] authors, int numberOfPages, String type, double price, double isbn, int rating) {
        this.title = title;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.type = type;
        this.price = price;
        this.isbn = isbn;
        this.rating = rating;
    }




    /**
     *
     * @param title
     * @param authors
     * @param numberOfPages
     */

    public Book(String title, String [] authors, int numberOfPages) {
        this.title = title;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
    }




}
