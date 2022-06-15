import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class ProductMenu implements FileHandler {
	
	private Product[] products;
	private static java.util.Scanner input = new java.util.Scanner(System.in);
	public void productMenu() {
		int option = -1;
		do {
			System.out.println("PRODUCT MENU");
			System.out.println("1. Add Product");
			System.out.println("2. Remove Product");
			System.out.println("3. Sell A Product");
			System.out.println("4. Show All Products");
			System.out.println("5. Store Data");
			System.out.println("6. Retreive Data");
			System.out.println("7. Exit");
			System.out.print("Enter Choice: ");
			option = input.nextInt();
			parseMenu(option);
		} while(option != 8);

	}
	public void parseMenu(int option) {
		if (option == 1) 
			addProduct();
		else if (option == 2)
			removeProduct();
		else if (option == 3) 
			sellProduct();
		else if (option == 4)
			showAllProducts();
		else if (option == 5) 
			storeData();
		else if (option == 6) 
			loadData();
		else 
			System.exit(0);
	}
	
	
	public void addProduct() {
		System.out.println("ADD PRODUCT");
		System.out.print("Enter Product ID: ");
		int id = input.nextInt();
		input.nextLine();
		System.out.print("Enter Product Name: ");
		String name = input.nextLine();
		System.out.print("Enter Product Quantity: ");
		int qt = input.nextInt();
		System.out.print("Enter Product Purchase Price: ");
		int pprice = input.nextInt();
		System.out.print("Enter Product Sale Price: ");
		int sprice = input.nextInt();
		insertProduct(new Product(id, name, qt, pprice, sprice));
		System.out.println("Product Entered SucuessFully..");
	}
	
	
	public void removeProduct() {
		System.out.println("DELETE PRODCUT");
		System.out.print("Enter ID of Product: ");
		int id = input.nextInt();
		deleteProduct(id);
	}
	
	public void deleteProduct(int id) {
		Boolean found = false;
		Product[] temp = new Product[products.length - 1];
		int tmp_index = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i].getProductId() == id)
				found = true;
			else if (tmp_index == temp.length) //well..
				continue;
			else 
				temp[tmp_index++] = products[i];
		}
		
		if (!found) 
			System.out.println("Id Not Found try again");
		else 
			products = temp;
	}
	
	public void insertProduct(Product prod) {
		if (products == null) 
			products = new Product[] { prod };
		else {
			Product[] tempProd = new Product[products.length + 1];
			for (int i = 0; i < products.length; i++) 
				tempProd[i] = products[i];
			
			tempProd[products.length] = prod;
			products = tempProd;
		}
	}
	
	public void sellProduct() {
		if (products == null)
			System.out.println("No Data exists");
		else {
			System.out.print("Enter ID of Product: ");
			int id = input.nextInt();
			System.out.print("Enter Quantity of Product: ");
			int qt = input.nextInt();
			int prod_index = getProductById(id);
			if (prod_index == -1) 
				System.out.println("Invalid ID..");
			else {
				if (qt > products[prod_index].getQuantity()) 
					System.out.println(qt + " " +products[prod_index].getName() + " Not available ..");
				else {
					products[prod_index].setQuantity(products[prod_index].getQuantity() - qt);
					System.out.println("Bill: ");
					System.out.println("Sell Price: " + products[prod_index].getSPrice());
					System.out.println("Quantity: " + qt);
					System.out.println("TotalBill: " + (products[prod_index].getSPrice() * qt));
				}	
			}
		}

	}
	public int getProductById(int id) {
		int index = -1;
		for (int i = 0; i < products.length; i++) {
			if (products[i].getProductId() == id) {
				index = i;
				break;
			}
			
		}
		return index;
	}
	
	public void showAllProducts() {
		if (products == null) System.out.println("Data doesn't Exist..");
		for (Product producttemp: products) {
			System.out.println(producttemp.toString());
			
		}
	} 
	
	public void storeData() {
		if (products == null)
			System.out.println("Data doesn't exist");
		else {
			String data = "";
			for (Product product: products)
				data += product.getObjectData() + "#";
			
			saveInFile("products.txt", data);
		}
	}
	
	public void saveInFile(String path, String data) {
		File file = new File(path);
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(data);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void loadData() {
		String data = getFromFile("products.txt");
		if (data == "") 
			System.out.println("No Data Exists...");
		else {
			String products = data;
			
			String prxx[] = products.split("#");
			
			for (int i = 0; i < prxx.length; i++) {
				String[] datax = prxx[i].split(";");
				int id = Integer.parseInt(datax[0].trim());
				String name = datax[1].trim();
				int qt = Integer.parseInt(datax[2].trim());
				double p_price = Double.parseDouble(datax[3].trim());
				double s_price = Double.parseDouble(datax[4].trim());
				insertProduct(new Product(id, name, qt, p_price, s_price));
			}
		}
	}
	
	public String getFromFile(String path) {
		File file = new File(path);
		String data = "";
		if (file.exists()) {
			try {
				Scanner fileReader = new Scanner(file);
				data = fileReader.nextLine();
				fileReader.close();				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Data Loaded SuccessFully...");
		}
		else 
			System.out.println("No Data exists.");
		
		return data;
	}
}
