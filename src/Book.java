class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean available;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;

        // New books are available by default.
        this.available = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean borrow() {
        if (!available) {
            return false;
        }
        available = false;
        return true;
    }

    public boolean returnBook() {
        if (available) {
            return false;
        }
        available = true;
        return true;
    }
}
