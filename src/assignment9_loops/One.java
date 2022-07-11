package assignment9_loops;

public class One {
    public static void main(String[] args) {
        // 1. Given an int array [3,5,6,8,9,4,3,45,34,96,3,12,32], print 'bingo' if number 3 appears 3 times.
        // Use for loop to iterate/loop this array.

        int[] numbers = {3,5,6,8,9,4,3,45,34,96,3,12,32};
        int count3 = 0;

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                count3 = count3 + 1;//or count3++;
            }
        }
            if (count3 == 3) {
                System.out.println("bingo!".toUpperCase());

               } else {

                System.out.println("number 3 appears " + count3 + " times".toUpperCase());

            }














    }
}
