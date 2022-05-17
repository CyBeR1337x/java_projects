
public class MovieWithLength extends Movie {
	protected String time;
	
	public MovieWithLength(String title, String genre, double rating, int year, String time) {
		super(title, genre, rating, year);
		this.time = time;
	}
	
	public void update(String genre, double rating, int year, String time) {
		super.genre = genre;
		super.rating = rating;
		super.year = year;
		this.time = time;
	}
	
	public String toString() {
		return super.toString() + ", Time: " + this.time;
	}
	
	public int howOld(int curr_year) {
		return curr_year - super.year;
	}
	

}
