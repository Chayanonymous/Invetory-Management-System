import java.util.Date;

public class Return extends Product{


	public Return(int id, String name, String category, String brand) {
		super(id, name, category, brand);
		// TODO Auto-generated constructor stub
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
