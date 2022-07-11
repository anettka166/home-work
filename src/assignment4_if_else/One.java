package assignment4_if_else;

public class One {
    public static void main(String[] args) {

        if (true) {
            System.out.println("1st if block");
            if (true) {
                System.out.println("2nd if block");
            } else {
                System.out.println("2nd else block");
            }
            if (false) {
                System.out.println("2nd if block");
            } else {
                System.out.println("2nd else block");
            }
        } else {
            System.out.println("1st else block");
        }

    }
}