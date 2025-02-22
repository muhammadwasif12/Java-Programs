// Generic Class
class Container<T> {
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // Generic Method
    public <U> void displayValue(U input) {
        System.out.println("Value: " + input);
    }
}

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("Hello");
        System.out.println("Container Value: " + stringContainer.getValue());

        // Using generic method
        stringContainer.displayValue(123); // Works with Integer
    }
}
