package assignment9_loops;

public class Four {

    public static void main(String[] args) {

//4. Given an int array [3,5,6,8,9,4,3,45,34,96,3,12,32],
// print 'bingo' if this array has either 45 or 54. Use the for loop.
        int [] numbers = {3,5,6,8,9,4,3,45,54,34,96,3,12,32};
        int num45 = 0;
        int num54 = 0;
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 45) {
                num45 = num45 + 1;
            }
            if (numbers[i] == 54) {
                num54 = num54 + 1;
            }
        }
                if(num45 > 0 || num54 > 0){

                System.out.println("bingo".toUpperCase());
            }else{
                System.out.println("this array does NOT contain 45 or 54");

            }









    }
}
