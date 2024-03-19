import java.util.ArrayList;
public class Furniture implements Item{
	private int ID;
	private double price;
	private double weight;
	private double weightShippingFee;
	private ArrayList<Double> discountsList;
	public Furniture(int ID, double price, double weight, double weightShippingFee, ArrayList<Double>discountsList) {
		this.ID=ID;
		this.price=price;
		this.weight=weight;
		this.weightShippingFee=weightShippingFee;
		this.discountsList=discountsList;
	}
	@Override
	public double calcDiscount(int num) {
		// TODO Auto-generated method stub
		double d=0;
		if(discountsList.size()>0) {
			if(num>discountsList.size()) {
				d=discountsList.get(discountsList.size()-1);
			}
			else {
				d=discountsList.get(num-1);
			}
		}
		else {
			d=0;
		}
		return d;
	}
	@Override
	public double calcShippingFee(int num) {
		// TODO Auto-generated method stub
		return num*weight*weightShippingFee;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}

}
