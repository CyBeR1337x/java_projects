package cake;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		Cake[] cakes = new Cake[4];
		int index = -1;
		int state = 0;
		do {
			System.out.println("1. Order Cake");
			System.out.println("2. ReadyMade Cake");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			state = input.nextInt();
			input.nextLine();
			switch (state) {
			//index++;
			case 1:
				index++;
				System.out.print("Enter Name: ");
				String name = input.nextLine();
				System.out.print("Enter Weight of Cake: ");
				double weight = input.nextDouble();
				System.out.print("Enter Rate of Cake: ");
				double rate = input.nextDouble();
				cakes[index] = new orderCake(name, rate, weight);
				break;
			case 2:
				index++;
				System.out.print("Enter Name: ");
				String name2 = input.nextLine();
				System.out.print("Enter Quantity of Cake: ");
				int quantity = input.nextInt();
				System.out.print("Enter Rate of Cake: ");
				double rate2 = input.nextDouble();
				cakes[index] = new readymadeCake(name2, rate2, quantity);
				break;
			case 0:
				break;
				
			}
			
		} while(index < cakes.length-1);
		
		for (int i = 0; i < cakes.length; i++) {
			double price = cakes[i].calcPrice();
			System.out.println(cakes[i].toString());
			System.out.println("Price: " + price);
		}
		double highestPrice = cakes[0].calcPrice();
		int j = 0;
		for (int i = 1; i < cakes.length; i++) {
			if (highestPrice < cakes[i].calcPrice()) {
				j = i;
				highestPrice = cakes[i].calcPrice();
			}
		}
		
		System.out.println("Most Expensive Cake: ");
		System.out.println(cakes[j].toString());
		System.out.println("Price: " + highestPrice);
		
		double sum = 0;
		for (Cake cake: cakes) 
			sum += cake.calcPrice();
		System.out.println("Sum of all cakes: " + sum);
		
		

	}

}
