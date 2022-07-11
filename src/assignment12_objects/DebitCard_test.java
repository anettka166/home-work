package assignment12_objects;

import java.util.Locale;
import java.util.Scanner;

public class DebitCard_test {

    public static void main(String[] args) {

        DebitCard anna = new DebitCard ("Anna Starr",2562125657884455L, 859,
        "pnc", "04/29");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");

        while(true){
            System.out.println("What would you like to do");
            System.out.println("get cash| deposit | details | rename | quit");
            System.out.println("option: ");
            String option = scanner.nextLine().toLowerCase();
            if(option.equals("cash")){
                System.out.println("Enter cash: ");
                String amount = scanner.nextLine();
                anna.getCash(Double.parseDouble(amount));
                System.out.println();

            }else if(option.equals("details")){
                anna.printCardDetails();
            }else if(option.equals("deposit")){
                System.out.println("deposit cash or check?: ");
                System.out.println("Check/cash: ");
                String deposit = scanner.nextLine().toLowerCase(Locale.ROOT);
                if(deposit.equals("cash")){
                    System.out.println("Enter amount: ");
                    String cash = scanner.nextLine();
                    anna.depositCash(Double.parseDouble(cash));
                }else if(deposit.equals("check")){
                    System.out.println("Enter name on the check: ");
                    String name = scanner.nextLine();
                    System.out.println("Amount for check: ");
                    String amount = scanner.nextLine();
                    String check = "Pay to order of " + name + "$" + amount;
                    anna.depositCheck(check);
                }

            }else if(option.equals("rename")){
                System.out.println("Enter your name: ");
                String newName = scanner.nextLine();
                anna.changeNameOnCard(newName);
            }
            else if (option.equals("quit")){
                System.out.println("Thanks for doing business with us. Have a good day!");
                break;
            }else{
                System.out.println("Invalid input. Try again!\n");
            }
        }

        



    }
}
