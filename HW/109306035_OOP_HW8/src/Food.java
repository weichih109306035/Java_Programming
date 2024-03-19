
public class Food {
	private String name;
	private int id;
	private double price;
	private double pro;
	private double car;
	private double fat;
	public Food (int id,String name,double price,double pro,double car,double fat) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.pro=pro;
		this.car=car;
		this.fat=fat;
	}
	public double calories() {
		double cal=0;
		cal=pro*4+car*4+fat*9;
		return cal;
	}
	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	public double getPrice() {
		return price;
	}

}
