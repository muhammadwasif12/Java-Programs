 // Generic Class
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// Generic Method
class Utils {
    public static <T> void printItem(T item) {
        System.out.println("Item: " + item);
    }
}

public class GenericExample {
    public static void main(String[] args) {
        // Using a generic class
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println("Box contains: " + stringBox.getItem());

        // Using a generic method
        Utils.printItem(123); // Works with Integer
        Utils.printItem("Java"); // Works with String
    }
}


