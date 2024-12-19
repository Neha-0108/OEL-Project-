package LibraryManagmentSystem;



public interface LibraryOperations {

	    void addBook(Book book);
	    void issueBook(String title);
	    void returnBook(String title);
	    void viewAvailableBooks();
	    
}