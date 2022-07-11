package assignment8_loops;

import java.util.Arrays;

public class Eight1 {
    public static void main(String[] args) {
        //Given an int array [5,67,2,63,90,12,543,3,12],
        // increment even numbers by 2 and odd numbers by 3 using the while loop
        //   and print the result on the console using the while loop (Don't use the Arrays.toString method)

        int [] nums = {5,67,2,63,90,12,543,3,12};
        System.out.println(Arrays.toString(nums));
        int i = 0;

        while(i < nums.length) {
            if (nums[i] % 2 == 0) {
                nums[i] = nums[i] + 2;
            } else {
                nums[i] = nums[i] + 3;
            }
            i++;
        }
            System.out.println(Arrays.toString(nums));


            }

        }










