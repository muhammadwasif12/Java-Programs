// Static Typing in Java
 class StaticTypingExample {
    public static void main(String[] args) {
        int number = 10; // Type defined at compile-time
        System.out.println("Number: " + number);

        // number = "text"; // Compile-time error: Type mismatch
    }
}

// No direct Dynamic Typing in Java, but type inference (var) adds some flexibility
public class DynamicTypingExample {
    public static void main(String[] args) {
        var number = 10; // Compiler infers type
        System.out.println("Number: " + number);

        // var text = "Dynamic"; 
        // text = 123; // Compile-time error: Type mismatch
    }
}
