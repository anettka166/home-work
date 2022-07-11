package assignment6_strings;

import java.util.Scanner;

public class Twelve2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO TECHCENTURE FRUITS");
        System.out.print("PLEASE ENTER YOUR EMPLOYEE DISCOUNT OR ENTER X TO SKIP TO GUEST SHOPPING: ");
        String input1 = scanner.nextLine();

        String discountCode = input1.toUpperCase();
        System.out.println("INPUT: " + discountCode);
        System.out.println();
        System.out.println("---------------------- MENU----------------------");
        System.out.println("fruit code     fruit         per pound       tax");
        System.out.println("    f1         banana           $5.00         2%");
        System.out.println("    f2         apple            $3.90         1%");
        System.out.println("    f3         strawberry       $7.50         3%");
        System.out.println("    f4         kiwi             $6.20         1.5%");
        System.out.println("    f5         orange           $5.70         2.5%");

        double discount;
        double pricePerPound;
        double tax;
        double subTotal;
        double totalPrice;
        double taxAmount;
        double discountAmount;
        double priceAfterDiscount;
        String f1 = "banana";
        String f2 = "apple";
        String f3 = "strawberry";
        String f4 = "kiwi";
        String f5 = "orange";

        switch (discountCode) {
            case ("EMP1234"):
            case ("EMP0012"):
            case ("EMP9111"):
            case ("EMP7889"):
                discount = 0.2;
                System.out.println("GREAT! WE WILL APPLY " + (discount * 100) + " DISCOUNT ON ALL YOUR FRUIT PURCHASES");
                System.out.print("ENTER FRUIT CODE (e.g f1): ");
                String input = scanner.nextLine();
                String fruitCode = input.toLowerCase();

                if(fruitCode.contains("f1")){
                    System.out.print(" HOW MANY POUNDS of " + f1 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 5;
                        tax = 0.02;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }

                }
                else if (fruitCode.contains("f2")) {
                    System.out.print(" HOW MANY POUNDS of " + f2 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 3.9;
                        tax = 0.01;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }
                else if (fruitCode.contains("f3")) {
                    System.out.print(" HOW MANY POUNDS of " + f3 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0) {
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                        pricePerPound = 7.50;
                        tax = 0.03;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }
                else if (fruitCode.contains("f4")) {
                    System.out.print(" HOW MANY POUNDS of " + f4 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 6.20;
                        tax = 0.015;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }

                else if (fruitCode.contains("f5")) {
                    System.out.print(" HOW MANY POUNDS of " + f5 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 5.7;
                        tax = 0.025;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }

                }else {
                    System.out.println("PLEASE ENTER A VALID FRUIT CODE");
                    System.exit(1);
                }
                break;
            case ("MGR1444"):
            case ("MGR2122"):
            case ("MGR9021"):
            case ("MGR6541"):
                discount = 0.3;
                System.out.println("GREAT! WE WILL APPLY " + (discount * 100) + " DISCOUNT ON ALL YOUR FRUIT PURCHASES");
                System.out.print("ENTER FRUIT CODE (e.g f1): ");
                String input2 = scanner.nextLine();
                String fruitCode2 = input2.toLowerCase();
                if(fruitCode2.contains("f1")){
                    System.out.print(" HOW MANY POUNDS of " + f1 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 5;
                        tax = 0.02;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }

                }
                else if(fruitCode2.contains("f2")){
                    System.out.print(" HOW MANY POUNDS of " + f2 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 3.9;
                        tax = 0.01;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }
                else if(fruitCode2.contains("f3")){
                    System.out.print(" HOW MANY POUNDS of " + f3 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 7.50;
                        tax = 0.03;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }
                else if(fruitCode2.contains("f4")){
                    System.out.print(" HOW MANY POUNDS of " + f4 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 6.20;
                        tax = 0.015;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }
                else if(fruitCode2.contains("f5")){
                    System.out.print(" HOW MANY POUNDS of " + f5 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 5.7;
                        tax = 0.025;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }

                }else {
                    System.out.println("PLEASE ENTER A VALID FRUIT CODE");
                    System.exit(1);
                }
                break;

            case ("CEO3333"):
            case ("CEO2222"):
            case ("CEO1111"):
                discount = 0.5;
                System.out.println("GREAT! WE WILL APPLY " + (discount * 100) + " DISCOUNT ON ALL YOUR FRUIT PURCHASES");
                System.out.print("ENTER FRUIT CODE (e.g f1): ");
                String input3 = scanner.nextLine();
                String fruitCode3 = input3.toLowerCase();
                if(fruitCode3.contains("f1")){
                    System.out.print(" HOW MANY POUNDS of " + f1 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 5;
                        tax = 0.02;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }

                }
                else if(fruitCode3.contains("f2")){
                    System.out.print(" HOW MANY POUNDS of " + f2 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 3.9;
                        tax = 0.01;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }
                else if(fruitCode3.contains("f3")){
                    System.out.print(" HOW MANY POUNDS of " + f3 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 7.50;
                        tax = 0.03;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }
                else if(fruitCode3.contains("f4")){
                    System.out.print(" HOW MANY POUNDS of " + f4 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 6.20;
                        tax = 0.015;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }
                else if(fruitCode3.contains("f5")){
                    System.out.print(" HOW MANY POUNDS of " + f5 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 5.7;
                        tax = 0.025;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }

                }else {
                    System.out.println("PLEASE ENTER A VALID FRUIT CODE");
                    System.exit(1);
                }
                break;

            case ("X"):
                discount = 0;
                System.out.println("WE WILL PROCEEDE WITHOUT AN ENPLOYEE DISCOUNT");
                System.out.print("ENTER FRUIT CODE (e.g f1): ");
                String input4 = scanner.nextLine();
                String fruitCode4 = input4.toLowerCase();
                if(fruitCode4.contains("f1")){
                    System.out.print(" HOW MANY POUNDS of " + f1 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                    }else {
                        pricePerPound = 5;
                        tax = 0.02;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }

                }
                else if(fruitCode4.contains("f2")){
                    System.out.print(" HOW MANY POUNDS of " + f2 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 3.9;
                        tax = 0.01;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }
                else if(fruitCode4.contains("f3")){
                    System.out.print(" HOW MANY POUNDS of " + f3 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 7.50;
                        tax = 0.03;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }
                else if(fruitCode4.contains("f4")){
                    System.out.print(" HOW MANY POUNDS of " + f4 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 6.20;
                        tax = 0.015;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }
                }
                else if(fruitCode4.contains("f5")){
                    System.out.print(" HOW MANY POUNDS of " + f5 + "  WOULD YOU LIKE TO BUY?: ");
                    int pounds = scanner.nextInt();
                    if(pounds <=0){
                        System.out.println("PLEASE ENTER A CORRECT AMOUNT OF POUNDS");
                        System.exit(1);
                    }else {
                        pricePerPound = 5.7;
                        tax = 0.025;
                        subTotal = pricePerPound * pounds;
                        taxAmount = subTotal * tax;
                        totalPrice = taxAmount + subTotal;
                        discountAmount = totalPrice * discount;
                        priceAfterDiscount = totalPrice - (totalPrice * discount);
                        System.out.println();
                        System.out.println("------------YOUR CART-----------");
                        System.out.println("    SUBTOTAL:        " + subTotal);
                        System.out.println("       TAXES:        " + taxAmount);
                        System.out.println("EMP DISCOUNT:        " + "-" + discountAmount);
                        System.out.println("                                ");
                        System.out.println("       TOTAL:        " + priceAfterDiscount);
                    }

                }else {
                    System.out.println("PLEASE ENTER A VALID FRUIT CODE");
                    System.exit(1);
                }
                break;

            default:
                System.out.println("PLEASE ENTER A VALID DISCOUNT CODE!");
                System.exit(1);

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

