package assignment8_loops;

import java.util.Arrays;

public class Seven1_2 {
    //1.  String names = "James Isaac Robert Pete Jules Henry Warren Victor";
    //            Split it in to a String array and sort it alphabetically.

    public static void main(String[] args) {
        String names = "James Isaac Robert Pete Jules Henry Warren Victor";
        String[] splitNames = names.split(" ");

        String [] split = new String[splitNames.length];

        for(int i = 0; i < splitNames.length; i++){
            split[i] = splitNames[i];
            }
        Arrays.sort(split);
        System.out.println(Arrays.toString(split));






    }
}
