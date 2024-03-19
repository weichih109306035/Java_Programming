
public class Item {
	private int ID;
	private String name;
	private double price;
	public Item(int ID, String name, double price) {
		this.ID=ID;
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public double getPrice(){
		return price;
	}
	public double getID(){
		return ID;
	}
	
}
