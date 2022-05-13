
public class Sedan extends Car {
	protected int length;
	
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	public double getSalePrice() {
		if (this.length > 20)
			return super.getSalePrice() - (super.getSalePrice() * ((double)5/100));
		else 
			return super.getSalePrice() - (super.getSalePrice() * ((double)10/100));
	}

}
