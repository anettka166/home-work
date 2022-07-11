package assignment11_objects;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Book_test {
    public static void main(String[] args) {

        Book detective = new Book("Mystic river", new String[]{"Kolomikin", "Dostoevski", "Bobkin"}, 560, "Detective",
                56.00, 124698.235, 98);

        System.out.println("Title: " + detective.title);
        System.out.println("Author: " + (Arrays.toString(detective.authors)));
        System.out.println("# of pages: " + detective.numberOfPages);
        System.out.println("Type: " + detective.type);
        System.out.println("Price: " + detective.price);
        System.out.println("ISBN: " + detective.isbn);
        System.out.println("Rating: " + detective.rating);

        Book comedy = new Book("Laughing dragon", new String[]{"Svifka", "Dobin"}, 231,
                "comedy", 45.00, 12569.3254, 99);
        System.out.println("Title: " + comedy.title);
        System.out.println("Author: " + (Arrays.toString(comedy.authors)));
        System.out.println("# of pages: " + comedy.numberOfPages);
        System.out.println("Type: " + comedy.type);
        System.out.println("Price: " + comedy.price);
        System.out.println("ISBN: " + comedy.isbn);
        System.out.println("Rating: " + comedy.rating);

        Book drama = new Book("Divorce blooming", new String []{"Kvin"}, 985,
                "drama", 16.25, 5698.1256, 85);

        System.out.println("Title: " + drama.title);
        System.out.println("Author: " + (Arrays.toString(comedy.authors)));
        System.out.println("# of pages: " + drama.numberOfPages);
        System.out.println("Type: " + drama.type);
        System.out.println("Price: " + drama.price);
        System.out.println("ISBN: " + drama.isbn);
        System.out.println("Rating: " + drama.rating);

        Book test = new Book("Lasting bird", new String[]{"Kock", "Babkin"}, 652);
        System.out.println("Title: " + test.title);
        System.out.println("Author: " + (Arrays.toString(test.authors)));
        System.out.println("# of pages: " + test.numberOfPages);
    }
}