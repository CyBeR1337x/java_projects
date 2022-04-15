import java.util.Scanner;

public class Pizza {
	private String size;
	private int toppings;
	private double price;
	private static double total_price = 0;
	
	public Pizza() {
		this.size = null;
		this.toppings = 0;
	}
	
	public void updateValues(String size, int toppings) {
		this.size = size;
		this.toppings = toppings;
	}
	
	public double calcCost(String Dsize, int Dtoppings) {
		this.price = 0;
		if (Dsize.compareToIgnoreCase("small") == 0) 
			this.price = 1000 + (2 * Dtoppings);
		else if (Dsize.compareToIgnoreCase("medium") == 0) 
			this.price = 1200 + (2 * Dtoppings);
		else if (Dsize.compareToIgnoreCase("large") == 0) 
			this.price = 1400 + (2 * Dtoppings);
		total_price += price;
		return total_price;
		
	}
	
	public void display() {
		System.out.println("Size: " + this.size);
		System.out.println("Toppings: " + this.toppings);
		System.out.println("Price: " + total_price );
	}

}
