package assignment9_loops;

public class Two {
    public static void main(String[] args) {

        //2. Given an int array [3,5,6,8,9,4,3,45,34,96,3,12,32],
        // print 'bingo' if the sum of even and odd numbers are equal.

        int [] numbers = {3,5,6,8,9,4,3,45,34,96,3,12,32 };

        int sumEven = 0;
        int sumOdd = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven = sumEven + numbers[i];
            } else {
                sumOdd = sumOdd + numbers[i];
            }
        }
                    if (sumEven == sumOdd){
                        System.out.println(("sum of even: ").toUpperCase() + sumEven + (" sum of odd ").toUpperCase() + sumOdd);
                        System.out.println("bingo".toUpperCase());

                    }else{
                        System.out.println(("sum of even: ").toUpperCase() + sumEven + (" sum of odd ").toUpperCase() + sumOdd);
                        System.out.println("sum of even and odd numbers are NOT equal");

                    }


















    }
}
