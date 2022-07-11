package assignment8_loops;

public class One1 {
    public static void main(String[] args) {

        // 1. Using the while loop print the even numbers from 0 to 1000 according to the below example
        //    e.g
        //    0 -> 2 -> 4 -> 6 .... -> 1000

        int count = 0;

        while(count<= 1000) {
            if (count % 2 == 0) {// or instead of using IF and COUNT++, we can do (count = count +2;)
                System.out.print(count + " --> ");
            }
            count ++;
                    }

    }
}
