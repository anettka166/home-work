package assignment5_switch;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Three {
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
        String option = scanner.next();
        String type = option.toLowerCase();
        System.out.println();

        switch (option){
        case "sdet":
            System.out.println("YOUR OPTION IS: " + type);
            System.out.print("How many " + type + " T-Shirts would you like to buy?: ");
        {int amount = scanner.nextInt();

            if (amount >= 1 && amount <= 5) {
                double tax = 0.07;
                double price = 23.56;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else if (amount >= 6 && amount <= 10) {
                double tax = 0.04;
                double price = 23.56;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else if (amount > 10) {
                double tax = 0.02;
                double price = 23.56;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else {
                System.out.println("PLEASE ENTER A VALID AMOUNT OF T-SHIRTS");
                return;
            }
            break;}

        case "ba":
            System.out.println("YOUR OPTION IS: " + type);
            System.out.print("How many " + type + " T-Shirts would you like to buy?: ");
        {int amount = scanner.nextInt();

            if (amount >= 1 && amount <= 5) {
                double tax = 0.09;
                double price = 17.99;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else if (amount >= 6 && amount <= 10) {
                double tax = 0.06;
                double price = 17.99;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else if (amount > 10) {
                double tax = 0.03;
                double price = 17.99;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else {
                System.out.println("PLEASE ENTER A VALID AMOUNT OF T-SHIRTS");
                return;
            }
            break;}

        case "ml":
            System.out.println("YOUR OPTION IS: " + type);
            System.out.print("How many " + type + " T-Shirts would you like to buy?: ");
        {int amount = scanner.nextInt();

            if (amount >= 1 && amount <= 5) {
                double tax = 0.12;
                double price = 28.56;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else if (amount >= 6 && amount <= 10) {
                double tax = 0.09;
                double price = 28.56;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else if (amount > 10) {
                double tax = 0.045;
                double price = 28.56;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else {
                System.out.println("PLEASE ENTER A VALID AMOUNT OF T-SHIRTS");
                return;
            }
            break;}

        case "ai":
            System.out.println("YOUR OPTION IS: " + type);
            System.out.print("How many " + type + " T-Shirts would you like to buy?: ");
        {int amount = scanner.nextInt();

            if (amount >= 1 && amount <= 5) {
                double tax = 0.10;
                double price = 45.12;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else if (amount >= 6 && amount <= 10) {
                double tax = 0.07;
                double price = 45.12;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else if (amount > 10) {
                double tax = 0.035;
                double price = 45.12;
                double subtotalPrice = price * amount;
                DecimalFormat df = new DecimalFormat("0.00");
                String roundOffSubtotalPrice = df.format(subtotalPrice);
                double totalPrice = subtotalPrice * tax + subtotalPrice;
                String roundOffTotal = df.format(totalPrice);
                System.out.println(" YOUR SUBTOTAL IS: " + "$" + roundOffSubtotalPrice);
                System.out.println(" TAXES: " + (tax * 100) + " %");
                System.out.println(" YOUR TOTAL PRICE FOR " + amount + " " + type + " T-SHIRTS IS: " + "$"
                        + roundOffTotal);

            } else {
                System.out.println("PLEASE ENTER A VALID AMOUNT OF T-SHIRTS");
                return;
            }
            break;}

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































