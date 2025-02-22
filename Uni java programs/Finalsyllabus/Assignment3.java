// Base class
class Shape {
    void calculateArea() {
        System.out.println("Calculating area of a shape.");
    }
}

// Derived class Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Calculator class demonstrating method overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }
}

// Main class
public class Assignment3 {
    public static void main(String[] args) {
        // Demonstrate method overloading
        Calculator calc = new Calculator();
        System.out.println("Addition of integers: " + calc.add(5, 10));
        System.out.println("Addition of doubles: " + calc.add(5.5, 10.5));
        System.out.println("Addition of int and double: " + calc.add(5, 10.5));
        System.out.println("Addition of double and int: " + calc.add(5.5, 10));

        // Demonstrate runtime polymorphism
        Shape shape;

        shape = new Circle(7);
        shape.calculateArea();

        shape = new Rectangle(5, 10);
        shape.calculateArea();
    }
}
