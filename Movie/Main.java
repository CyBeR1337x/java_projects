package week_11_task;

public class Main {
	public static void main(String[] args) {
		MovieWithLength[] movies = new MovieWithLength[3];
		
		movies[0] = new MovieWithLength("Pirates of the Carribean: The Curse of the Black Pearl.", 
				"Adventure", 
				9.2, 
				2004, 
				"140.2min"
			);
		movies[1] = new MovieWithLength("Pirates of the Carribean: Dead Mans's Chest.", 
				"Adventure", 
				9.8, 
				2006, 
				"138.2min"
			);
		
		movies[2] = new MovieWithLength("Pirates of the Carribean: At world's End.", 
				"Adventure", 
				9.8, 
				2008, 
				"122.2min"
				);
		
		movies[0].update("Adventure", 8.8, 2019, "200.2min");
		
		System.out.println(movies[0].toString());
		int diff = movies[2].howOld(2022);
		System.out.println("Difference of 3 movie:" + diff);
		System.out.println(movies[1].toString());
		System.out.println(movies[2].toString());
		
	}

	
	

}
