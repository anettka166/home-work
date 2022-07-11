package assignment14;

import java.util.Random;

public class RoboCar extends RoboVehicle {
    private int numberOfSeats; //must be 5

    public RoboCar(int numberOfWheels, String make, String model, String fuelType, int numberOfSeats) {
        super(numberOfWheels, make, model, fuelType);
    this.numberOfSeats = numberOfSeats;
    }

    public void navigate(String location){
        System.out.println("RoboCar is at " + location);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    @Override
    public void startEngine(){//print something generic for RoboVehicle
        System.out.println(getMake() + " RoboCar " + " is ready to drive");
    }
    @Override
    public void drive(int speed) {//insert some validation for speed to be
        // non-negative value, print something generic for RoboVehicle
        if (speed > 0) {
            System.out.println(getMake() + " RoboCar " + " is moving at " + speed + " ml/hr!");
        }else{
            System.out.println("Please enter a valid speed parameter!");
        }
    }
    @Override
    public void accelerate(int speed){// insert some validation for speed to be non-negative value,
        // print something generic for RoboVehicle
        if (speed > 0) {
            System.out.println(getMake() + " RoboCar " + "is accelerating to " + speed + " ml/hr!");
        }else{
            System.out.println("Please enter a valid speed parameter!");
        }
    }
    @Override
    public void stop(){//print something generic for RoboVehicle
        System.out.println(getMake() + " RoboCar has stopped");
    }

    @Override
    public void fly(int height){//insert some validation for height to be a non-negative value,
        // print something generic for RoboVehicle
        if (height > 0) {
            System.out.println(getMake() + " RoboCar " + "can fly at  " + height + " meters");
        }else{
            System.out.println("Please enter a valid height parameter!");
        }

    }
    @Override
    public String toString() {
        return "RoboCar Details:\n" +
                " numberOfWheels: " + getNumberOfWheels() + "\n" +
                " make: " + getMake() + "\n" +
                " model: " + getModel() + '\n' +
                " Unit Number: " + getUnitNumber() + "\n" +
                " vinNumber: " + getVinNumber() + '\n' +
                " fuel Type: " + getFuelType() + '\n' +
                " Number of Seats: " + getNumberOfSeats() + '\n';


    }









}
