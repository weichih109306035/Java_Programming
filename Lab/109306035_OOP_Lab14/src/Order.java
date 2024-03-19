import java.util.ArrayList;
public class Order {
	private int ID;
	private ArrayList<Item> itemList;
	private ArrayList<Integer> quantities;
	private double subTotal;
	private double totalBenefit;
	private double shippingFee;
	private double orderTotal;
	private boolean isPaid;
	public Order(int ID) {
		this.ID=ID;
		itemList=new ArrayList<Item>();
		quantities=new ArrayList<Integer>();
		isPaid=false;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public int getID() {
		return ID;
	}
	public void addItem(Item item, int num) {
		if(!isPaid) {
			itemList.add(item);
			quantities.add(num);
		}
	}
	public String placeOrder(boolean isVIP) {
		subTotal=0;
		shippingFee=0;
		totalBenefit=0;
		if(!isPaid) {
			for(int i=0;i<itemList.size();i++) {
				subTotal+=itemList.get(i).getPrice()*quantities.get(i);
				shippingFee+=itemList.get(i).calcShippingFee(quantities.get(i));
				totalBenefit+=itemList.get(i).calcDiscount(quantities.get(i));
				if(isVIP) {
					totalBenefit=(subTotal-totalBenefit)*0.8;
				}
			}
			orderTotal+=subTotal-totalBenefit+shippingFee;
			isPaid=true;
			return getInfo();
		}
		else {
			return "Payment completed! Thanks!";
		}
	}
	public String getInfo() {
		String s="";
		s+="Order Summary\n";
		s+=String.format("%-11s%9s%10s\n","Item","Price","Quantity");
		s+="------------------------------\n";
		for(int i=0;i<itemList.size();i++) {
			s+=String.format("%-11s%9.2f%10s\n", itemList.get(i).getID(),itemList.get(i).getPrice(),quantities.get(i));
		}
		s+="------------------------------\n";
		s+=String.format("Sub total: %.2f\n",subTotal);
		s+="------------------------------\n";
		s+=String.format("Discount: %.2f\n",totalBenefit);
		s+="------------------------------\n";
		s+=String.format("Shipping fee: %.2f\n",shippingFee);
		s+="------------------------------\n";
		s+=String.format("Order total: %.2f\n",orderTotal);
		return s;
	}

}
