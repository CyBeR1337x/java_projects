/*
     CODE BY: SIR Afrasiab Kaikobad
     ALL RIGHTS RESERVED ©
*/



import java.util.Scanner;

public class Menu02 {
	public static void main(String[] args) {
		menu();
	}
	public static void menu ()
	{
		System.out.print("Enter size of array:");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int number_array[] = new int[size];
		int option = 0;
		do {
			System.out.println("1. Display the array");
			System.out.println("2. Input value at index");
			System.out.println("3. Sum of all values");
			System.out.println("4. Find the largest value");
			System.out.println("5. Find the smallest value");
			System.out.println("6. Exit");
			option = input.nextInt();
			
			switch (option) {
			case 1:
				display(number_array);
				break;
			case 2:
				inputAt(number_array);
				break;
			case 3:
				sum(number_array);
				break;
			case 4:
				largestValue(number_array);
				break;
			case 5:
				minimumValue(number_array);
				break;
			}
		} while (option != 6);
	}
	
	public static void display(int number_array[]) {
		for (int i = 0; i < number_array.length; i++) {
			System.out.println("Value at "+i+" is "+number_array[i]);
		}			
	}
	
	public static void inputAt(int number_array[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number:");
		int temp = input.nextInt();
		int index;
		do {
			System.out.print("Enter index (0 - "+(number_array.length -1) +"): ");
			index = input.nextInt();
			if(index < 0 || index >= number_array.length)
			{
				System.out.println("Incorrect Index, Try again!!!");
			}
		}while(index < 0 || index >= number_array.length);
		number_array[index] = temp;
	}
	
	public static void sum(int number_array[])
	{
		int sum = 0;
		for (int i = 0; i < number_array.length; i++) {
			sum += number_array[i];
		}
		System.out.println("Sum is "+sum);
	}
	
	public static void largestValue(int number_array[]) {
		int largest = number_array[0];
		for (int i = 1; i < number_array.length; i++) {
			if(largest < number_array[i])
			{
				largest = number_array[i];
			}
		}
		System.out.println("Largest Value is "+largest);
	}
	
	public static void minimumValue(int number_array[]) {
		int minimum = number_array[0];
		for (int i = 1; i < number_array.length; i++) {
			if(minimum > number_array[i])
			{
				minimum = number_array[i];
			}
		}
		System.out.println("Minimum Value is "+ minimum);
	}
}
