package assignment12_objects;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;

public class DebitCard {
    private String nameOnCard;
    private final long cardNumber;//  (should be 16 digits)
    private final long securityCode;//  (should be 3 or 4 digits)
    private String bankName; //(Name of Bank which issued the card e.g Bank of America)
    private String validThru; // (e.g 02/23)
    private double balance; // (value can be between 100 to 500 dollars)
    private final double overDraftLimit = -1000; // (Overdraft limit should be -1000)
    private DecimalFormat decimalFormat = new DecimalFormat("0.00");



    public DebitCard(String nameOnCard, long cardNumber, long securityCode, String bankName, String validThru) {
        this.nameOnCard = nameOnCard;
        if(String.valueOf(cardNumber).length() ==16){
        this.cardNumber = cardNumber;
        }else{
            throw new IllegalArgumentException("Card number should be 16 digits");
        }

        if(String.valueOf(securityCode).length() ==3 ||
        String.valueOf(securityCode).length() ==4){
            this.securityCode = securityCode;
        }else{
            throw new IllegalArgumentException("Security cod should be 3 to 4 digits");
        }
        String[] allowedBanks = Banks.ALLOWED_BANKS;
        boolean allowedBank = false;
        for (int i = 0; i < allowedBanks.length; i++) {
            if (allowedBanks[i].equals(bankName)) {
                this.bankName = bankName;
                break;
            } else {
                throw new IllegalArgumentException("Bank name is not valid: " + bankName);
            }
        }
        this.validThru = validThru;
        this.balance = Double.parseDouble(decimalFormat.format((Math.random() * ( 500 - 100 ) + 100)));

        //first approach:
//        int min = 100;
//        int max = 500;
//        double balance = Math.random()*(max-min) + min;
// second approach:
      //  Random random = new Random();
     //   double balance = 100 + random.nextInt(501-100);


    }

    //this method should print all details about Customer Name, Bank Name, Balance and Overdraft
    public void printCardDetails(){
        System.out.println("\n---------Customer information--------");
        System.out.println("Customer's Full Name: " + this.nameOnCard.toUpperCase());
        System.out.println("Bank Name: " + this.bankName.toUpperCase());
        System.out.println("Balance: " + this.balance);
        System.out.println("Overdraft: " + this.overDraftLimit);
        System.out.println("Expiration date " + this.validThru);
        System.out.println();
    }

     //this method will take cash amount in double and subtract from the balance.
     // Validate the amount first before deducting from the balance
    public void getCash(double cashAmount){
        if(cashAmount < 0){
            System.out.println("Withdrawal can NOT be negative! Please enter a valid amount");
            return;
        }
        System.out.println("Please wait, CASH WITHDRAWAL of $" + cashAmount + "  is in progress...");
        if(balance - cashAmount < overDraftLimit) {
            System.out.println("Unfortunately, you exeeded allowed overdraft limit. This transaction has been cancelled");
            return;
        }else{
            balance = balance - cashAmount;
            System.out.println("CASH WITHDRAWAL of " + cashAmount + " was successful! Your new balance is: " + balance);
        }

     }

     //this method will take cash amount in double and add to the balance.
    // Validate the amount first before adding to the balance.
    public void depositCash(double cashAmount){
        System.out.println("Please wait, CASH DEPOSIT of $" + cashAmount + "  is in progress...");
        if(cashAmount < 0){
            System.out.println("DEPOSIT can NOT be negative! Please enter a valid amount");
            return;
        }else {
            balance = balance + cashAmount;
            System.out.println("CASH DEPOSIT of " + cashAmount + " was successful! Your new balance is: " + balance);
        }
    }

    //this method will take String check in this format "Pay to the Order of Jack Smith $1250.00".
    // The method should extract the money as double, validate and add to the balance.

    public void depositCheck(String check){
        System.out.println("Please wait, CHECK DEPOSIT is in progress...");
        if(check.toLowerCase().contains(nameOnCard.toLowerCase())) {
            String[] split = check.split(" ");
            String amount = split[split.length - 1];
            String amountStr = amount.replace("$", "");
            double amountDouble = Double.parseDouble(amountStr);
            if (amountDouble < 0) {
                System.out.println("Cannot deposit negative amount of " + amountDouble);
            } else {
                balance = balance + amountDouble;
                System.out.println("CHECK DEPOSIT of $" + amountDouble + " was successful! Your new balance is: " + balance);
            }
        }else{
            throw new IllegalArgumentException("Illegal check detected");
            }

    }

    //this method will take a String argument called name, and it should replace the CardHolder Name on the Card.
    // But before you change the name of CardHolder make sure the new name argument
    // has at least 5 characters (Hint: Use String methods to validate)

    public void changeNameOnCard(String newName){
        System.out.println("Please hold while we are validating your name....");
        if(newName.length() < 5) {
            System.out.println("Please enter a valid Name");
            return;
        }else {
            this.nameOnCard = newName;
            System.out.println("You name on the card has been changed successfully to: " + nameOnCard);
        }
        }
        public void changeExpiration(String newExpiration){
        this.validThru = newExpiration;
            System.out.println("Expiration date was changed successfully");
        }


    }













