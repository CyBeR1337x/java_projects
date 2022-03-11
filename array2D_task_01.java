import java.util.Scanner;
public class Main {
	
	public static void main(String[] g) {
		Scanner input = new Scanner(System.in);
		int size;
		System.out.print("Enter Size of array: ");
		size = input.nextInt();
		int[] array = new int[size];
		System.out.println("Enter a number: (" + size + " times) ");
		for (int i = 0; i < array.length; i++) 
			array[i] = input.nextInt();
		
		int x = 0, count = 0;
		System.out.print("Enter a number to be searched: ");
		x = input.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == x)
				count++;
		}
		if (count != 0)
			System.out.println("The number(" + x + ") occured " + count + " times in your input.");
		else 
			System.out.println("Not Found..");
		
		
	}
	

}
