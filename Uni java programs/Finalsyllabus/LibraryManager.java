import java.util.ArrayList;

class Library {
    private ArrayList<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(title);
        System.out.println(title + " added to the library.");
    }

    public void removeBook(String title) {
        if (books.remove(title)) {
            System.out.println(title + " removed from the library.");
        } else {
            System.out.println(title + " not found in the library.");
        }
    }

    public boolean hasBook(String title) {
        return books.contains(title);
    }

    public void listBooks() {
        System.out.println("Books in the library:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}

public class LibraryManager {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook("Java Programming");
        library.addBook("Data Structures");
        library.addBook("Algorithms");

        // Removing a book
        library.removeBook("Data Structures");

        // Checking if a book exists
        System.out.println("Is 'Java Programming' in the library? " + library.hasBook("Java Programming"));

        // Listing all books
        library.listBooks();
    }
}
