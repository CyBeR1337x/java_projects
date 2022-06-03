package cake;

public abstract class Cake {
	String name;
	double rate;
	public Cake(String n, double r) {
		name = n;
		rate = r;
	}
	
	public abstract double calcPrice();
	public String toString() {
		return name + "\t" + rate;
		
	}

}
