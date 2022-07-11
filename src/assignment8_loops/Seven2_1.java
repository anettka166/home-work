package assignment8_loops;

import java.util.Arrays;

public class Seven2_1 {
    public static void main(String[] args) {

        // 2.  String dob = "March/23/1980";
        //            Split this this dob into a String array and print it on the console but convert the month to uppercase

        String dob = "March/23/1980";
        String dobUpper = dob.toUpperCase();
        String [] split = dobUpper.split("/");
        System.out.println(Arrays.toString(split));













    }
}
