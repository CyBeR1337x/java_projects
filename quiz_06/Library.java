package quiz_06;

public class Library {
	private Book[] books;
	
	public void addBook() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter AUthor: ");
		String author = input.nextLine();
		System.out.print("Enter Title: ");
		String title = input.nextLine();
		System.out.print("Enter ISBN:" );
		int isbn = input.nextInt();
		input.nextLine();
		Book book = new Book(title, author, isbn);

		insertBook(book);
	}
	
	public void insertBook(Book book) {
		if (books == null) 
			books = new Book[] {book};
		else {
			Book[] temp = new Book[books.length + 1];
			for (int i = 0; i < books.length; i++)
				temp[i] = books[i];
			
			temp[temp.length - 1] = book;
			books = temp;
		}
	}
		
	public void displayAllBooks() {
		for (int j = 0; j < books.length; j++) 
			System.out.println(books[j].toString());
	}
	
	public void displayBookByISBN() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("ENTER ISBN: ");
		int isbn = input.nextInt();
		boolean isFound = false;
		for (Book book: books) {
			if (book.getIsbn() == isbn) {
				System.out.println(book.toString());
				isFound = true;
				break;
			}
		}
		if (!isFound) System.out.println("Book Not Found..");
	}

}
