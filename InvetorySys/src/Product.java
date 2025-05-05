import java.util.ArrayList;

public class Product {
	
	private static ArrayList<Product> productList = new ArrayList<>();
	
	private int id;
	private String name;
	private String category;
	private String brand;
	
	public Product(int id, String name, String category, String brand) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.brand = brand;
	}
	
	public Product(int id) {
		this.id = id;
	}
	// Getters
	public int getId(){
		return id;
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
	
	// Methods
	public void addProduct(Product p){
		if (findProductById(p.getId()) != null) {
			System.out.println("It Already Exists!");
			
		}
		else {
			productList.add(p);
			System.out.println("Product Added: " + p.getName());
		}
	}
	
	public void editProduct(String name, String category, String brand) {
		this.name = name;
		this.category = category;
		this.brand = brand;
		
	}
	
	public static Product deleteProduct(int id) {
		Product toRemove = findProductById(id);
		if(toRemove != null) {
			productList.remove(toRemove);
			System.out.println("Product " + toRemove.getName() + " removed");
		}
		else {
			System.out.println("Not found");
		}
		return toRemove;
		
	}
	
	public static Product findProductById(int id) {
		for (Product p: productList) {
			if(p.getId() == id) {
				return p;
			}
		}
		return null;
	}
	
	public static ArrayList<Product> getAllProducts() {
        return productList;
	}
	
	@Override
	public String toString() {
		return "Product [ID=" + id + ", Name=" + name + ", Category=" + category + ", Brand=" + brand + "]";
	}
	
}
