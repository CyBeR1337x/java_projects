package cake;

public class orderCake extends Cake {
	double weight;
	public orderCake(String name, double rate, double weight) {
		super(name, rate);
		this.weight = weight;
	}
	
	public double calcPrice() {
		return super.rate * weight;
	}

}
