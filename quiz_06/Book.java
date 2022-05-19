package quiz_06;

public class Book {
	private String author, title;
	private int isbn;
	private static int total_books;
	
	public Book(String title, String author, int isbn) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		total_books++;
	}
	
	public int getIsbn() {
		return this.isbn;
	}
	
	public String toString()  {
		return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
	}
	
	public static int getTotalBooks() {
		return total_books;
	}
	
	

}
