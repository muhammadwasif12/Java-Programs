class Person {
    String name;
    int age;

    // Constructor to initialize name and age
    Person(String nameInput, int ageInput) {
        name = nameInput;
        age = ageInput;
    }
}

class Car {
    String brand;
    String model;
    Person owner;  // Owner is of type Person

    // Constructor to initialize brand, model, and owner
    Car(String brandInput, String modelInput, Person ownerInput) {
        brand = brandInput;
        model = modelInput;
        owner = ownerInput;
    }

    // Method to display car details including owner
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Owner: " + owner.name + ", Age: " + owner.age);
    }

    // Main method inside Car class
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 28);

        // Create a Car object and assign the Person object as the owner
        Car car = new Car("Honda", "Civic", person);

        // Display car details
        car.displayDetails();
    }
}
