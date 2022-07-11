package assignment5_switch;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("PLEASE ENTER YOUR GRADE: " );

        String grade = scanner.next().toUpperCase();

        switch (grade){
            case "A":
                System.out.println(" EXCELLENT! ");
                break;
            case "B":
            case "C":
                System.out.println(" WELL DONE! ");
                break;
            case "D":
                System.out.println("YOU PASSED! ");
                break;
            case "F":
                System.out.println("TRY HARDER");
                break;
            default:
                System.out.println("INVALID GRADE");
                break;


        }











    }
}
