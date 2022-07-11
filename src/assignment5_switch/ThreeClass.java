package assignment5_switch;

import java.util.Scanner;

public class ThreeClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("WELCOME TO TECHCENTURE T-SHIRTS!");
        System.out.println();
        System.out.println("       --------- MENU --------");
        System.out.println(" sdet   |    ba    |   ml   |   ai ");
        System.out.println(" $23.56 |  $17.99  | $28.56 | $45.12 ");
        System.out.println();

        System.out.print("WHICH T-SHIRT WOULD YOU LIKE TO BUY TODAY? ");
        String type = scanner.next().toLowerCase();
        System.out.println();

        double price = 0;
        double taxRate = 0;
        double tax = 0;
        double amount = 0;
        double subtotalPrice = 0;
        double totalPrice = 0;

        switch (type) {
            case "sdet":
                System.out.println("YOUR OPTION IS: " + type);
                System.out.print("How many " + type + " T-Shirts would you like to buy?: ");
                amount = scanner.nextInt();
                price = 23.56;
                subtotalPrice = price * amount;
                totalPrice = subtotalPrice * tax + subtotalPrice;

                if (amount >= 1 && amount <= 5) {
                    tax = 0.07;

                } else if (amount >= 6 && amount <= 10) {
                    tax = 0.04;

                } else if (amount > 10) {
                    tax = 0.02;

                } else {
                    System.out.println("PLEASE ENTER A VALID AMOUNT OF T-SHIRTS");
                    return;
                }
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + subtotalPrice);
                System.out.println(" TAXES: " + tax*100 + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + totalPrice);
                break;

            case "ba":
                System.out.println("YOUR OPTION IS: " + type);
                System.out.print("How many " + type + " T-Shirts would you like to buy?: ");
                amount = scanner.nextInt();
                price = 17.99;
                subtotalPrice = price * amount;
                totalPrice = subtotalPrice * tax + subtotalPrice;

                if (amount >= 1 && amount <= 5) {
                    tax = 0.09;

                } else if (amount >= 6 && amount <= 10) {
                    tax = 0.06;

                } else if (amount > 10) {
                    tax = 0.03;

                } else {
                    System.out.println("PLEASE ENTER A VALID AMOUNT OF T-SHIRTS");
                    return;
                }
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + subtotalPrice);
                System.out.println(" TAXES: " + tax*100 + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + totalPrice);
                break;

            case "ml":
                System.out.println("YOUR OPTION IS: " + type);
                System.out.print("How many " + type + " T-Shirts would you like to buy?: ");
                amount = scanner.nextInt();
                price = 28.56;
                subtotalPrice = price * amount;
                totalPrice = subtotalPrice * tax + subtotalPrice;

                if (amount >= 1 && amount <= 5) {
                    tax = 0.12;

                } else if (amount >= 6 && amount <= 10) {
                    tax = 0.09;

                } else if (amount > 10) {
                    tax = 0.045;

                } else {
                    System.out.println("PLEASE ENTER A VALID AMOUNT OF T-SHIRTS");
                    return;
                }
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + subtotalPrice);
                System.out.println(" TAXES: " + tax*100 + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + totalPrice);
                break;

            case "ai":
                System.out.println("YOUR OPTION IS: " + type);
                System.out.print("How many " + type + " T-Shirts would you like to buy?: ");
                amount = scanner.nextInt();
                price = 45.12;
                subtotalPrice = price * amount;
                totalPrice = subtotalPrice * tax + subtotalPrice;

                if (amount >= 1 && amount <= 5) {
                    tax = 0.10;

                } else if (amount >= 6 && amount <= 10) {
                    tax = 0.07;

                } else if (amount > 10) {
                    tax = 0.035;

                } else {
                    System.out.println("PLEASE ENTER A VALID AMOUNT OF T-SHIRTS");
                    return;
                }
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + subtotalPrice);
                System.out.println(" TAXES: " + tax*100 + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + totalPrice);
                break;


            default:
                System.out.println(" PLEASE CHOOSE FROM THE OPTIONS ABOVE ");
                return;


                    }

        System.out.println();
        System.out.println("WOULD YOU LIKE TO MAKE A PURCHASE?: YES / NO" );
        String answer = scanner. next();
        String decision = answer.toUpperCase();
        switch (decision) {
            case "YES":
                System.out.println(" THANK YOU FOR YOUR BUSINESS. HAVE A GREAT DAY!");
                break;
            case "NO":
                System.out.println(" Thank you for your time. Have a good day!");
                break;
            default:
                System.out.println(" Please enter only YES or NO ");
                break;
        }





































    }
}
