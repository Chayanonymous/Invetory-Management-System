
public class Stock extends Product{
	
	private boolean availability;
	private double cost;
	private int quant;
	
	public Stock(int id, double cost, int quant, boolean availability) {
		super(id);
		this.availability = availability;
		this.cost = cost;
		this.quant = quant;
		
	}
	
	public boolean getAvailability() {
		return availability;
	}
	
	public double getCost() {
		return cost;
	}
	
	public int getQuant() {
		return quant;
	}
	
	public void addStock(double cost, int quant) {
		this.cost = cost;
		this.quant += quant;
		this.availability = true;
	}
	
	public void editStock(int id, double cost, int quant) {
		if(this.getId()== id) {
			this.cost = cost;
			this.quant = quant;
		}
	}
	
	public void deleteStock(int id) {
		if(this.getId()== id) {
			this.quant = 0;
			this.availability = false;
		}
	}
	
	@Override
    public String toString() {
        return "Product ID: " + getId() +
               ", Quantity: " + quant +
               ", Cost: " + cost +
               ", Availability: " + availability;
    }
	
}
