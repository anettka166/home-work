package assignment6_strings;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SOMETHING: ");
        String input = scanner.nextLine();

        int length = input.length();
        if (length % 2 == 0){
            System.out.println("NUMBER OF CHARS: " + length + " (EVEN)");
        }else{
            System.out.println("NUMBER OF CHARS: " + length + " (ODD)");
        }




    }
}
