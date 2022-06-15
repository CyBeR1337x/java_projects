public class Product {
	private int productId;
	private String product_name;
	private int product_quantity;
	private double product_p_price;
	private double product_s_price;
	
	public Product(int id, String name, int qt, double p_price, double s_price) {
		productId = id;
		product_name = name;
		product_quantity = qt;
		product_p_price = p_price;
		product_s_price = s_price;
	}
	
	public void set(int id) {
		
	}
	public int getProductId() {
		return productId;
	}
	
	public String getName() {
		return product_name;
	}
	
	public int getQuantity() {
		return product_quantity;
	}
	
	public double getPPrice() {
		return product_p_price;
	}
	
	public double getSPrice() {
		return product_s_price;
	}
	
	public String toString() {
		return "ID: " + this.productId + ", Name: " + this.product_name + 
				", Quantity: " + this.product_quantity + ", Purchase Price: " + this.product_p_price +
				", Sale Price: " + this.product_s_price;
	}
	
	public String getObjectData() {
		return this.productId + ";" + this.product_name + ";" + this.product_quantity + ";" + this.product_p_price +
				";" + this.product_s_price; 
	}
	
	public void setQuantity(int quantity) {
		this.product_quantity = quantity;
	}
}
