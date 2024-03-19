package main;

public class Cart {
	private Fruit[]basket;
	private int[] subAmount;
	private int totalExpense;
	int i;
	public Cart() {
		basket = new Fruit[3];
		subAmount = new int[3];
		totalExpense = 0;
		i=0;
	}
	public int getTotalExpense() {
		return totalExpense;
	}
	public void addItem(Fruit fruit,int amount) {
		if(i<basket.length) {
			basket[i]=fruit;
			subAmount[i] = amount;
			i++;
			fruit.updateTotalsales(amount);
		}
	}
	public void searchItem(Fruit fruit) {
		for(Fruit product:basket) {
			if(product == fruit) {
				System.out.println("Your basket has this product.");
				break;
			}
			else {
				System.out.println("Your basket does not have this product.");
				break;
			}
		}
	}
	public void totalExpense() {
		for(i=0;i<basket.length;i++) {
			if(basket[i]!=null) {
				totalExpense = totalExpense +basket[i].getPrice()*subAmount[i];
			}
		}
	}
	public String getInfo() {
		String Info1="";
		totalExpense();
		Info1=Info1+String.format("The current expense is:NT$%d\n", getTotalExpense());
		Info1=Info1+String.format("%-7s%-12s%-4s\n","Name","Price(NT$)","Unit");
		for(i=0;i<basket.length;i++) {
			if(basket[i]!=null) {
				Info1=Info1+String.format("%-6s:%5d%6s%3d \n",basket[i].getName(),basket[i].getPrice(),"*",subAmount[i]);
			}
		}
		return Info1;
	}

}
