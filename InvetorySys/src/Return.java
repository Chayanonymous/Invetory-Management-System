import java.util.Date;
import java.util.ArrayList
;
public class Return extends Product{

	private int quant;
	private double cost;
	private Date dateIn;
	private String condition;
	private boolean openBox;
	private static ArrayList<Return> returnList = new ArrayList<>();
	
	public Return(int id, String name, String category, String brand, int quant, double cost, Date dateIn) {
		super(id, name, category, brand);
		this.quant = quant;
		this.cost = cost;
		this.dateIn = dateIn;
	}
	
	public int getQuant() {
		return quant;
	}
	
	public Date getDate() {
		return dateIn;
	}
	
	
	public void  addProduct(Return r) {
		returnList.add(r);
	}
	
	public static ArrayList<Return> getAllReturns(){
		return returnList;
	}
	
	public String toString() {
        return "Return Product: " + getName() +
               ", Quantity: " + quant +
               ", Cost: $" + cost +
               ", Condition: " + condition + 
               ",Open Box: " + openBox +
               ", Date In: " + dateIn;
    }

}
