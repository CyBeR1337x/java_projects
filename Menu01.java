/*
     CODE BY: SIR Afrasiab Kaikobad
     ALL RIGHTS RESERVED ©
*/

import java.util.Scanner;

public class Menu01 {

	public static void main(String[] args) {
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
				for (int i = 0; i < number_array.length; i++) {
					System.out.println("Value at "+i+" is "+number_array[i]);
				}				
				break;
			case 2:
				System.out.print("Enter number:");
				int temp = input.nextInt();
				int index;
				do {
					System.out.print("Enter index (0 - "+(size -1) +"): ");
					index = input.nextInt();
					if(index < 0 || index >= size)
					{
						System.out.println("Incorrect Index, Try again!!!");
					}
				}while(index < 0 || index >= size);
				number_array[index] = temp;
				break;
			case 3:
				int sum = 0;
				for (int i = 0; i < number_array.length; i++) {
					sum += number_array[i];
				}
				System.out.println("Sum is "+sum);
				break;
			case 4:
				int largest = number_array[0];
				for (int i = 1; i < number_array.length; i++) {
					if(largest < number_array[i])
					{
						largest = number_array[i];
					}
				}
				System.out.println("Largest Value is "+largest);
				break;
			case 5:
				int minimum = number_array[0];
				for (int i = 1; i < number_array.length; i++) {
					if(minimum > number_array[i])
					{
						minimum = number_array[i];
					}
				}
				System.out.println("Minimum Value is "+ minimum);
				break;
			}
		} while (option != 6);
	}
}







