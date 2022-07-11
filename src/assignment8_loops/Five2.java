package assignment8_loops;

import java.util.Arrays;
import java.util.Scanner;

public class Five2 {
    public static void main(String[] args) {

//5. Using the Scanner class take a String input from the console and using the FOR loop, insert each
//        character from the String input into a char array
//
//        e.g
//        Enter Input: hello and welcome
//        result: [h, e, l, l, o, , a, n, d, , w, e, l, c, o, m, e]

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        char [] letters = new char[input.length()];

        for( int i = 0; i < input.length(); i++){
            letters[i] =  input.charAt(i);
        }

        System.out.print(Arrays.toString(letters));


    }
}
