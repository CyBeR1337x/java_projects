
public class Movie {
	private String title;
	protected String genre;
	protected double rating;
	protected int year;
	
	public Movie(String title, String genre, double rating, int year) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.year = year;
	}
	
	public Movie(Movie movie) {
		this(movie.title, movie.genre, movie.rating, movie.year);
	}
	
	public void set(String genre, double rating, int year) {
		this.genre = genre;
		this.rating = rating;
		this.year = year;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String toString() {
		return "Title: " + this.title + ", Genre: " + this.genre + ", Year: " + this.year + ", Rating: " + this.rating;
	}

}
