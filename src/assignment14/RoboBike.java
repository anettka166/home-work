package assignment14;

import java.util.Random;

public class RoboBike extends RoboVehicle {
    boolean helmetRequired;
    public RoboBike(int numberOfWheels, String make, String model,
                  String fuelType, int numberOfSeats, boolean helmetRequired) {
        super(numberOfWheels, make, model, fuelType);
    this.helmetRequired = helmetRequired;
    }

    public boolean isHelmetRequired() {
        return helmetRequired;
    }

    public void setHelmetRequired(boolean helmetRequired) {
        this.helmetRequired = helmetRequired;
    }

    void travelAtLightSpeed(){
        System.out.println("This new RoboBike travels at low speed");
    }
    @Override
    public void startEngine(){//print something generic for RoboVehicle
        System.out.println(getMake() + " RoboBike " + " is ready to be used");
    }
    @Override
    public void drive(int speed) {//insert some validation for speed to be
        // non-negative value, print something generic for RoboVehicle
        if (speed > 0) {
            System.out.println(getMake() + " RoboBike " + " is moving at " + speed + " ml/hr!");
        }else{
            System.out.println("Please enter a valid speed parameter!");
        }
    }
    @Override
    public void accelerate(int speed){// insert some validation for speed to be non-negative value,
        // print something generic for RoboVehicle
        if (speed > 0) {
            System.out.println(getMake() + " RoboBike " + "is accelerating to " + speed + " ml/hr!");
        }else{
            System.out.println("Please enter a valid speed parameter!");
        }
    }
    @Override
    public void stop(){//print something generic for RoboVehicle
        System.out.println(getMake() + " RoboBike has stopped");
    }

    @Override
    public void fly(int height){//insert some validation for height to be a non-negative value,
        // print something generic for RoboVehicle
        if (height > 0) {
            System.out.println(getMake() + " RoboBike " + "can fly at  " + height + " meters");
        }else{
            System.out.println("Please enter a valid height parameter!");

        }

    }
    @Override
    public String toString() {
        return "RoboBike Details:\n" +
                " numberOfWheels: " + getNumberOfWheels() + "\n" +
                " make: " + getMake() + "\n" +
                " model: " + getModel() + '\n' +
                " Unit Number: " + getUnitNumber() + "\n" +
                " vinNumber: " + getVinNumber() + '\n' +
                " fuel Type: " + getFuelType() + '\n' +
                " Helmet required: " + isHelmetRequired() + '\n';


    }







}
