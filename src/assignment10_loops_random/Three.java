package assignment10_loops_random;

public class Three {

    public static void main(String[] args) {

// 3. Given an int array [65,3,34,19,67,44], print the average value.
// Hint: Iterate this loop to calculate the sum of items in the array
//        and divide it by the number of values in the array

        int [] nums = {65,3,34,19,67,44};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
           sum = sum + nums[i];

        }
        double avg = (double) (sum/nums.length);
        System.out.println(avg);







    }
}
