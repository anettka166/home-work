package assignment8_loops;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {

        // 10. This exercise is a harder than it looks.
        //          Create a simple program using the Scanner class where you take an input and if the input does not match a condition, it
        //          should keep asking for the input until 3 times and after 3 times it should break saying "Your account is locked. Please
        //          contact Customer Support at 800-122-122-0000". If the user enter correct password, it should greet the user.
        //            username=james.peterson
        //            password=james123!
        //
        //            e.g
        //
        //            Enter Username: hello123
        //            Enter Password: passqeer
        //
        //            You have 2 attempts left
        //            Enter Username: pete.jackson
        //            Enter Password: pete1234
        //
        //            You have 1 attempts left
        //            Enter Username: pete.jackson
        //            Enter Password: pete1234
        //
        //            Sorry. Your account has been locked, please contact Customer Support at 800-000-0000
        //
        //
        //            e.g
        //
        //            Enter Username: hello123
        //            Enter Password: passqeer
        //
        //            You have 2 attempts left
        //            Enter Username: james.peterson
        //            Enter Password: james123!
        //
        //            Success! Welcome to your account Mr.Peterson!

        Scanner scanner = new Scanner(System.in);

        final String userName = "james.peterson";
        final String password = "james123!";

        int attempts = 3;

        while(true) {

            if (attempts > 0) {


                System.out.print(" ENTER YOUR USERNAME: ");
                String userNameInput = scanner.next();

                System.out.print(" ENTER YOUR PASSWORD: ");
                String userPasswordInput = scanner.next();
                attempts--;
                if (userNameInput.equals(userName) && userPasswordInput.equals(password)) {
                    System.out.println("success! welcome to your account".toUpperCase());
                    break;
                } else {
                    System.out.println("incorrect username or password".toUpperCase());
                    if (attempts != 0) {
                        System.out.println("you have ".toUpperCase() + attempts + " left".toUpperCase());
                    }
                }
            } else {
                System.out.println("Your account has been locked, contact Customer Support at 800-000-0000".toUpperCase());
                break;
            }


        }



    }
}
