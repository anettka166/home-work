package assignment6_strings;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();

        int length = input.length();

        String lastChar = input.substring(length-1);

        boolean a = lastChar.contains("a");
        boolean e = lastChar.contains("e");
        boolean y = lastChar.contains("y");
        boolean i = lastChar.contains("i");
        boolean o = lastChar.contains("o");
        boolean u = lastChar.contains("u");
        if(a || e || y || i || o || u){
            System.out.println(input.toUpperCase());
        }else{
            System.out.println(input.toLowerCase());
        }









    }
}
