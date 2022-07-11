package assignment14;

import java.util.Random;

public class RoboTruck extends RoboVehicle{
   String trailerType; //trailer type will be of String type

    public RoboTruck(int numberOfWheels, String make, String model, String fuelType, String trailerType) {
        super(numberOfWheels, make, model, fuelType);
        this.trailerType = trailerType;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public void carryLoads(double weight){//insert some validation for weight to be non-negative
     if(weight > 0){
         System.out.println("This new RoboTruck can carry up to " + weight);
     }else{
         System.out.println("Please enter a valid weight!");
     }
   }
    @Override
    public void startEngine(){//print something generic for RoboVehicle
        System.out.println(getMake() + " RoboTruck " + " is ready to drive");
    }
    @Override
    public void drive(int speed) {//insert some validation for speed to be
        // non-negative value, print something generic for RoboVehicle
        if (speed > 0) {
            System.out.println(getMake() + " RoboTruck " + " is moving at " + speed + " ml/hr!");
        }else{
            System.out.println("Please enter a valid speed parameter!");
        }
    }
    @Override
    public void accelerate(int speed){// insert some validation for speed to be non-negative value,
        // print something generic for RoboVehicle
        if (speed > 0) {
            System.out.println(getMake() + " RoboTruck " + "is accelerating to " + speed + " ml/hr!");
        }else{
            System.out.println("Please enter a valid speed parameter!");
        }
    }
    @Override
    public void stop(){//print something generic for RoboVehicle
        System.out.println(getMake() + " RoboTruck has stopped");
    }

    @Override
    public void fly(int height){//insert some validation for height to be a non-negative value,
        // print something generic for RoboVehicle
        if (height > 0) {
            System.out.println(getMake() + " RoboTruck " + "can fly at  " + height + " meters");
        }else{
            System.out.println("Please enter a valid height parameter!");
        }

    }
    @Override
    public String toString() {
        return "RoboTruck Details:\n" +
                " numberOfWheels: " + getNumberOfWheels() + "\n" +
                " make: " + getMake() + "\n" +
                " model: " + getModel() + '\n' +
                " Unit Number: " + getUnitNumber() + "\n" +
                " vinNumber: " + getVinNumber() + '\n' +
                " fuel Type: " + getFuelType() + '\n' +
                " Trailer type: " + getTrailerType() + '\n';


    }




}
