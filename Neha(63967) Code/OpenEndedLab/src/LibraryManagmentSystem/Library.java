package LibraryManagmentSystem;

public class Library implements LibraryOperations{

	
	    class Node {
	        Book book;
	        Node next;

	        public Node(Book book) {
	            this.book = book;
	            this.next = null;
	        }
	    }

	    private Node head;

	    public Library() {
	        head = null;
	    }

	    @Override
	    public void addBook(Book book) {
	        Node newNode = new Node(book);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }

	    @Override
	    public void issueBook(String title) {
	        Node current = head;
	        while (current != null) {
	            if (current.book.title.equals(title) && current.book.isAvailable()) {
	                current.book.issueBook();
	                System.out.println("Book issued: " + title);
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Book not available or already issued.");
	    }

	    @Override
	    public void returnBook(String title) {
	        Node current = head;
	        while (current != null) {
	            if (current.book.title.equals(title) && !current.book.isAvailable()) {
	                current.book.returnBook();
	                System.out.println("Book returned: " + title);
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("This book was not issued.");
	    }

	    @Override
	    public void viewAvailableBooks() {
	        Node current = head;
	        System.out.println("Available Books:");
	        boolean found = false;
	        while (current != null) {
	            if (current.book.isAvailable()) {
	                System.out.println(current.book);
	                found = true;
	            }
	            current = current.next;
	        }
	        if (!found) {
	            System.out.println("No books are available.");
	        }
	    }

	    
	}