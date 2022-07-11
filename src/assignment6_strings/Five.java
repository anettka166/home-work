package assignment6_strings;


import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER INPUT: ");

        String input = scanner.nextLine().toLowerCase();

        // can use line 15 instead of boolean
        //if(input.contains ("a") || input.contains ("e") || input.contains ("i"){


        boolean a = input.contains("a");
        boolean e = input.contains("e");
        boolean i = input.contains("i");

        if(a || e || i){
            System.out.println("YES THERE IS A VOWEL");
        }else{
            System.out.println("NO!");
        }






    }
}