package assignment7_arrays;

import java.util.Arrays;

public class One {
    public static void main(String[] args) {

        String name ="Anna";

        char[] letters = new char[ name.length() ];// [ , , , ,]
        letters[0] = name.charAt(0);// [ A, , , ,]
        letters[1] = name.charAt(1);// [ A, n , , ,]
        letters[2] = name.charAt(2);
        letters[3] = name.charAt(3);

        System.out.println(Arrays.toString(letters));











    }
}
