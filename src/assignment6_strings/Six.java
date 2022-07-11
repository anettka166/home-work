package assignment6_strings;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        int length = input.length();
        int halfLength = length / 2;

        String firstHalf = input.substring(0, halfLength );
        String secondHalf = input.substring(halfLength);

        boolean equals = firstHalf.equals(secondHalf);

        if (length % 2 ==0){
            if (equals){
                System.out.println("YES!");
            }else{
                System.out.println("NO!");
            }

        }else{
            System.out.println("WORD MUST CONTAIN EVEN NUMBER OF CHARACTERS");
        }










    }
}
