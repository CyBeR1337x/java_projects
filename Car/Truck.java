
public class Truck extends Car {
	protected int weight;
	
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	
	public double getSalePrice() {
//		double price = 0;
		if (weight > 2000) 
			return super.getSalePrice()-(super.getSalePrice() * ((double)10/100));
		else 
			return super.getSalePrice()-(super.getSalePrice() * ((double)20/100));
		
//		return price;
	}
	
	

}
