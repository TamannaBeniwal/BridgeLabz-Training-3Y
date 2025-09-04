public class LibraryBookMain {
    public static void main(String[] args) {
        // Create a book object
        LibraryBook book1 = new LibraryBook("OOPs", "robert", 750, true);

        System.out.println("Book Information:");
        book1.displayInfo();

        // Try borrowing the book
        System.out.println("Attempting to borrow the book...");
        book1.borrowBook();

        // Try borrowing again
        System.out.println("\nAttempting to borrow the book again...");
        book1.borrowBook();


        System.out.println("\nBook Information After Borrowing:");
        book1.displayInfo();
    }
}