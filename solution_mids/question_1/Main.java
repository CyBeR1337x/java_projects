public class Main {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setValues(3.2, 4.5);
		System.out.println("Width: " + r1.getWidth());
		System.out.println("Length: " + r1.getLength());
		r1.displayPerimter();
		r1.displayArea();
		
		Rectangle r2 = new Rectangle();
		r2.setValues(20, 36);
		System.out.println("Width: " + r2.getWidth());
		System.out.println("Length: " + r2.getLength());
		r2.displayPerimter();
		r2.displayArea();
	}

}
