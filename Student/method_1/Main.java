public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		//Taking input...
		s1.getInformation();
		
		s2.getInformation();
		
		s3.getInformation();
		
		//Displaying Name & Age of youngest Student..
		System.out.println("Name & Age of Youngest Student: ");
		if (s1.age < s2.age && s1.age < s3.age)
			s1.showPersonData();
		else if (s2.age < s1.age && s2.age < s3.age)
			s2.showPersonData();
		else 
			s3.showPersonData();

	}
}
