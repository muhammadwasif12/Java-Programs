import java.util.ArrayList;
import java.util.List;

// Book class
class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;  // Book is available when added
    }

    // Getters and Setters (Encapsulation)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    // toString method for easy printing
   // @Override
    public String toString() {
        return title + " by " + author + (isBorrowed ? " (Borrowed)" : " (Available)");
    }
}

// Library class
class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();  // Initialize the book list
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    // Method to borrow a book
    public Book borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.println("You borrowed: " + book.getTitle());
                return book;  // Return the borrowed book
            }
        }
        System.out.println("Book not available for borrowing.");
        return null;  // If the book is not found or unavailable
    }

    // Method to return a book
    public void returnBook(Book book) {
        if (book != null) {
            book.setBorrowed(false);
            System.out.println(book.getTitle() + " returned to the library.");
        }
    }

    // Method to display all books
    public List<Book> getAllBooks() {
        return books;
    }
}

// Main class to test the library system
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create and add books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Borrow a book
        library.borrowBook("1984");

        // Display all books
        System.out.println("\nAll books in the library:");
        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }

        // Return a book
        library.returnBook(book2);

        // Display books after return
        System.out.println("\nBooks after returning:");
        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }
    }
}
