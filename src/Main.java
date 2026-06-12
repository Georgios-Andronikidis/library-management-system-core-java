public class Main {
    public static void main(String[] args) {
        System.out.println("— LIBRARY SYSTEM DEMO —");
        Library library = new Library();

        Book b1 = new Book("978-1491910771", "Head First Java", "Kathy Sierra");
        Book b2 = new Book("978-0137870998", "Core Java Volume I—Fundamentals", "Cay S. Horstmann");
        Book b3 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");

        System.out.println("\nAdding books...");
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("\nAll books:");
        library.printAllBooks();

        System.out.println("\nBorrow 'Head First Java':");
        System.out.println(library.borrowBook("978-1491910771"));

        System.out.println("\nTry borrowing again:");
        System.out.println(library.borrowBook("978-1491910771"));

        System.out.println("\nReturn book:");
        System.out.println(library.returnBook("978-1491910771"));

        System.out.println("\nBorrow again:");
        System.out.println(library.borrowBook("978-1491910771"));

        System.out.println("\nFinal state:");
        library.printAllBooks();

        System.out.println("\n— End —");
    }
}
