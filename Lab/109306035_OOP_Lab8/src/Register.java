import java.util.ArrayList;
public class Register {
	private int totalRevenue;
	private ArrayList<Integer> bills;
	public Register() {
		totalRevenue = 0;
		bills = new ArrayList<Integer>();
	}
	public int gettotalRevenue() {
		return totalRevenue;
	}
	public ArrayList<Integer> getBill(int id) {
		bills.get(id);
		return bills;
	}
	public void calctotalCost(int id, int num, int price) {
        try {
			bills.set(id,bills.get(id)+num*price);
		}
		catch(Exception IndexOutOfBoundsException){
			bills.add(num*price);
		}
        calctotalRevenue(num*price);
	}
	public void calctotalRevenue(int cost) {
		totalRevenue = totalRevenue + cost;
	}
	public String getInfo() {
		String Info2 = "";
		Info2 = Info2 +String.format("My register info:\n");
		Info2 = Info2 +String.format("Bill\n");
		for(Integer bill:bills) {
			Info2=Info2+String.format("%d\n",bill);
		}
		Info2 = Info2 +String.format("\nTotal Revenue:%d",gettotalRevenue());
		return Info2;
	}
}