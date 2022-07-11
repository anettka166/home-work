package assignment7_arrays;

import java.util.Arrays;

public class Seven {
    public static void main(String[] args) {

        int[] numbers = {34, 12, 89, 9, -23};
        numbers[0] = numbers[0]+ 5;
        numbers[1] = numbers[1] - 8;
        numbers[2] = ++numbers[2];
        numbers[3] = numbers[3] * numbers[3];
        numbers[4] = numbers[4]/3;

        System.out.println(Arrays.toString(numbers));







    }
}
