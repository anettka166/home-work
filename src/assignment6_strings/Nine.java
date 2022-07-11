package assignment6_strings;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        int length = input.length();

        String firstChar = input.substring(0);
        String lastChar = input.substring(length-1);

        String result = input.substring(1, (length-1)).toUpperCase();
        System.out.println(result);




















    }
}
