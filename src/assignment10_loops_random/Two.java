package assignment10_loops_random;

import java.util.Arrays;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        //2. Using the Scanner class, ask from the User the size of an int array and start looping it and while looping,
        // fill in this array
        //       with random values from 0 to 100 using the Random class or Math class
        //
        //       e.g
        //       What is the size of your array: 5
        //
        //       [23,64,12,78,56]


        Scanner scanner = new Scanner(System.in);

        System.out.println("Size of youe array: ");
        int size = scanner.nextInt();

        int [] nums = new int[size];

        final int min = 0;
        final int max = 100;

        for (int i = 0; i < nums.length; i++) {
            int random = (int)(Math.random()*(max-min)) + min;
            nums[i]  = random;
            System.out.println(Arrays.toString(nums));

        }














    }
}
