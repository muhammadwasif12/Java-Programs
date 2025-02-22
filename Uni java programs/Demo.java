class Shape {
    void draw() {
        System.out.println("Can't Say shape type");
    }
}

class Square extends Shape {
    // Overriding the draw method of Shape class
    void draw() {
        super.draw();  // Call the parent class's draw method
        System.out.println("Square Shape");
    }
}

class Demo {
    public static void main(String[] args) {
        Square h = new Square();
        h.draw();  // Calls the overridden draw method
    }
}
