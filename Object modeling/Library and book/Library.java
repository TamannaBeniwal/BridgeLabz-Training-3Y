import java.util.ArrayList;

class Library {
    private String name;
    private ArrayList<Book> books;  // Aggregation

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void showBooks() {
        System.out.println("Library: " + name);
        if (books.isEmpty()) {
            System.out.println("  No books in this library.");
        } else {
            for (Book book : books) {
                System.out.println("  - " + book);
            }
        }
    }
}
