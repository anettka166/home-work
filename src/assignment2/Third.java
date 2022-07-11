package assignment2;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.print("Enter your state: ");
        String state = scanner.nextLine();

        System.out.print("Enter your occupation: ");
        String occupation = scanner.nextLine();

        System.out.print("Enter your hobby: ");
        String hobby = scanner.nextLine();

        String result = "Our new member is " + firstName + " " + lastName + " from " + city + "," + state +"."
                +" He is " + age + " years and works as a " + occupation + ". " + "His hobby is " + hobby + "."
                + " Welcome to our club " + firstName + ".";
        System.out.println ("\n" + result);













    }
}
