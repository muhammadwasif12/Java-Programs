class LibraryManagementSystem {
    private String title;
    private String author;
    private int publicationYear;
    private String librarianName;
    private int employeeId;

    // Constructor for LibraryManagementSystem
    LibraryManagementSystem(String title, String author, int publicationYear, String librarianName, int employeeId) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.librarianName = librarianName;
        this.employeeId = employeeId;
    }

    // Getter and Setter Methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    class Books {
        private String bookTitle;

        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        public boolean checkAvailability() {
            if (bookTitle.equals(getTitle())) {
                System.out.println("Book is Available");
                return true;
            } else {
                System.out.println("Book is Not Available");
                return false;
            }
        }
    }

    
    class Magazines {
        private String magazineTitle;

        Magazines(String magazineTitle) {
            this.magazineTitle = magazineTitle;
        }

        public void displayMagazine() {
            System.out.println("Magazine: " + magazineTitle);
        }
    }

    
    class DVD {
        private String dvdTitle;

        DVD(String dvdTitle) {
            this.dvdTitle = dvdTitle;
        }

        public void play() {
            System.out.println("DVD: " + dvdTitle);
        }
    }
}


public class LibrarySystemTest {
    public static void main(String[] args) {
        // Create a LibraryManagementSystem object
        LibraryManagementSystem library = new LibraryManagementSystem("OOP", "Hamza", 2004, "Wasif", 12);

        System.out.println("Librarian Name: " + library.getLibrarianName());
        System.out.println("Employee ID: " + library.getEmployeeId());
        System.out.println("Author: " + library.getAuthor());
        System.out.println("Book Title: " + library.getTitle());
        System.out.println("Publication Year: " + library.getPublicationYear());

        // Books class usage
        LibraryManagementSystem.Books book = library.new Books();
        book.setBookTitle("OOP");
        book.checkAvailability();

        // Magazines class usage
        LibraryManagementSystem.Magazines magazine = library.new Magazines("Tech Weekly");
        magazine.displayMagazine();

        // DVD class usage
        LibraryManagementSystem.DVD dvd = library.new DVD("Science Documentary");
        dvd.play();
    }
}
