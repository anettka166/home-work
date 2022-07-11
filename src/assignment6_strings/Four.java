package assignment6_strings;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        int length = input.length();
        int halfLength = length / 2;
        String firstHalf = input.substring(0, halfLength );
        String lastHalf = input.substring(halfLength, length );
        //String lastHalf = input.substring(halfLength);// can use this instead of line 15
        if (length % 2 == 0){
            System.out.println("RESULT IS EVEN: " + firstHalf);

        }else{
            System.out.println(" RESULT IS ODD: " + lastHalf);
        }












    }
}
