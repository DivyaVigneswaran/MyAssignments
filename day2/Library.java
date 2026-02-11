package week2.day2;

public class Library {

	public String addBook(String bookTitle) {
		//System.out.println("Hi");
		return bookTitle;

	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book = new Library();
		String addBook = book.addBook("Two States");
		System.out.println(addBook);
		book.issueBook();

	}

}
