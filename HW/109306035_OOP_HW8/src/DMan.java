import java.util.ArrayList;
public class DMan {
	private String name;
	private int dCount;
	private int carryLimit;
	private ArrayList<Customer> custs;
	public DMan(String name, int carryLimit) {
		this.name=name;
		this.carryLimit=carryLimit;
		dCount=0;
		custs=new ArrayList<Customer>();
	}
	public double salary() {
		double s=10*custs.size();
		return s;
	}
	public void addCusts(Customer cust) {
		if(custs.size()+1<=carryLimit) {
			custs.add(cust);
		}
		else {
			System.out.println("Too many to carry!");
		}
	}


}
