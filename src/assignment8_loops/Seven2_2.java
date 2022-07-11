package assignment8_loops;

import java.util.Arrays;

public class Seven2_2 {
    //2.  String dob = "March/23/1980";
    //   Split this this dob into a String array and print it on the console but convert the month to uppercase
    public static void main(String[] args) {

        String dob = "March/23/1980";
        String [] splitDob = dob.split("/");

        String [] split = new String[splitDob.length];

        for(int i = 0; i < split.length; i++){
            split[i] = splitDob[i];
            split[0] = splitDob[0].toUpperCase();

        }
        System.out.println(Arrays.toString(split));




    }
}
