package pa3;

public class Vegetable extends Produce{
	private double price;
	private int quantity;
	public Vegetable(String name,double price,int quantity) {
		super(name);
		this.price=price;
		this.quantity=quantity;
		
		
	
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "[price=" + price + ", quantity=" + quantity +" ," + super.getName()+ " is a vegetable]";
	}
	
	

}
