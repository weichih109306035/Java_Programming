import java.util.ArrayList;
public class Membership {
	private int ID;
	private ArrayList<Order> orderList;
	private double totalSpending;
	private boolean isVIP;
	public Membership(int ID) {
		this.ID=ID;
		orderList=new ArrayList<Order>();
		isVIP=false;
	}
	public boolean getIsVIP() {
		return isVIP;
	}
	public void buy(int orderID, Item item, int num) {
		for(Order o:orderList) {
			if(o.getID()==orderID) {
				o.addItem(item, num);
			}
		}
	}
	public int buy(Item item, int num) {
		Order o=new Order(orderList.size());
		orderList.add(o);
		o.addItem(item, num);
		return o.getID();
	}
	public String checkOut(int orderID) {
		String s="";
		for(Order o:orderList) {
			if(o.getID()==orderID) {
				totalSpending=o.getOrderTotal();
				s=o.placeOrder(isVIP);
			}
			else {
				s="Error 1";
			}
		}
		return s;
	}
	public void yearEnd() {
		if(totalSpending>5000) {
			isVIP=true;
		}
		else {
			isVIP=false;
		}
		totalSpending=0;
		orderList=new ArrayList<Order>();
	}
}
