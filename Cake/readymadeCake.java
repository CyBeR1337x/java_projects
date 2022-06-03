package cake;

public class readymadeCake extends Cake {
	int quantity;
	public readymadeCake(String name, double rate, int quantity) {
		super(name, rate);
		this.quantity = quantity;
	}
	
	public double calcPrice() {
		return super.rate * quantity;
	}

}
