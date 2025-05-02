import java.util.ArrayList;

public class Product {
	
	private static ArrayList<Product> productList = new ArrayList<>();
	
	private int id;
	private String description;
	private String name;
	private String category;
	private String brand;
	
	public int getId(){
		return id;
	}
	
	public String getDecsription() {
		return description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void addProduct(String name, String description, String category, String brand, double cost, double quant){
	
	}
	
	public void editProduct(String name, String description, String category, String brand) {
		
	}
	
	public void deleteProduct(int id) {
		
	}
	
	public Product findProductByID(int id) {
		for (Product p: productList) {
			if(p.getId() == id) {
				return p;
			}
		}
		return null;
	}
	
}
