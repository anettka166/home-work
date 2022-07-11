package assignment8_loops;



public class Three2 {
    public static void main(String[] args) {
        // 3. Given an int array [6,3,6,5,12,67,98,1,-8,56,42,75,23], print the elements of this array using
        //       the FOR loop in reverse order

        int[] numbers = {6,3,6,5,12,67,98,1,-8,56,42,75,23};


        for(int i = numbers.length-1; i < numbers.length && i >=0; i--){
            System.out.print(numbers[i] +" ");


        }



    }
}
