package assignment3;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("PLEASE ENTER YOUR SCORE: ");
        int score = scanner.nextInt();

        if(score >=90 && score <=100){
            System.out.println("YOUR GRADE IS A");
        }
        else if(score >=80 && score <=89){
            System.out.println("YOUR GRADE IS B");
        }
        else if (score >=70 && score <=79) {
            System.out.println("YOUR GRADE IS C");
        }
        else if (score >=60 && score <=69) {
            System.out.println("YOUR GRADE IS D");
        }
        else if (score>= 0 && score <60) {
            System.out.println("YOUR GRADE IS F");
        }
        else {
            System.out.println("INVALID INPUT, PLEASE ENTER FROM 0 TO 100");
            System.exit(1);
        }


    }
}
