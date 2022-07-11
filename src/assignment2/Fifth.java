package assignment2;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("sentence 1: ");
        String sentence1 = scanner.next();
        scanner.next();// must be used in order to take only first word before the space

        System.out.print("sentence 2: ");
        String sentence2 = scanner.next();
        scanner.next();

        System.out.print("sentence 3: ");
        String sentence3 = scanner.next();

        System.out.print("sentence 4: ");
        String sentence4 = scanner.next();
        scanner.next();

        System.out.print("sentence 5: ");
        String sentence5 = scanner.next();
        scanner.next();

        System.out.print("\n" + "Result is: " + sentence1 + " " + sentence2 + " " + sentence3 + " " + sentence4 + " "
                + sentence5 );


    }
}
