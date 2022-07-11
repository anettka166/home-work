package assignment7_arrays;

import java.util.Arrays;

public class Six {

    public static void main(String[] args) {

        int [] numbers = {1, 4, 10, 13, 2};
        numbers[0] = ++numbers[0];
        numbers[1] = ++numbers[1];
        numbers[2] = ++numbers[2];
        numbers[3] = ++numbers[3];
        numbers[4] = ++numbers[4];

        System.out.println(Arrays.toString(numbers));






    }
}
