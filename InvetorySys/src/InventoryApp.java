
public class InventoryApp {
	
	public static void main( String[] args) {
		Product p1 = new Product(101, "qwe", "boots", "abc");
		Product p2 = new Product(112, "ddd", "boots", "abc");
		Product p3 = new Product(201, "fff", "boots", "abc");
		
		Product product = new Product(0, null, null, null);
		product.addProduct(p1);
		product.addProduct(p2);
		product.addProduct(p3);
		
		for (Product p : Product.getAllProducts()) {
            System.out.println(p);
        }
		
		// Editing
		Product found = Product.findProductById(112);
		if (found != null) {
			found.editProduct("iii", "coo", "rtr");
		}
		
		// Deleting 
		Product dele = Product.deleteProduct(101);
		
		// final list
		System.out.println("\nUpdated Product List:");
        for (Product p : Product.getAllProducts()) {
            System.out.println(p);
        }
	}

}
