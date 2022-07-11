package assignment8_loops;


import java.util.Arrays;
import java.util.Scanner;

public class Five1 {
    public static void main(String[] args) {

        //5. Using the Scanner class take a String input from the console and using the while loop, insert each
        //        character from the String input into a char array
        //
        //        e.g
        //        Enter Input: hello and welcome
        //        result: [h, e, l, l, o, , a, n, d, , w, e, l, c, o, m, e]

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        char [] letters = new char[input.length()];
        int i = 0;
             while(i < input.length()){
                letters[i] =  input.charAt(i);
                 i++;
         }
        System.out.println("Result: " + Arrays.toString(letters));

//   second approach:
 //       Scanner scanner = new Scanner(System.in);

//        System.out.print("ENTER INPUT: ");
//        String input = scanner.nextLine();

//        int length = input.length();

//        char [] letters = new char[length];
//        int i = 0;
//        while(i < length){
//        char c =  input.charAt(i);
//        letters[i] = c;
//        i++;
 //   }
  //      System.out.println(Arrays.toString(letters));


    }
}
