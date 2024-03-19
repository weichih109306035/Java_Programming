
public class VIP extends Customer{
	private int level;
	public VIP(String name, double money, double calLeft, Payment payment,int level) {
		super(name, money, calLeft, payment);
		this.level=level;
		// TODO Auto-generated constructor stub
	}
	public double pay() {
		double vp=super.pay()-level*10;
		super.setMoney(level*10);
		return vp;
	}

}
