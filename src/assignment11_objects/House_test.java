package assignment11_objects;

public class House_test {
    public static void main(String[] args) {

        House first = new House("Anna's house", 8733, 18, 21,
                4, 1956, false, 6, 2);
        System.out.println("-----------First----------");
        System.out.println("Name: " + first.name);
        System.out.println("House number: " + first.houseNumber);
        System.out.println("Number of windows: " + first.numberOfWindows);
        System.out.println("Number of doors: " + first.numberOfDoors);
        System.out.println("Number of floors: " + first.numberOfFloors);
        System.out.println("Year build: " + first.yearBuilt);
        System.out.println("Is it new: " + first.isNew);
        System.out.println("Number of beds: " + first.numberOfBeds);
        System.out.println("Number of kitchens: " + first.numberOfKitchens);


        House second = new House("Neighbours's house", 8723, 19, 20,
                4, 1956, false, 6, 2);
        System.out.println("-----------Second----------");
        System.out.println("Name: " + second.name);
        System.out.println("House number: " + second.houseNumber);
        System.out.println("Number of windows: " + second.numberOfWindows);
        System.out.println("Number of doors: " + second.numberOfDoors);
        System.out.println("Number of floors: " + second.numberOfFloors);
        System.out.println("Year build: " + second.yearBuilt);
        System.out.println("Is it new: " + second.isNew);
        System.out.println("Number of beds: " + second.numberOfBeds);
        System.out.println("Number of kitchens: " + second.numberOfKitchens);







    }

}
