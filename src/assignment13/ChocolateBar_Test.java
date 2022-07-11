package assignment13;

import java.util.Arrays;

public class ChocolateBar_Test {
    public static void main(String[] args) {

        ChocolateBar choice1 = new ChocolateBar("Milk Hazelnau Classic","4.5 oz", 2569598542l,
                "05-18-2022", "may contain nuts", 25.00, 98,
                18.0, 25.1, 25.6, 12.0, 3, 15,
                258, "15 g", "12 g", "7 pieces per serving",
                new String[]{"sugar", "cocoa", "butter", "hazelnuts", "milk", "chocolate"}) {

        };


        String [] ingredients = {"sugar", "cocoa", "butter", "hazelnuts", "milk", "chocolate", "skim milk", "soy lecithin",
                "barley mold powder", "artificial flavors"};
        String str = Arrays.toString(ingredients);
        System.out.println(choice1);


    }
}
