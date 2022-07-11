package assignment6_strings;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        int length = input.length();

        int half = length/2;
        String firstHalf = input.substring(0, half);
        String secondHalf = input.substring(half, length);

        System.out.println(secondHalf + firstHalf);








    }
}