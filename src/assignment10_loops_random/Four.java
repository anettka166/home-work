package assignment10_loops_random;

import java.util.Arrays;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {

// 4. Take an int number from the Scanner called num.
// Create an int array and loop it and while looping insert all the values from 1 to num included.
//
//        e.g
//        Enter num: 6
//
//        [1,2,3,4,5,6]
//
//        Enter num: 15
//        [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int [] nums = new int[number];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
                System.out.println(Arrays.toString(nums));

        }



    }

