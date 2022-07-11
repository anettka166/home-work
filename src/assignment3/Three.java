package assignment3;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
//        3. Techcenture Books is a store that sells the following types of books. Below
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

        System.out.println("WILCOME TO TECHCENTURE BOOKSTORE!");
        System.out.print("PLEASE ENTER CODE: ");
        int code = scanner.nextInt();//in case the code is very long, so instead of (int) we will use (long)


        if(code ==1100){
            String bookType = "SCIENCE FICTION";
            double price = 40;
            double tax = 0.1;
            int availableAmount = 50;
            System.out.print("HOW MANY " + bookType + " BOOKS WOULD YOU LIKE TOO BUY: ");
            int userAmount = scanner.nextInt();

            //make sure we have enough books && make sure it is not negative
            if(userAmount <= availableAmount && userAmount > 0 ) {

                System.out.println(userAmount + " " + bookType + " BOOKS AT " + price + " $ EACH WITH " + (tax * 100)
                        + " % WILL BE " + (userAmount * ((price * tax) + price)));
                System.out.println("ARE YOU READY TO MAKE A PURCHASE?");
                System.out.print("1. yes     2. no");
                availableAmount = availableAmount - userAmount;
                System.out.println();
                int answer = scanner.nextInt();
                int yes = 1;
                int no = 2;

                if (answer == 1) {
                    System.out.println("PURCHASE: YES");
                    System.out.println("THANK YOU FOR YOUR PURCHASE!");
                } else if (answer == 2) {
                    System.out.println("THANK YOU FOR YOUR TIME, COME BACK SOON!");
                    System.exit(1);
                }
            }else{
                    System.out.println("SORRY, WE DO NOT HAVE ENOUGH BOOKS");
                }
        }
        else if(code ==1211){
            String bookType = "FICTION";
            double price = 35;
            double tax = 0.12;
            int availableAmount = 50;
            System.out.print("HOW MANY " + bookType + " BOOKS WOULD YOU LIKE TOO BUY: ");
            int userAmount = scanner.nextInt();

            //make sure we have enough books && make sure it is not negative
            if(userAmount <= availableAmount && userAmount > 0 ) {

                System.out.println(userAmount + " " + bookType + " BOOKS AT " + price + " $ EACH WITH " + (tax * 100)
                        + " % WILL BE " + (userAmount * ((price * tax) + price)));
                System.out.println("ARE YOU READY TO MAKE A PURCHASE?");
                System.out.print("1. yes     2. no");
                availableAmount = availableAmount - userAmount;
                System.out.println();
                int answer = scanner.nextInt();
                int yes = 1;
                int no = 2;

                if (answer == 1) {
                    System.out.println("PURCHASE: YES");
                    System.out.println("THANK YOU FOR YOUR PURCHASE!");
                } else if (answer == 2) {
                    System.out.println("THANK YOU FOR YOUR TIME, COME BACK SOON!");
                    System.exit(1);
                }
            }else{
                System.out.println("SORRY, WE DO NOT HAVE ENOUGH BOOKS");
            }
        }
        else if(code ==1120){
            String bookType = "COMIC";
            double price = 50;
            double tax = 0.09;
            int availableAmount = 50;
            System.out.print("HOW MANY " + bookType + " BOOKS WOULD YOU LIKE TOO BUY: ");
            int userAmount = scanner.nextInt();

            //make sure we have enough books && make sure it is not negative
            if(userAmount <= availableAmount && userAmount > 0 ) {

                System.out.println(userAmount + " " + bookType + " BOOKS AT " + price + " $ EACH WITH " + (tax * 100)
                        + " % WILL BE " + (userAmount * ((price * tax) + price)));
                System.out.println("ARE YOU READY TO MAKE A PURCHASE?");
                System.out.print("1. yes     2. no");
                availableAmount = availableAmount - userAmount;
                System.out.println();
                int answer = scanner.nextInt();
                int yes = 1;
                int no = 2;

                if (answer == 1) {
                    System.out.println("PURCHASE: YES");
                    System.out.println("THANK YOU FOR YOUR PURCHASE!");
                } else if (answer == 2) {
                    System.out.println("THANK YOU FOR YOUR TIME, COME BACK SOON!");
                    System.exit(1);
                }
            }else{
                System.out.println("SORRY, WE DO NOT HAVE ENOUGH BOOKS");
            }
        }
        else if(code ==1212){
            String bookType = "HORROR";
            double price = 30;
            double tax = 0.17;
            int availableAmount = 50;
            System.out.print("HOW MANY " + bookType + " BOOKS WOULD YOU LIKE TOO BUY: ");
            int userAmount = scanner.nextInt();

            //make sure we have enough books && make sure it is not negative
            if(userAmount <= availableAmount && userAmount > 0 ) {

                System.out.println(userAmount + " " + bookType + " BOOKS AT " + price + " $ EACH WITH " + (tax * 100)
                        + " % WILL BE " + (userAmount * ((price * tax) + price)));
                System.out.println("ARE YOU READY TO MAKE A PURCHASE?");
                System.out.print("1. yes     2. no");
                availableAmount = availableAmount - userAmount;
                System.out.println();
                int answer = scanner.nextInt();
                int yes = 1;
                int no = 2;

                if (answer == 1) {
                    System.out.println("PURCHASE: YES");
                    System.out.println("THANK YOU FOR YOUR PURCHASE!");
                } else if (answer == 2) {
                    System.out.println("THANK YOU FOR YOUR TIME, COME BACK SOON!");
                    System.exit(1);
                }
            }else{
                System.out.println("SORRY, WE DO NOT HAVE ENOUGH BOOKS");
            }
        }
        else if(code ==1001){
            String bookType = "FANTASY";
            double price = 25;
            double tax = 0.1;
            int availableAmount = 50;
            System.out.print("HOW MANY " + bookType + " BOOKS WOULD YOU LIKE TOO BUY: ");
            int userAmount = scanner.nextInt();

            //make sure we have enough books && make sure it is not negative
            if(userAmount <= availableAmount && userAmount > 0 ) {

                System.out.println(userAmount + " " + bookType + " BOOKS AT " + price + " $ EACH WITH " + (tax * 100)
                        + " % WILL BE " + (userAmount * ((price * tax) + price)));
                System.out.println("ARE YOU READY TO MAKE A PURCHASE?");
                System.out.print("1. yes     2. no");
                availableAmount = availableAmount - userAmount;
                System.out.println();
                int answer = scanner.nextInt();
                int yes = 1;
                int no = 2;

                if (answer == 1) {
                    System.out.println("PURCHASE: YES");
                    System.out.println("THANK YOU FOR YOUR PURCHASE!");
                } else if (answer == 2) {
                    System.out.println("THANK YOU FOR YOUR TIME, COME BACK SOON!");
                    System.exit(1);
                }
            }else{
                System.out.println("SORRY, WE DO NOT HAVE ENOUGH BOOKS");
            }
        }
        else if(code ==2111){
            String bookType = "DETECTIVE";
            double price = 28;
            double tax = 0.05;
            int availableAmount = 50;
            System.out.print("HOW MANY " + bookType + " BOOKS WOULD YOU LIKE TOO BUY: ");
            int userAmount = scanner.nextInt();

            //make sure we have enough books && make sure it is not negative
            if(userAmount <= availableAmount && userAmount > 0 ) {

                System.out.println(userAmount + " " + bookType + " BOOKS AT " + price + " $ EACH WITH " + (tax * 100)
                        + " % WILL BE " + (userAmount * ((price * tax) + price)));
                System.out.println("ARE YOU READY TO MAKE A PURCHASE?");
                System.out.print("1. yes     2. no");
                availableAmount = availableAmount - userAmount;
                System.out.println();
                int answer = scanner.nextInt();
                int yes = 1;
                int no = 2;

                if (answer == 1) {
                    System.out.println("PURCHASE: YES");
                    System.out.println("THANK YOU FOR YOUR PURCHASE!");
                } else if (answer == 2) {
                    System.out.println("THANK YOU FOR YOUR TIME, COME BACK SOON!");
                    System.exit(1);
                }
            }else{
                System.out.println("SORRY, WE DO NOT HAVE ENOUGH BOOKS");
            }
        }else{
            System.out.println("CODE DOES NOT EXIST");
        }
                            }
                        }