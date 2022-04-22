/*
 * Create a class for Subject containing the Name of the subject and score of the subject. There should
be following methods:
1. set: it will take two arguments name and score, and set the values of the attributes. If score is
less than 0 or greater than 100.0 then a message should be displayed “Incorrect score” and
score should be set to Zero.
2. set: it will take one double value as argument and set the value of score only. If score is less
than 0 or greater than 100.0 then a message should be displayed “Incorrect score” and score
should be set to Zero.
3. display: it will display the name and score of the subject. Like “Name : Math, Score: 99.9”
4. getScore: it will return the value of score.
5. greaterThan: it will take subject’s object as argument, compare the calling object’s score with
argument object’s score and return true if the calling object has greater score.
Create a class “Main” having main method to perform following tasks.
1. Create two objects of Subject class having value “Math, 99.9” and “Physics, 98.9” respectively.
2. Display the values of both objects
3. Change the value of object from 99.9 to 89.9
4. Compare both objects and display the values of the subject which have lowest score.
 */
public class Subject {
	private String name;
	private double score;
	
	public boolean greaterThan(Subject s1) {
		if (this.score > s1.score)
			return true;
		else 
			return false;
	}
	
	public void set(String name, double score) {
		this.name = name;
		
		if (score > 100 || score < 0) {
			System.out.println("Invalid Score");
			this.score = 0;
		} 
		else 
			this.score = score;
	}
	
	public void set(double score) {
		if (score > 100 || score < 0) {
			System.out.println("Invalid Score");
			this.score = 0;
		} 
		else 
			this.score = score;
	}
	
	public void display() {
		System.out.println("Name: " + this.name + ", Score: " + this.score);
	}
	
	public double getScore() {
		return this.score;
	}

}
