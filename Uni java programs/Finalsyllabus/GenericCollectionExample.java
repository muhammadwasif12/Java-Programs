import java.util.ArrayList;
import java.util.List;

public class GenericCollectionExample {
    public static void main(String[] args) {
        // Create a generic collection
        List<String> names = new ArrayList<>();

        // Add elements
        names.add("Alice");
        names.add("Bob");

        // Retrieve and print elements
        for (String name : names) {
            System.out.println(name);
        }

        // Prevents adding incompatible types
        // names.add(123); // Compile-time error
    }
}
