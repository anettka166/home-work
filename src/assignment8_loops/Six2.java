package assignment8_loops;

import java.util.Scanner;

public class Six2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        int nums = 0;
        int i = 0;

        do {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                nums++;
            }
        }while (i < input.length()) ;

            System.out.println("You have " + nums + " numbers");

        }

        }

