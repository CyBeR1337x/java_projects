//Create a class “Main” having main method to perform following tasks.
//1. Create two objects of Subject class having value “Math, 99.9” and “Physics, 98.9” respectively.
//2. Display the values of both objects
//3. Change the value of object from 99.9 to 89.9
//4. Compare both objects and display the values of the subject which have lowest score.
public class Main {
	
	public static void main(String[] args) {
		Subject s1 = new Subject(), s2 = new Subject();
		
		s1.set("Math", 99.9);
		s2.set("Physics", 98.9);
		
		s1.display();
		s2.display();
		
		s1.set(89.9);
		
		if (s1.greaterThan(s2))
			s2.display();
		else 
			s1.display();
		
		
	}

}
