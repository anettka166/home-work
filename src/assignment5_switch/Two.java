package assignment5_switch;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO SIMPLE CALCULATOR!");

        System.out.print("PLEASE ENTER YOUR FIRST NUMBER: ");
        double number1 = scanner.nextDouble();

        System.out.print("PLEASE ENTER YOUR SECOND NUMBER: ");
        double number2 = scanner.nextDouble();

        System.out.println("PLEASE CHOSE AN OPERATOR: +  -  *  %  / : ");
        char operator = scanner.next().charAt(0);// or can be String operator = scanner.next();
        double result = 0;

        switch (operator){
            case '+'://   case "+"//if using a String
                result = number1 + number2;
                System.out.println("YOU HAVE CHOSEN ADDITION: ");
                System.out.println(number1 +" + "+  number2 +  "=" + result );
                    break;
            case '-':
                result = number1- number2;
                    System.out.println("YOU HAVE CHOSEN SUBTRACTION: ");
                    System.out.println(number1 +" - "+  number2 +  "=" + result );
                    break;
            case '*':
                result = number1 * number2;
                    System.out.println("YOU HAVE CHOSEN MULTIPLICATION: ");
                    System.out.println(number1 +" * "+  number2 +  "=" + result );
                    break;
            case '%':
                result = number1 % number2;
                System.out.println("YOU HAVE CHOSEN MODULUS: ");
                System.out.println(number1 +" % "+  number2 +  "=" + result );
                break;
            case '/':
                result = number1 / number2;
                System.out.println("YOU HAVE CHOSEN DIVISION: ");
                System.out.println(number1 +" / "+  number2 +  "=" + result );
                break;
            default:
                System.out.println(" PLEASE CHOOSE A VALID OPERATOR FROM ABOVE! ");
                break;

                }


        }


























    }

