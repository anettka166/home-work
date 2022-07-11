package assignment9_loops;

public class Five {
    public static void main(String[] args) {
        //5. Given an int array [3,5,3,8,9,4,3,2,34,2],
        // print 'bingo' if this array contains 2 twice and 3 thrice. Use the for loop.

        int [] numbers = {3,5,3,8,9,4,3,2,34,2};

        int count2 = 0;
        int count3 = 0;

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) {
                count2 = count2 + 1;
            }
            if (numbers[i] == 3) {
                count3 = count3 + 1;
            }
        }
                    if (count2 == 2 && count3 == 3) {
                        System.out.println("bingo".toUpperCase());

                    }else{
                        System.out.println("not true");

                    }











    }
}
