package assignment8_loops;

import java.util.Arrays;

public class Eight2 {
    public static void main(String[] args) {
//8. Given an int array [5,67,2,63,90,12,543,3,12], increment even numbers by 2 and odd numbers by 3 using the FOR loop
//        and print the result on the console using the while loop (Don't use the Arrays.toString method)

        int[] numbers = {5,67,2,63,90,12,543,3,12};


        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 ==0){
                numbers[i] = numbers[i] + 2;
                            }else{
                numbers[i] = numbers[i] + 3;
            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}
