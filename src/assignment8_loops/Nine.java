package assignment8_loops;

import java.util.Arrays;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {

// 9. Using the Scanner class, take an input for the size of the array and create a String array called movies and pass
//        that int size to that String array as the size. Then using the while loop, insert movie names into that array. Once done,
//        sort the array and print the movie array using the while loop. Do not use Arrays.toString method
//
//        e.g
//        How many movies will you need? 3
//        Enter movie 1: John Wick
//        Enter movie 2: Despicable Me
//        Enter movie 3: Interstellar
//
//        Despicable Me Interstellar John Wick

        Scanner scanner = new Scanner(System.in);


        System.out.print(" How many movies will you need? ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        String[] movies = new String[amount];

        if(amount > 10){
            System.out.println("too many movies. Limit is 10".toUpperCase());
        }else if(amount< 1){
            System.out.println("size should be at least 1".toUpperCase());
        }


        for (int i = 0; i < movies.length; i++) {

            System.out.print("Enter movie: " + (i+1) + ": ");
            String movie = scanner.nextLine();
            movies[i] = movie;

        }

        Arrays.sort(movies);

        for( int i = 0; i < movies.length; i++){
            System.out.print(movies[i] + " | ");
        }






















    }
}
