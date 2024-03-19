import java.util.ArrayList;
public class Customer {
	private String name;
	private double money;
	private ArrayList<Food> foods;
	private Payment payment;
	private double calLeft;
	private double subtotal;
	public Customer (String name, double money, double calLeft, Payment payment) {
		this.name=name;
		this.money=money;
		this.calLeft=calLeft;
		this.payment=payment;
		subtotal=0;
		foods=new ArrayList<Food>();
	}
	public void order(Food food) {
		subtotal+=payment.totalPrice(foods);
		if(money>=subtotal-payment.promote(foods)) {
			if(calLeft>=food.calories()) {
				foods.add(food);
				calLeft-=food.calories();
			}
			else {
				System.out.printf("Too fat for %s\n",name);
			}
			
		}
		else {
			System.out.printf("%s don't have enough money!\n",name);
		}
	}
	public String orderList() {
		String s="";
		double d=0;
		for(Food f:foods) {
			d+=f.getPrice();
			s+=String.format("%-10s%10.2f\n",f.getName(),f.getPrice());
		}
		s+=String.format("%-10s%10.2f\n","Total",d);
		return s;
	}
	public double pay() {
		if(money>=payment.totalPrice(foods)-payment.promote(foods)) {
			money=money-payment.totalPrice(foods)+payment.promote(foods);
			return payment.totalPrice(foods)-payment.promote(foods);
		}
		else {
			System.out.printf("%s doesn't have enough money!\n", name);
			return 0;
		}
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double m) {
		money+=m;
	}

}
