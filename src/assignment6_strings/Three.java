package assignment6_strings;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER FULL NAME: ");
        String fullName = scanner.nextLine();
        String [] splitName = fullName.split(" ");
        String lastName = splitName[1];

        System.out.print("GENDER (M/F): ");
        String gender = scanner.next();
        char genderInput = gender.toUpperCase().charAt(0);

        if (genderInput == 'M'){
            System.out.println("HELLO MR. " + lastName.toUpperCase());
        }else{
            System.out.print("MARRIED?: ");
            String marriage = scanner.next();
            char marriageInput = marriage.toUpperCase().charAt(0);
            if(marriageInput == 'Y'){
                System.out.println("HELLO MRS." + lastName.toUpperCase());
            }
            else{
                System.out.println("HELLO MS." + lastName.toUpperCase());
            }
        }















    }
}
