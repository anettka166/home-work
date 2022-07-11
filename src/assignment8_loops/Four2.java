package assignment8_loops;

public class Four2 {
    public static void main(String[] args) {
        // 4. Given an int array [6,3,6,5,12,67,98,1,-8,56,42,75,23], print the even elements of this array using
        //    the FOR loop in reverse order

        int [] numbers ={6,3,6,5,12,67,98,1,-8,56,42,75,23};

        for (int i = numbers.length-1; i >= 0 && i < numbers.length; i-- ){
            if(numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
            }
        }







    }
}
