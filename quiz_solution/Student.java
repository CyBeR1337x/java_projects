
public class Student {
	private String name;
	private String student_class;
	private int age;
	private int id;
	
	public Student(String name, String student_class, int age, int id) {
		this.name = name;
		this.student_class = student_class;
		this.age = age;
		this.id = id;
	}
	
	public void updateName(Student[] array, String name, int id, int limit) {
		int found = 0;
		
		for (int i = 0; i <= limit; i++) {
			if (id == array[i].id) {
				found = 1;
				array[i].name = name;
				break;
			}
			
			if (found == 0)
				System.out.println("Wrong ID try Again..");
		}
		
	}
	
	public void updateAge(Student[] array, int age, int id, int limit) {
		int found = 0;
		
		for (int i = 0; i <= limit; i++) {
			if (id == array[i].id) {
				found = 1;
				array[i].age = age;
				break;
			}
			
			if (found == 0)
				System.out.println("Wrong ID try Again..");
		}
		
	}
	
	public void updateClass(Student[] array, String student_class, int id, int limit) {
		int found = 0;
		
		for (int i = 0; i <= limit; i++) {
			if (id == array[i].id) {
				found = 1;
				array[i].student_class = student_class;
				break;
			}
			
			if (found == 0)
				System.out.println("Wrong ID try Again..");
		}
	}
	
	public void showAll(Student[] arr, int limit) {
		for (int i = 0; i <= limit; i++) {
			System.out.println("Id: " + arr[i].id + 
					", Name: " + arr[i].name + 
					", Age: " + arr[i].age + 
					", Class" + arr[i].student_class);
		}
		
	}
	
	public void showOne(Student[] arr, int id, int limit) {
		int found = 0;
		for (int i = 0; i <= limit; i++) {
			if (id == arr[i].id) {
				found = 1;
				System.out.println("Id: " + arr[i].id + 
						", Name: " + arr[i].name + 
						", Age: " + arr[i].age + 
						", Class: " + arr[i].student_class);
				break;
			}
		}
		
		if (found == 0) System.out.println("Wrong ID Try again..");
		
	}
	
	public void showNames(Student[] arr, int limit) {
		for (int i = 0; i <= limit; i++) {
			System.out.println("Name: " + arr[i].name);
		}
	}
	
	public void showAge(Student[] arr, int limit) {
		for (int i = 0; i <= limit; i++) {
			System.out.println("Age: " + arr[i].age);
		}
	}
	
	public void showClasses(Student[] arr, int limit) {
		for (int i = 0; i <= limit; i++) {
			System.out.println("Class: " + arr[i].student_class);
		}
	}

}
