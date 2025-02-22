class Book {
    String title;
    String author;
    double price;

    // Constructor for title and author only
    Book(String titleInput, String authorInput) {
        title = titleInput;
        author = authorInput;
        price = 0.0; // Default price
    }

    // Constructor for title, author, and price
    Book(String titleInput, String authorInput, double priceInput) {
        title = titleInput;
        author = authorInput;
        price = priceInput;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println(); // Blank line for readability
    }
    
    public static void main(String[] args) {
        // Create Book objects using different constructors
        Book book1 = new Book("The Novel", "Shakespeare"); // Using title and author
        Book book2 = new Book("Brave New World", "Peter", 15.99); // Using all three attributes

        // Display details of the books
        book1.displayDetails();
        book2.displayDetails();
}

}

