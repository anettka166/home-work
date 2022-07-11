package assignment8_loops;

import java.util.Scanner;

public class Six3 {
    public static void main(String[] args) {

        //Create a simple program that takes a String argument from the console using the Scanner class, and counts
        //        how many numbers exist in that String
        //
        //        e.g
        //        Enter Input: Hell6 and 4wel1come!
        //        Result: You have 3 numbers!
        //
        //        e.g
        //        Enter Input: My name is Kevin
        //        Result: You have 0 number!

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        char [] characters = new char[input.length()];

        int nums = 0;

        for (int i = 0; i < input.length(); i++){
            characters[i] = input.charAt(i);
            if( Character.isDigit(characters[i])) {
                nums = nums + 1;
            }
        }


        System.out.println("YOU HAVE " + nums + " NUMBERS");


    }
}
