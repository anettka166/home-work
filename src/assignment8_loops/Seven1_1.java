package assignment8_loops;

import java.util.Arrays;

public class Seven1_1 {
    public static void main(String[] args) {

//1.  String names = "James Isaac Robert Pete Jules Henry Warren Victor";
//            Split it in to a String array and sort it alphabetically.
        String [] names = {"James, Isaac, Robert, Pete, Jules, Henry, Warren, Victor"};
        String [] nameEach = new String[names.length];

        int i = 0;
        while(i < names.length) {
            nameEach[i] = names[i];
            i++;
            Arrays.sort(nameEach);
        }


        System.out.println(Arrays.toString(nameEach));









    }
}
