package LibraryManagmentSystem;

public class Book {

	 String title;
	    String author;
	    boolean isIssued;

	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.isIssued = false; // Initially, the book is available
	    }

	    public void issueBook() {
	        isIssued = true;
	    }

	    public void returnBook() {
	        isIssued = false;
	    }

	    public boolean isAvailable() {
	    	return !isIssued;
	    }

	    @Override
	    public String toString() {
	        return "Title: " + title + ", Author: " + author + ", Available: " + (isIssued ? "No" : "Yes");
	    }
	
	    }