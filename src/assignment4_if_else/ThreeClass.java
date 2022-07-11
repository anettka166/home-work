package assignment4_if_else;

import java.util.Scanner;

public class ThreeClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO TECHCENTURE BMI SOLUTIONS");

        System.out.println("HOW WOULD YOU LIKE TO MEASURE YOUR BMI");
        System.out.println("1. METRIC SYSTEM");
        System.out.println("2. IMPERIAL SYSTEM");
        System.out.print("OPTION (ENTER 1 OR 2): ");
        int option = scanner.nextInt();
        double bmiScore;
        if (option == 1){
            System.out.println("--------------- METRIC SYSTEM ---------------------\n");
            System.out.print("PLEASE ENTER YOUR WEIGHT IN KG: ");
            double weightKg = scanner.nextDouble();
            if (weightKg <= 0) {
                System.out.println("WEIGHT IS OUT OF RANGE");
                return;
            }

            System.out.print("PLEASE ENTER YOUR HEIGHT IN METERS: ");
            double heightMtr = scanner.nextDouble(); //

            if (heightMtr <= 0){
                System.out.println("HEIGHT IS OUT OF RANGE");
                return;
            }
            bmiScore = weightKg / (heightMtr * heightMtr);
        }
        else if(option == 2){
            System.out.println("--------------- IMPERIAL SYSTEM ---------------------\n");
            System.out.print("PLEASE ENTER YOUR WEIGHT IN LBS: ");
            double weightLbs = scanner.nextDouble();
            if (weightLbs <= 0){
                System.out.println("WEIGHT IS OUT OF RANGE");
                return;
            }

            System.out.print("PLEASE ENTER YOUR HEIGHT IN FEET AND INCHES (e.g 5.10):  ");
            String heightStr = scanner.next();  //"5.10"                             0    1
            String[] height = heightStr.split("\\.");  //"5.10".split(".") -> ["5","10"]
            String foot = height[0]; //we are accessing first item by its index 0

            if (Integer.parseInt(foot) <= 0){
                System.out.println("HEIGHT IS OUT OF RANGE");
                return;
            }

            String inch = height[1]; //10
            //                      converting to int
            int heightInInches = (Integer.parseInt(foot) * 12) + Integer.parseInt(inch); //overall inches

            //      BMI = lbs * 703 / in^2
            bmiScore = weightLbs * 703 / (heightInInches * heightInInches);

        }else{
            System.out.println("INVALID INPUT. HAVE A NICE DAY!!!!");
            return;
        }

        System.out.println("\n------------------HERE ARE YOUR RESULTS-----------------");
        double roundOffBmi = Math.round(bmiScore * 100) / 100.00;
        if (bmiScore > 0 && bmiScore < 18.5){
            String type = "UNDERWEIGHT";
            System.out.println("\nYOUR BMI: " + roundOffBmi + " (" + type+")");
        }
        else if (bmiScore >= 18.5 && bmiScore < 25){
            String type = "NORMAL";
            System.out.println("\nYOUR BMI: " + roundOffBmi + " (" + type+")");
        }
        else if (bmiScore >= 25 && bmiScore < 30){
            String type = "OVERWEIGHT";
            System.out.println("\nYOUR BMI: " + roundOffBmi + " (" + type+")");
        }
        else if (bmiScore >= 30){
            String type = "OBESE";
            System.out.println("\nYOUR BMI: " + roundOffBmi + " (" + type+")");
        }
    }
}
