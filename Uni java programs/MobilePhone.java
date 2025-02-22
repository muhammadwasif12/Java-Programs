class MobilePhone {
    String brand;
    String model;
    int price;
    int batteryCapacity;

    // Constructor
    MobilePhone(String a, String b, int c, int d) {
        brand = a;
        model = b;
        price = c;
        batteryCapacity = d;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
    }
    public static void main(String[] args) {
        // Create an object of MobilePhone class
        MobilePhone phone = new MobilePhone("Samsung", "S10", 70000,5000);
        phone.displayDetails();
    }
}

