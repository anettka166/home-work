public class JavaArithmeticOperators {

    public static void main(String[] args) {

//        //1
//       int num = 24;
//       num = num + 5;
 //      System.out.println(num);

//        int num;
//      num = 24 + 5;//or num +=5;
 //       System.out.println(num);

        int num = 5;
        ++ num;//or num ++;
        System.out.println(num);

        //2
        int leng = 16;
        int width = 5;
        int apea = leng * width;
        System.out.println(apea);

        //3
        int day = 16;
        String month ="March";
        int year = 1990;
        float pounds = 127.3f; // can use double
        float height = 5.6f; //can use double
        String firstName = "Anna";
        String lastName = "Radionova";
        String line  = "______________________________";
        System.out.println(line);
        System.out.println("Hello, my name is " + firstName +" "+ lastName + ". I was born on " + month +","
                + day +" " + year +". I am " + height + " and weigh " + pounds + " pounds." );
        System.out.println(line);

        //4                  a =11   b = 37   c =36   d =57
      //  int a = 12;
      //        12  +  13+1  +13 - 2 = 37
     //   int b = a++ + (a+1) + a - 2;
     //         12  + 38  - (12+38) + 38 -1 =37
     //   int c = --a + ++b - (a+b) + b - 1;
     //         18 +  0 +   38   = 56
     //   int d = c/2 + a%2 + b--;
     //              12  - 37 +1 + 36 + 56 = 68
     //   int result = a-- - c + 1 + --c + d++;
     //   System.out.println(a + " " + b + " " + c + " " + d + " ");
     //   System.out.println(result);

        System.out.println(line);

        //5

        //           x = 49     y =191    z = 622   w =544
        //      33 + 15 + 0  = 48
        int x = 100/3 + 5*3 + 12%3;
        //      48  + 48 + 48 + 48 = 192
        int y = x++ + --x + x + x--;
        //     192 + 192 + 192 - 1 +47 = 622
        int z = y-- + ++y + y -1 + x++;
        //      48/3  - 191/2 + 622 +1 = 16 - 95 +622 + 1 = 544
        int w = x++/3 - --y/2 + z+1;
                System.out.println(x + " " + y + " " + z + " " + w + " ");

        System.out.println(line);

        //6  d=3   m=9    n=19  o=49    p=58   q=139
        //  d = 2
        int d = 2;
        //       5   + 2 * 2 = 9
        int m = 11/2 + d++ * --d;
        //      2 + 9  *  2 = 20
        int n = d + m++ * 2;
        //       1  + 10  + 20-1 + 20 = 50
        int o = --d + m++ + n-1 + n--;
        //      50 - 10 + 19/1 = 59
        int p = o - --m + n/d++;
        //      2   +  9  +19-1 + 50 +  59  - -1 = 139
        int q = d++ + --m + n-1 + o-- + p-- - - 1;
        System.out.println(d+ " " + m + " " + n + " " + o + " " + p + " " + q +  " ");

        //7
        System.out.println(line);

        float moneySandy = 120.25f;
        float bookPrice = 55.5f;
        float bookTax = 0.1f;
        float totalBookPrice = bookPrice * bookTax + bookPrice;
        float moneyMother = 20.0f;
        float burgerPrice = 8.0f;
        float moneyLeft = moneySandy + moneyMother - totalBookPrice - burgerPrice;
        System.out.println(totalBookPrice);
        System.out.println("The total amount of money left after buying a book and a burger is " + moneyLeft);

        System.out.println(line);

        //8

        double dValue = 12.456;
        int intValue = (int) dValue; // double> int, thus, everything after the decimal point will be lost
        System.out.println(intValue);

        System.out.println(line);

        //9

        int value = 23;
        double dValue1 = (double) value/3;
        System.out.println(dValue1);

        //10

        System.out.println(line);

        byte v;
        v = 12/2 + 5 - 1 * 3 / 4 - 5 % 2;
        System.out.println(v);

        int t = 12/2 + 5 - 1 * 3 / 4 - 5 % 2;
        byte h = (byte) t;
        System.out.println(h);
















    }
}
