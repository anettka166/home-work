package assignment3;

import java.util.Scanner;

public class ThreeClass {
    public static void main(String[] args) {
        //3. Techcenture Books is a store that sells the following types of books. Below
        //    is the information about the code that each type is associated with, price of each book, and tax details.
        //    More complex than it seems
        //
        //    CODE  | TYPE OF BOOKS   |  PRICE  | TAX
        //    1100    Science Fiction     $40     10%
        //    1211    Fiction             $35     12%
        //    1120    Comic               $50      9%
        //    1212    Horror              $30     17%
        //    1001    Fantasy             $25     10%
        //    2111    Detective           $28      5%
        //
        //    e.g
        //    WELCOME TO TECHCENTURE BOOKSTORE
        //    PLEASE ENTER CODE: 1100
        //    HOW MANY SCIENCE FICTION BOOKS DO YOU WANT TO BUY: 3
        //    3 BOOKS AT $40 EACH WITH 10% WILL BE $132
        //    ARE YOU READY TO MAKE PURCHASE
        //    1. yes  2. no
        //    PURCHASE: yes
        //    THANK YOU FOR YOUR PURCHASE!
        // */
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO TECHCENTURE BOOKSTORE");
        System.out.println("--------HERE ARE OUR BOOKS--------");
        System.out.println("CODE  | TYPE OF BOOKS   |  PRICE  | TAX\n" +
                "1100    Science Fiction     $40     10%\n" +
                "1211    Fiction             $35     12%\n" +
                "1120    Comic               $50      9%\n" +
                "1212    Horror              $30     17%\n" +
                "1001    Fantasy             $25     10%\n" +
                "2111    Detective           $28      5%");

        System.out.print("ENTER CODE: ");

        int code = scanner.nextInt(); //user enters code
        String type = "";
        double price = 0;
        double tax = 0;
        int count = 0;
        double totalPrice = 0;

        switch (code){
            case 1100:
                type = "SCIENCE FICTION";
                price = 40;
                tax = 0.1;
                break;
            case 1211:
                type = "FICTION";
                price = 35;
                tax = 0.12;
                break;
            case 1120:
                type = "COMIC";
                price = 50;
                tax = 0.09;
                break;
            case 1212:
                type = "Horror";
                price = 30;
                tax = 0.17;
                break;
            case 1001:
                type = "FANTASY";
                price = 25;
                tax = 0.1;
                break;
            case 2111:
                type = "DETECTIVE";
                price = 28;
                tax = 0.05;
                break;
            default:
                System.out.println("INVALID BOOK CODE. PLEASE TRY AGAIN LATER");
                break;
        }

        System.out.print("HOW MANY " + type + " BOOKS WOULD YOU LIKE TO BUY? " );
        count = scanner.nextInt(); //40

        if (count > 0 ){
            //3 BOOKS AT $40 EACH WITH 10% WILL BE $132
            //                      total tax       +   total price
            totalPrice = (price * tax * count) + price * count;
            System.out.println(count + " BOOKS AT $" + price + " EACH WITH " + (tax*100) +  "% WILL BE $" + totalPrice );
            System.out.print("ARE YOU READY TO MAKE PURCHASE? (y/n) ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("y")){
                System.out.println("THANK YOU FOR YOUR PURCHASE!");
            }else if(answer.equalsIgnoreCase("n")){
                System.out.println("NO WORRIES. WE HAVE SAVED YOUR BOOKS IN CASE YOU CHANGE YOUR MIND");
            }else{
                System.out.println("INVALID INPUT. PLEASE TRY AGAIN LATER");
            }
        }else{
            System.out.println("INVALID COUNT WAS ENTERED");
        }



    }
}
