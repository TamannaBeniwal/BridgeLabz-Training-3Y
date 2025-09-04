public class BookMain {
    public static void main(String[] args) {
        Book d = new Book();
        d.displayDetails();

        Book b = new Book("Atomic Habits", "James", 15.9);
        b.displayDetails();
    }
}
