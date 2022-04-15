import java.util.Scanner;

public class Main {
	public static void main(String[] ag) {
		Scanner input = new Scanner(System.in);
		char x = 'y';
		do {
			System.out.print("Enter Size: ");
			String size = input.nextLine();
			System.out.print("Enter no. of toppings: ");
			int toppings = input.nextInt();
			input.nextLine();
			
			Pizza p1 = new Pizza();
			p1.updateValues(size, toppings);
			p1.calcCost(size, toppings);
			p1.display();
			
			System.out.print("Do you wish to continue? (y/Y): ");
			x = input.nextLine().charAt(0);
		
		} while (x == 'Y' || x == 'y');
	}
}
