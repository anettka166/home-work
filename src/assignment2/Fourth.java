package assignment2;

public class Fourth {
    public static void main(String[] args) {

        // a = 31  b = 29
         // a =     36 -6 = 30
        int a = 12 * 3 - 6;
        //  b = 31  - 31-1 +31 = 30
        int b = ++a - a-1 + a--;                                     //  false && false = false
        //                                         false     true                30 <29 && failse
        boolean result = false || true && false || !true && !false && (a++ < --b && !true);
        System.out.println(result);
      //  Result is false

    }
}
