package assignment3;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO TECHCENTURE MOVIE THEATER");
        System.out.print("WHAT IS YOUR AGE? ");

        int age = scanner.nextInt();
        int ticketPrice = 25;

        if(age >=3 && age <=9){
            System.out.println("BASED ON YOUR AGE YOU SHOULD PAY: " + ticketPrice );
        }
        else if(age >=10 && age <=15) {
            System.out.println("BASED ON YOUR AGE YOU SHOULD PAY: " + ((ticketPrice * 0.03) + ticketPrice));
        }
        else if(age >=16 && age <=20) {
            System.out.println("BASED ON YOUR AGE YOU SHOULD PAY: " + ((ticketPrice * 0.07) + ticketPrice));
        }
        else if(age >=21 && age <=28) {
            System.out.println("BASED ON YOUR AGE YOU SHOULD PAY: " + ((ticketPrice * 0.09) + ticketPrice));
        }
        else if(age >=29) {
            System.out.println("BASED ON YOUR AGE YOU SHOULD PAY: " + ((ticketPrice * 0.1) + ticketPrice));
        }
        else{
            System.out.println("WE DO NOT SELL TICKETS.");
        }





    }
}
