package LibrarManagmentSystem;

public class main {


    public static void main(String[] args) {
        Library library = new Library();
        
        // Add books to the library
        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        System.out.println();
        // View available books
        library.viewAvailableBooks();
        System.out.println();
        // Issue a book
        library.issueBook("Harry Potter");
        System.out.println();
        // Try to issue the same book again
        library.issueBook("Harry Potter");
        System.out.println();
        // Return a book
        library.returnBook("Harry Potter");
        System.out.println();
        // View available books after return
        library.viewAvailableBooks();
    }

}
