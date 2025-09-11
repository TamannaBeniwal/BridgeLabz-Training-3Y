class Book {
   // Static variable shared across all instances
   private static String libraryName;
   // Instance variables
   private String title;
   private String author;
   private final String isbn; // Final variable to ensure immutability
   // Constructor to initialize instance variables
   public Book(String title, String author, String isbn) {
       this.title = title;
       this.author = author;
       this.isbn = isbn;
   }
   public Book(String string, String string2) {
    //TODO Auto-generated constructor stub
}
   // Static method to set the library name
   public static void setLibraryName(String name) {
       libraryName = name;
   }
   // Static method to display the library name
   public static void displayLibraryName() {
       System.out.println("Library Name: " + libraryName);
   }
   // Method to display book details
   public void displayBookDetails() {
       // Using 'instanceof' to verify the object's type before displaying details
       if (this instanceof Book) {
           System.out.println("Title: " + title);
           System.out.println("Author: " + author);
           System.out.println("ISBN: " + isbn);
       } else {
           System.out.println("The object is not an instance of the Book class.");
       }
   }
   // Getters for instance variables (optional, but recommended for encapsulation)
   public String getTitle() {
       return title;
   }
   public String getAuthor() {
       return author;
   }
   public String getIsbn() {
       return isbn;
   }
   public void displayInfo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
   }
}
public class Library {
   public Library(String string) {
        //TODO Auto-generated constructor stub
    }

   public Library() {
    //TODO Auto-generated constructor stub
}

   public static void main(String[] args) {
       // Set the library name (static variable)
       Book.setLibraryName("Egmore Library");
       // Display the library name
       Book.displayLibraryName();
       // Create a new book instance
       Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
       // Display book details
       book1.displayBookDetails();
   }

   public void displayBooks() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'displayBooks'");
   }

   public void addBook(Book book2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addBook'");
   }

   public void showBooks() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'showBooks'");
   }
}
