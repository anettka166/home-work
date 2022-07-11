package assignment6_strings;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();
        int length = input.length();
        String lastTwoChars = input.substring(length - 2);

        System.out.print("ENTER A COUNT: ");
        int count = scanner.nextInt();

        String result = lastTwoChars.repeat(count);

        System.out.println(result);














    }
}
