public class Main {
    public static void main(String[] args) {
        // Create books independently
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Create libraries
        Library cityLibrary = new Library("City Library");
        Library schoolLibrary = new Library("School Library");

        // Add books to libraries
        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        schoolLibrary.addBook(book2); // Same book added to another library
        schoolLibrary.addBook(book3);

        // Show books in each library
        cityLibrary.showBooks();
        System.out.println();
        schoolLibrary.showBooks();
    }
}