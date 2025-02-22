// Abstract class
abstract class Animal {
    // Abstract method
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println("This animal is eating.");
    }
}

// Concrete subclass Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Concrete subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class Assignment4 {
    public static void main(String[] args) {
        // Create an array of Animal references
        Animal[] animals = { new Dog(), new Cat() };

        // Use a loop to call makeSound() and eat() for each object
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
        }
    }
}
