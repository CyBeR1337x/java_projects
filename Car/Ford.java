
public class Ford extends Car {
	protected int year;
	protected int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int man) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = man;
	}
	
	public double getSalePrice() {
		return super.getSalePrice() - this.manufacturerDiscount;
	}
	
	

}
