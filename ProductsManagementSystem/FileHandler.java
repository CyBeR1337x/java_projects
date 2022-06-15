public interface FileHandler {
	public String path1 = "products.txt";
	
	public void saveInFile(String path, String data);
	public String getFromFile(String path);
}
