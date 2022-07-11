package assignment7_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENNTER FIRST NAME:");
        String firstName = scanner.nextLine();

        System.out.print("ENNTER MIDDLE NAME:");
        String middleName = scanner.nextLine();

        System.out.print("ENNTER LAST NAME:");
        String lastName = scanner.nextLine();

        String [] name = new String[3];
        name [0] = firstName;
        name [1] = middleName;
        name [2] = lastName;
        System.out.println(Arrays.toString(name));

        // second option

        String[] fullName = {firstName, middleName, lastName};
        System.out.println(Arrays.toString(name));

        //another example
        String name1 =" Anna Sophia Starr";
        String[] arra = name1.split(" ");
        System.out.println((arra[0]));
        System.out.println(arra[1]);
        System.out.println(arra[2]);

        //another example

        String date = "Jan/12/1990";
        String [] dob = date.split("/");
        System.out.println(Arrays.toString(dob));

















    }
}
