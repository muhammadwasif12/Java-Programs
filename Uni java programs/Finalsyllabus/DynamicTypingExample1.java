// Type Inference with var
public class DynamicTypingExample1 {
    public static void main(String[] args) {
        var number = 10; // Compiler infers type
        System.out.println("Number: " + number);

        // var text = "Dynamic"; 
        // text = 123; // Compile-time error: Type mismatch
    }
}
