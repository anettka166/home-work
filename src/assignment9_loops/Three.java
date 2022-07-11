package assignment9_loops;

public class Three {
    public static void main(String[] args) {
//3. Given an int array [3,5,6,8,9,4,3,45,34,96,3,12,32],
// print 'bingo' if the first half and the second half of this array are equal.

//        Hint: Create two temp variables to hold two sums. Use two loops,
//        one to calculate the first half and another to calculate the second half

        int [] numbers = {3,5,6,8,9,4,3,45,34,96,3,12,32};

        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        int length = numbers.length;
        int firstHalfLength = length/2;


        for ( int i = 0; i < firstHalfLength; i++){
            sumFirstHalf = sumFirstHalf + numbers[i];

        }
        System.out.println("Sum of first half is " + sumFirstHalf);
        for ( int i = firstHalfLength; i < length; i++){
            sumSecondHalf = sumSecondHalf + numbers[i];
        }
        System.out.println("Sum of second half is " + sumSecondHalf);

        if(sumFirstHalf==sumSecondHalf){
            System.out.println("bingo".toUpperCase());
        }else{
            System.out.println("first half and the second half of this array NOT equal");
        }















    }
}
