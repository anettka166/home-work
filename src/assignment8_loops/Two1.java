package assignment8_loops;

import java.util.Scanner;

public class Two1 {

    public static void main(String[] args) {

        //2. Take a String input from the Scanner and using the while loop print, the characters on odd indexes
        //
        //    e.g
        //    Enter input: Welcome
        //    e c m

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        int i = 0;

        while (i < input.length()) {
            if(i % 2 !=0) {
                System.out.print(input.charAt(i) +" ");
            }
                i++;
            }


        }
    }
