
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
	
}
