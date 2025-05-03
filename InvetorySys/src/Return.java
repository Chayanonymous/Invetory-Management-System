import java.util.Date;

public class Return extends Product{


	public Return(int id, String name, String category, String brand, int quant, double cost) {
		super(id, name, category, brand);
		this.quant = quant;
		this.cost = cost;
	}

	private int quant;
	private boolean availability;
	private double cost;
	private Date datein;
	private String condition;
	private boolean openBox;
	
	public void  addProduct(double cost, double quant) {
		
	}

}
