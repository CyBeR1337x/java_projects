
public class MyOwnAutoShop {
	public static void main(String[] args) {
		
		Truck truck = new Truck(250, 87000, "Black", 950);
		System.out.println("Sale Price of Truck: " + truck.getSalePrice());
		
		Ford ford = new Ford(222, 78777, "Blue", 2022, 7600);
		System.out.println("Sale Price of Ford: " + ford.getSalePrice());
		
		Ford ford2 = new Ford(256, 980000, "Cyan", 2022, 9888);
		System.out.println("Sale Price of Ford 2: " + ford2.getSalePrice());
		
		Sedan sedan = new Sedan(221, 857000, "Yellow", 22);
		System.out.println("Sale Price of Ford: " + sedan.getSalePrice());
		
		Car car = new Car(766, 69999, "Red");
		
	}

}
