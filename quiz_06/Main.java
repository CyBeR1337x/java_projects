package quiz_06;

public class Main {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.addBook();
		lib.addBook();
		lib.displayAllBooks();
		lib.displayBookByISBN();
		System.out.println("Total books:" + Book.getTotalBooks());

	}

}
