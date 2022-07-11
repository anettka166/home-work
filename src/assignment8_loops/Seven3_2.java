package assignment8_loops;

import java.util.Arrays;

public class Seven3_2 {
    public static void main(String[] args) {


        //3. String alphabet = "abcdefghijklmnopqrstuvwxyz";
        //  Split this into a String or char array and print it using the while loop on one line.

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] letters = new char[alphabet.length()];

        for (int i = 0; i < letters.length; i++){
            letters[i] = alphabet.charAt(i);

        }
        System.out.println(Arrays.toString(letters) + " ");

    }



}

