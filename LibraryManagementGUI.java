// Library Management System - Question 1
import java.util.*;
import javax.swing.*;

// Book Class
class Book {
    private String bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getBookID() { return bookID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            JOptionPane.showMessageDialog(null, "Book borrowed successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Book is not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        JOptionPane.showMessageDialog(null, "Book returned successfully!");
    }
}

// User Class
abstract class User {
    private String userID;
    private String name;

    public User(String userID, String name) {
        this.userID = userID;
        this.name = name;
    }

    public String getUserID() { return userID; }
    public String getName() { return name; }
}

// Student Class
class Student extends User {
    public Student(String userID, String name) {
        super(userID, name);
    }
}

// Librarian Class
class Librarian extends User {
    public Librarian(String userID, String name) {
        super(userID, name);
    }
}

// Library Class
class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        JOptionPane.showMessageDialog(null, "Book added successfully!");
    }

    public void removeBook(String bookID) {
        books.removeIf(book -> book.getBookID().equals(bookID));
        JOptionPane.showMessageDialog(null, "Book removed successfully!");
    }

    public Book searchBook(String query) { // Search by title or author
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)) {
                return book;
            }
        }
        return null;
    }

    public void listBooks() {
        StringBuilder sb = new StringBuilder("Books in Library:\n");
        for (Book book : books) {
            sb.append(book.getBookID()).append(" - ").append(book.getTitle())
              .append(" by ").append(book.getAuthor()).append(book.isAvailable() ? " (Available)\n" : " (Borrowed)\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}

// GUI Demo for Library Management System
public class LibraryManagementGUI {
    public static void main(String[] args) {
        Library library = new Library();

        while (true) {
            String choice = JOptionPane.showInputDialog("1. Add Book\n2. Remove Book\n3. Borrow Book\n4. Return Book\n5. Search Book\n6. List Books\n7. Exit\nChoose an option:");
            if (choice == null || choice.equals("7")) break;

            switch (choice) {
                case "1":
                    String bookID = JOptionPane.showInputDialog("Enter Book ID:");
                    String title = JOptionPane.showInputDialog("Enter Title:");
                    String author = JOptionPane.showInputDialog("Enter Author:");
                    library.addBook(new Book(bookID, title, author));
                    break;
                case "2":
                    String removeID = JOptionPane.showInputDialog("Enter Book ID to Remove:");
                    library.removeBook(removeID);
                    break;
                case "3":
                    String borrowID = JOptionPane.showInputDialog("Enter Book ID to Borrow:");
                    Book bookToBorrow = library.searchBook(borrowID);
                    if (bookToBorrow != null) bookToBorrow.borrowBook();
                    else JOptionPane.showMessageDialog(null, "Book not found.");
                    break;
                case "4":
                    String returnID = JOptionPane.showInputDialog("Enter Book ID to Return:");
                    Book bookToReturn = library.searchBook(returnID);
                    if (bookToReturn != null) bookToReturn.returnBook();
                    else JOptionPane.showMessageDialog(null, "Book not found.");
                    break;
                case "5":
                    String searchQuery = JOptionPane.showInputDialog("Enter Title or Author to Search:");
                    Book foundBook = library.searchBook(searchQuery);
                    if (foundBook != null)
                        JOptionPane.showMessageDialog(null, "Found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
                    else
                        JOptionPane.showMessageDialog(null, "No book found.");
                    break;
                case "6":
                    library.listBooks();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice.");
            }
        }
    }
}
