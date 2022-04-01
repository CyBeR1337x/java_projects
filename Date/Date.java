import java.util.Scanner;
public class Date {
	
	public int day;
	public int month;
	public int year;
	
	public void getDate() {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Day: " );
		this.day = obj.nextInt();
		System.out.print("Enter Month: " );
		this.month = obj.nextInt();
		System.out.print("Enter Year: " );
		this.year = obj.nextInt();
		
		if (this.day == 0 || this.day > 31)
			this.day = 1;
		
		if (this.month == 0 || this.month > 12)
			this.month = 1;
		
	}
	
	public void display() {
		System.out.println(this.day + "/" + this.month + "/" + this.year);
	}
	
	public Date calDiffDate(Date date1, Date date2) {
		Date newDate = new Date();
		newDate.day = date1.day - date2.day;
		newDate.month = date1.month - date2.month;
		newDate.year = date1.year - date2.year;
		
		if (newDate.day < 0)
			newDate.day = Math.abs(newDate.day);
		if (newDate.month < 0)
			newDate.month = Math.abs(newDate.month);
		if (newDate.year < 0)
			newDate.year = Math.abs(newDate.year);
		
		return newDate;
	}

}
