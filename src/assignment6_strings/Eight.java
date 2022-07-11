package assignment6_strings;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        int length = input.length();

        String firstTwoChars = input.substring(0, 2);
        int firstTwoChars1 = firstTwoChars.length();

        String lastTwoChars = input.substring(length-2);
        int lastTwoChars2 = lastTwoChars.length();

        int sum = firstTwoChars1 + lastTwoChars2;

        if (sum ==4){
            System.out.println(firstTwoChars + lastTwoChars);

        }else{
            System.out.println(input);
        }











    }
}
