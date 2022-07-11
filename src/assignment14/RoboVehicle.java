package assignment14;

import java.util.Random;

public class RoboVehicle {
    private int numberOfWheels;
    private String make;
    private String model;
    private final long unitNumber;//Randomly geneate a unit number that contains 7 numbers e.g 8409123
    private final String madeBy = "124 Robo Drive, Fairfax, VA 22345";
    private final String madeIn = "TechCenture Auto industries";
    private final String vinNumber;// Randomly generate 17 characters that will contain letters and numbers e.g 3GNFK12367G216966
    private String fuelType;// is string and either water or electricity

    public RoboVehicle(int numberOfWheels, String make, String model, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.make = make;
        this.model = model;
        this.unitNumber = generateUnitNumber();
        this.vinNumber = generateVin();
        this.fuelType = fuelType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getUnitNumber() {
        return unitNumber;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void startEngine() {//print something generic for RoboVehicle
        System.out.println(make + " RoboVehicle " + " is ready for driving");
    }

    public void drive(int speed) {//insert some validation for speed to be
        // non-negative value, print something generic for RoboVehicle
        if (speed > 0) {
            System.out.println(getClass().getName() + " is moving at " + speed + " ml/hr!");
        } else {
            System.out.println("Please enter a valid speed parameter!");
        }
    }

    public void accelerate(int speed) {// insert some validation for speed to be non-negative value,
        // print something generic for RoboVehicle
        if (speed > 0) {
            System.out.println(getClass().getName() + " is accelerating to " + speed + " ml/hr!");
        } else {
            System.out.println("Please enter a valid speed parameter!");
        }
    }

    public void stop() {//print something generic for RoboVehicle
        System.out.println(getClass().getName() + " has stopped");
    }

    public void fly(int height) {//insert some validation for height to be a non-negative value,
        // print something generic for RoboVehicle
        if (height > 0) {
            System.out.println(getClass().getName() + " can fly at  " + height + " meters");
        } else {
            System.out.println("Please enter a valid height parameter!");
        }

    }

    @Override
    public String toString() {
        return "RoboVehicle Details:\n" +
                " numberOfWheels: " + numberOfWheels + "\n" +
                " make: " + make + "\n" +
                " model: " + model + '\n' +
                " Unit Number: " + unitNumber + "\n" +
                " vinNumber: " + vinNumber + '\n' +
                " fuelType: " + fuelType + '\n';
    }

    private String generateVin() {
        String str = "abcdefghijklmnoprstuwxvyz0123456789";
        String result = "";
        for (int i = 0; i < 17; i++) {
            int random = (int) (Math.random() * (str.length() - 0) + 0);
            result += str.charAt(random);
        }
        return result.toUpperCase();
    }
    private long generateUnitNumber(){
        long unitNumber = (long) (Math.random() * (999999 - 999999) + 999999);
        return unitNumber;
    }
}
