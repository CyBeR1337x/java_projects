
public class Main {
	
	public static void main(String[] args) {
		Date date1 = new Date(), date2 = new Date();

		System.out.println("Date 1");
		date1.getDate();
		date1.display();
		System.out.println("Date 2");
		date2.getDate();
		date2.display();
		
	    Date date3 = new Date();
	    date3  = date3.calDiffDate(date1, date2);
	    
	    
	    System.out.println("Difference in Days: " + date3.day + ", Months: " + date3.month + ", Years: " + date3.year);
	    
		
	}

}
