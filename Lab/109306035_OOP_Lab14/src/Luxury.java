import java.util.ArrayList;

public class Luxury implements Item{
	private int ID;
	private double price;
	private double shippingFee;
	private ArrayList<Double> discountRateList;
	public Luxury(int ID, double price, double shippingFee, ArrayList<Double> discountRateList) {
		this.ID=ID;
		this.price=price;
		this.shippingFee=shippingFee;
		this.discountRateList=discountRateList;
	}
	@Override
	public double calcDiscount(int num) {
		// TODO Auto-generated method stub
		double d=0;
		if(discountRateList.size()>0) {
			if(num>=discountRateList.size()) {
				d=discountRateList.get(discountRateList.size()-1)*num*price;
			}
			else {
				d=discountRateList.get(num-1)*num*price;
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
		return shippingFee*num;
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
