class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters (optional)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}
