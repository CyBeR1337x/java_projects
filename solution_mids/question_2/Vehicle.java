import java.util.Scanner;
public class Vehicle {
	private String color;
	private double speed;
	private double fuel;
	public String state;
	
	
	public static Scanner obj = new Scanner(System.in);
	
	public void input() {
		System.out.print("Enter Color: ");
		this.color = obj.nextLine();
		
		System.out.print("Enter Fuel: ");
		this.fuel = obj.nextDouble();
		
		this.state = "stopped";
		this.speed = 0;
	}
	
	public double addFuel() {
		System.out.print("Enter Fuel: ");
		double fuelx = obj.nextDouble();
		
		fuel += fuelx;
		return fuel;
	}
	
	public void moving() {
		System.out.print("Enter Speed: ");
		this.speed = obj.nextDouble();
		
		System.out.print("Enter Fuel: ");
		this.fuel -= obj.nextDouble();
		
		this.state = "Moving";
	}
	
	
	public void stop() {
		System.out.println("Vehicle is Stopped.");
		this.speed = 0;
		this.state = "Stopped";
	}
	
	public void display() {
		System.out.println("Vehicle is " + this.state + " .It has " + this.color + " color. It's speed is " + this.speed + " and fuel is " + this.fuel + " Liter");
	}
}
