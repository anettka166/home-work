package assignment8_loops;

public class Four1 {

    public static void main(String[] args) {
        // 3. Given an int array [6,3,6,5,12,67,98,1,-8,56,42,75,23], print the EVEN elements of this array using
        // the while loop in reverse order

        int [] nums = {6,3,6,5,12,67,98,1,-8,56,42,75,23 };
        int i = nums.length -1;//index of last number
        while (i >= 0){
            if(nums[i] % 2 ==0)// accessing elements of the array, not index
            System.out.println(nums[i] + " ");
            i--;
        }

    }
}
