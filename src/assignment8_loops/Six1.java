package assignment8_loops;

import java.util.Scanner;

public class Six1 {
    public static void main(String[] args) {

        //6. Create a simple program that takes a String argument from the console using the Scanner class, and counts
        //        how many numbers exist in that String
        //
        //        e.g
        //        Enter Input: Hell6 and 4wel1come!
        //        Result: You have 3 numbers!
        //
        //        e.g
        //        Enter Input: My name is Kevin
        //        Result: You have 0 number!
        //
        //        Hint: In order to determine if a character is a number or not, use the  Character.isDigit() method

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        int nums = 0;
        int i = 0;
        String strNum = "";
        while( i < input.length()) {


            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                nums++;
                strNum = strNum + c;
            }
            i++;
        }

        System.out.println("You have " + nums + " numbers");
        System.out.println("These sre your numbers: " + strNum);

    }
}

