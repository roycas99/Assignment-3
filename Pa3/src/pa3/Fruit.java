package pa3;

public class Fruit extends Produce {
	private double price;
	private int quantity;

	public Fruit(String name, double price,int quantity) {
		super(name);
		this.price=price;
		this.quantity=quantity;
		
	}

	@Override
	public String toString() {
		return "[price=" + price + ", quantity=" + quantity + ", "+ super.getName()+ " is a Fruit]";
	}
	
	

}
