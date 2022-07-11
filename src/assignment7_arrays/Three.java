package assignment7_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("FIRST NUMBER:");
        int num1 = scanner.nextInt();
        System.out.print("SECOND NUMBER:");
        int num2 = scanner.nextInt();
        System.out.print("THIRD NUMBER:");
        int num3 = scanner.nextInt();
        System.out.print("FOUR NUMBER:");
        int num4 = scanner.nextInt();
        System.out.print("FIVE NUMBER:");
        int num5 = scanner.nextInt();
        System.out.print("SIX NUMBER:");
        int num6 = scanner.nextInt();
        System.out.print("SEVEN NUMBER:");
        int num7 = scanner.nextInt();
        System.out.print("EIGHT NUMBER:");
        int num8 = scanner.nextInt();
        System.out.print("NINE NUMBER:");
        int num9 = scanner.nextInt();
        System.out.print("TEN NUMBER:");
        int num10 = scanner.nextInt();

        int [] numbers = new int[10];

        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;
        numbers[3] = num4;
        numbers[4] = num5;
        numbers[5] = num6;
        numbers[6] = num7;
        numbers[7] = num8;
        numbers[8] = num9;
        numbers[9] = num10;
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));













    }
}
