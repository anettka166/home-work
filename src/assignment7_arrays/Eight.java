package assignment7_arrays;

import java.util.Arrays;

public class Eight {
    public static void main(String[] args) {

        double[] prices = {12.50, 3.55, 10.23, 90};
        double[] taxes = {0.01, 0.12, 0.5, 0.2};

        double [] newPrices = new double [4];
        newPrices[0] = prices[0] * taxes[0] + prices[0];
        newPrices[1] = prices[1] * taxes[1] + prices[1];
        newPrices[2] = prices[2] * taxes[2] + prices[2];
        newPrices[3] = prices[3] * taxes[3] + prices[3];

        System.out.println(Arrays.toString(newPrices));








    }
}
