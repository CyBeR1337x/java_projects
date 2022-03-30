import java.util.Scanner;
public class Main {
	public static void main(String[] x) {
		Scanner input = new Scanner(System.in);
		Student[] s1 = new Student[10];
		int index = -1;
		do {
			int state;
			System.out.println("1. Add new student");
			System.out.println("2. Update name using ID");
			System.out.println("3. Update Age using ID");
			System.out.println("4. Update Class using ID");
			System.out.println("5. Display all");
			System.out.println("6. Show a specific student based on ID");
			System.out.println("7. Show names of all Students");
			System.out.println("8. Show ages of all students");
			System.out.println("9. Show classes of all students.");
			System.out.print("Enter your choice: ");
			state = input.nextInt();
			
			if(state == 1) {
				index++;
				if (index == 10) 
					System.out.println("Limit reached..");
				else {
					String name, s_class;
					int id, age;
					System.out.print("Enter Name: ");
					name = input.nextLine();
					input.nextLine();
					System.out.print("Enter Class: ");
					s_class = input.nextLine();
					System.out.print("Enter Age: ");
					age = input.nextInt();
					System.out.print("Enter ID: ");
					id = input.nextInt();
					s1[index] = new Student(name, s_class, age, id);
				}

			}
			else if (state == 2) {
				if (index == -1) 
					System.out.println("Data doesn't Exist");
				else {
					System.out.println("Enter Id: ");
					int id = input.nextInt();
					input.nextLine();
					System.out.println("Enter Name: ");
					String name = input.nextLine();
					
					s1[index].updateName(s1, name, id, index);
				}
			}
			else if (state == 3) {
				if (index == -1) 
					System.out.println("Data doesn't Exist");
				else {
					System.out.println("Enter Id: ");
					int id = input.nextInt();
					System.out.println("Enter Age: ");
					int age = input.nextInt();
					
					s1[index].updateAge(s1, age, id, index);
				}
			}
			else if (state == 4) {
				if (index == -1) 
					System.out.println("Data doesn't Exist");
				else {
					System.out.println("Enter Id: ");
					int id = input.nextInt();
					System.out.println("Enter Age: ");
					String s_class = input.nextLine();
					
					s1[index].updateClass(s1, s_class, id, index);
				}
			}
			else if (state == 5) {
				if (index == -1) 
					System.out.println("Data doesn't Exist");
				else 
					s1[index].showAll(s1, index);
				
			}
			else if (state == 6) {
				if (index == -1) 
					System.out.println("Data doesn't Exist");
				else {
					System.out.print("Enter Id:" );
					int id = input.nextInt();
					s1[index].showOne(s1, id, index);
				}
				
			}
			else if (state == 7) {
					if (index == -1) 
						System.out.println("Data doesn't Exist");
					else 
						s1[index].showNames(s1, index);
					
			}
			else if (state == 8) {
				if (index == -1) 
					System.out.println("Data doesn't Exist");
				else 
					s1[index].showAge(s1, index);
				
			}
			else if (state == 9) {
				if (index == -1) 
					System.out.println("Data doesn't Exist");
				else 
					s1[index].showClasses(s1, index);
				
			}
			else
				break;
		} while(true);
		
		input.close();
	}

}
