import java.util.ArrayList;

// Interface definition
interface Vehicle {
    String start();
    String stop();
    int fuelEfficiency(); // returns fuel efficiency in miles per gallon
    String getType();     // returns the type of the vehicle
}

// Car class implementing Vehicle interface
class Car implements Vehicle {
    @Override
    public String start() {
        return "The car starts.";
    }

    @Override
    public String stop() {
        return "The car stops.";
    }

    @Override
    public int fuelEfficiency() {
        return 30; // miles per gallon
    }

    @Override
    public String getType() {
        return "Car";
    }
}

// Bike class implementing Vehicle interface
class Bike implements Vehicle {
    @Override
    public String start() {
        return "The bike starts.";
    }

    @Override
    public String stop() {
        return "The bike stops.";
    }

    @Override
    public int fuelEfficiency() {
        return 60; // miles per gallon
    }

    @Override
    public String getType() {
        return "Bike";
    }
}

// Truck class implementing Vehicle interface
class Truck implements Vehicle {
    @Override
    public String start() {
        return "The truck starts.";
    }

    @Override
    public String stop() {
        return "The truck stops.";
    }

    @Override
    public int fuelEfficiency() {
        return 15; // miles per gallon
    }

    @Override
    public String getType() {
        return "Truck";
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create instances of Car, Bike, and Truck
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();

        // Store vehicles in an ArrayList
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Iterate over the list and call methods
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println(vehicle.start());
            System.out.println(vehicle.stop());
            System.out.println("Fuel Efficiency: " + vehicle.fuelEfficiency() + " miles per gallon");
            System.out.println();
        }
    }
}
