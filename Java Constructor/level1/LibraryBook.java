public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author + ".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println();
    }
}
