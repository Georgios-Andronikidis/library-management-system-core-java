import java.util.HashMap;
import java.util.Map;

class Library {

    // ISBN is used as a unique key for fast book lookup.
    private Map<String, Book> books = new HashMap<>();

    public boolean addBook(Book book) {
        if (book == null || books.containsKey(book.getIsbn())) {
            return false;
        }

        books.put(book.getIsbn(), book);
        return true;
    }

    public Book findBook(String isbn) {
        return books.get(isbn);
    }

    public boolean borrowBook(String isbn) {
        Book book = findBook(isbn);

        if (book == null) {
            return false;
        }
        return book.borrow();
    }

    public boolean returnBook(String isbn) {
        Book book = findBook(isbn);

        if (book == null) {
            return false;
        }
        return book.returnBook();
    }

    public void printAllBooks() {
        for (Book book : books.values()) {
            System.out.println(book.getTitle() + " | ISBN: " + book.getIsbn() + " | Available: " + book.isAvailable() );
        }
    }
}
