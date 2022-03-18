import java.util.Scanner;
public class Employee {
	private String name;
	private String designation;
	private int age;
	private float salary;
	
	void setName(String e_name) {
		name = e_name;
	}
	
	void setDesignation(String e_desig) {
		designation = e_desig;
	}
	
	void setAge(int e_age) {
		age = e_age;
	}
	
	void setSalary(float e_sal) {
		salary = e_sal;
	}
	
	void printEmployee() {
		System.out.println("Name: " 		+ name);
		System.out.println("Designation: " 	+ designation);
		System.out.println("Age: " 			+ age);
		System.out.println("Salary: " 		+ salary);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		Employee emp_1 = new Employee();
		
		//Input.....
		System.out.print("Enter Name: ");
		emp_1.setName(input.nextLine());
		
		System.out.print("Enter Designation: ");
		emp_1.setDesignation(input.nextLine());
		
		System.out.print("Enter Age: ");
		emp_1.setAge(input.nextInt());
		
		System.out.print("Enter Salary: ");
		emp_1.setSalary(input.nextFloat());
		
		//Displaying Info...
		emp_1.printEmployee();
		
		
		/*
		 * NOTES: 
		 * YOU CAN CREATE MORE OBJECTS OF EMPLOYEE CLASS
		 * LIKE I DID ABOVE..
		*/
		
		input.close();
	}

}
