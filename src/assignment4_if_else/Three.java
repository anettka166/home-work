package assignment4_if_else;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO TECHCENTURE BMI SYSTEMS!");
        System.out.print("PLEASE ENTER YOUR WEIGHT IN KILOGRAMS: ");
        double weightKg = scanner.nextDouble();
        if(weightKg >0) {
            System.out.print("PLEASE ENTER YOUR HEIGHT IN METERS: ");
            double heightMtr = scanner.nextDouble();
            if(heightMtr >0){
            double bmiMetric = weightKg / (heightMtr * heightMtr);

           double roundOffBmi = Math.round(bmiMetric * 100) / 100.00;
         //   DecimalFormat df = new DecimalFormat("0.00"):

            if (bmiMetric > 0 && bmiMetric < 18.5) {
                String type = "UNDERWEIGHT";
                System.out.println("\nYOUR BMI: " + roundOffBmi + " (" + type + ") ");
            } else if (bmiMetric >= 18.5 && bmiMetric <= 24.9) {
                String type = "NORMAL";
                System.out.println("\nYOUR BMI: " + roundOffBmi + " (" + type + ") ");
            } else if (bmiMetric >= 25 && bmiMetric <= 29.9) {
                String type = "OVERWEIGHT";
                System.out.println("\nYOUR BMI: " + roundOffBmi + " (" + type + ") ");
            } else if (bmiMetric >= 30) {
                String type = "OBESE";
                System.out.println("\nYOUR BMI: " + roundOffBmi + " (" + type + ") ");
            }
            }
            else{
                System.out.println("PLEASE ENTER VALID VALUES");
            }
        }else{
        System.out.println("PLEASE ENTER VALID VALUES");

        }




    }
}
