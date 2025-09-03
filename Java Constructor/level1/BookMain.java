public class BookMain {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.displayDetails();

        Book b = new Book("Atomic Habits", "James Clear", 15.99);
        b.displayDetails();
    }
}
