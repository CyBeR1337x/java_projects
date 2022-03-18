
import java.util.Scanner;
public class Student {
	public String name;
	public String address;
	public String gender;
	public int age;
	public int contact_no;
	
	//For Input
	public void getInformation() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = input.nextLine();
		System.out.print("Enter Gender: ");
        gender = input.nextLine();
		System.out.print("Enter Address: ");
		address = input.nextLine();
		System.out.print("Enter Age: ");
		age = input.nextInt();
		System.out.print("Enter Contact Number: ");
		contact_no = input.nextInt();
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public int getContactNo() {
		return contact_no;
	}
	
	public void showPersonData() {
		System.out.println("Name: " 		+ name);
		System.out.println("Age: " 			+ age);
	}

}
