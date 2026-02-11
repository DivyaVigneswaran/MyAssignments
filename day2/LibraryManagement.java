package week2.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		String addbook = lib.addBook("Hello");
		System.out.println(addbook);
		lib.issueBook();
	}

}
