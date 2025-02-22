 class Car {
    String model;
    int speed;

    // Constructor to initialize the car's model and speed
    Car(String m, int s) {
        model = m;
        speed = s;
    }

    // Method to display car details
    void displayCarDetails() {
        System.out.println("Car model: " + model + ", Speed: " + speed);
    }
}

public class CarFactory {

    // Method that returns a new Car object 

    public static Car createCar() {
        // Create a new Car object
        Car newCar = new Car("Toyota Corolla", 120);
        return newCar;  // Return the Car object
    }

    public static void main(String[] args) {
        // Call createCar method which returns a Car object
        Car myCar = createCar();  // Receive the returned object

        // Display the details of the returned car
        System.out.println("Car details after receiving object from method:");
        myCar.displayCarDetails();
    }
}
 