/*
 * Create a class named “Rectangle” having length and width as attribute. There should be
behaviors to set the values of length and width (individually and collectively), and get their
values individually. There should also be behavior to display the perimeters and area of the
rectangle.
Create another class named as Main which has two objects of Rectangle (r1, r2) having length
(3.2, 20) and width (4.5, 36) respectively. Also display the length, width, perimeter and area
of both rectangles.
 */
public class Rectangle {
	private double length, width;
	
	public void setValues(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void displayPerimter() {
		System.out.println("Perimeter: " + (2*(this.length + this.width)));
	}
	
	public void displayArea() {
		System.out.println("Area: " + (this.length * this.width));
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
}
