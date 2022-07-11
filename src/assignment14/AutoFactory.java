package assignment14;

public class AutoFactory {
    public static void main(String[] args) {

        RoboCar roboCar1 = new RoboCar(4, "Tesla", "R3", "Electricity", 5);
        RoboCar roboCar2 = new RoboCar(4, "Tesla", "R2", "Electricity", 5);
    String s = roboCar1.toString();
        System.out.println(s);

        roboCar1.startEngine();
        roboCar1.drive(20);
        roboCar1.accelerate(80);
        roboCar1.fly(25);
        roboCar1.stop();

        RoboBike roboBike1 = new RoboBike(2,"Honda", "G12", "Water", 2, true);
        RoboBike roboBike2 = new RoboBike(2,"Honda", "G15", "Water", 1, true);
        RoboBike roboBike3 = new RoboBike(2,"Honda", "G16", "Water", 2, true);

        RoboTruck roboTruck1 = new RoboTruck(4, "Toyota", "HT678", "Water", "Huge");
        RoboVehicle[] vehicles = {roboCar1, roboCar2, roboBike1, roboBike2, roboBike3, roboTruck1};
        for (int i = 0; i < vehicles.length ; i++) {
            RoboVehicle vehicle = vehicles[i];
            vehicle.startEngine();
            vehicle.drive(20);
            vehicle.accelerate(100);
            vehicle.fly(10000);

            if(vehicle instanceof RoboCar){
                ((RoboCar) vehicle).navigate(("San Francisco"));
            }else if(vehicle instanceof RoboBike){
                ((RoboBike) vehicle).travelAtLightSpeed();
            }else if(vehicle instanceof RoboTruck){
                ((RoboTruck) vehicle).carryLoads(5000);
            }
            vehicle.stop();
            System.out.println(vehicle.toString());
        }




    }
}
