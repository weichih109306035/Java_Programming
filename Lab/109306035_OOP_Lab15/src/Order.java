import java.util.ArrayList;
public class Order {
	private int ID;
	private double totalAmount;
	private ArrayList<Item> items;
	private ArrayList<Integer> quantities;
	private ArrayList<Double> discountsList;//¥´¿ù?
	public Order() {
		items=new ArrayList<Item>();
		quantities=new ArrayList<Integer>();
		//Order order=new Order();
	}
	public void addItem(Item item, int quantity) {
		if(items.contains(item)) {
			quantities.set(items.indexOf(item), quantity);
		}
		else {
			items.add(item);
			quantities.add(quantity);
		}
	}
	public String getInfo() {
		String info="";
		info+=String.format("%-8s%15s%15s\n","Item","Price","Quantity");
		//for(Item i:items) {
			//info+=String.format("%-8s%12d%18d",i.getName(),i.getPrice(),ID);
		//}
		for(int i=0;i<items.size();i++) {
			info+=String.format("%-8s%12s%18s\n",items.get(i).getName(),items.get(i).getPrice(),quantities.get(i));
		}
		info+="-------------------------";
		info+=String.format("\nThe total amount:%.2f",totalAmount);
		return info;
	}
	public String checkout() {
		this.totalAmount=0;
		for(int i=0;i<items.size();i++) {
			this.totalAmount+=items.get(i).getPrice()*quantities.get(i);
		}
		//String s=String.format("The total amount:%.2f",totalAmount);
		return getInfo();
	}

}
