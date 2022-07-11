package assignment8_loops;

public class Three1 {

    public static void main(String[] args) {

        // 3. Given an int array [6,3,6,5,12,67,98,1,-8,56,42,75,23], print the elements of this array using
        //       the while loop in reverse order

        int [] nums = {6,3,6,5,12,67,98,1,-8,56,42,75,23 };
        int i = nums.length -1;//index of last number
            while (i >= 0){
            System.out.println(nums[i] + " ");
            i--;
        }






    }
}
