
public class Employee {
	private int ID;
	private double baseSalary;
	private double totalSalary;
	private int sales;
	private String name;
	private String department;
	private BankAccount account;
	public Employee(int ID, String name, BankAccount account, String department, int baseSalary, int sales) {
		this.ID=ID;
		this.baseSalary=baseSalary;
		this.sales=sales;
		this.name=name;
		this.department=department;
		this.account=account;
		totalSalary = 0;
	}
	public String getDepartment() {
		return department;
	}
	public int getSales() {
		return sales;
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setSales(int sales) {
		this.sales=sales;
	}
	public void monthEnd() {
		double taxRate=0.03;
		int salesBonus=500;
		totalSalary=(baseSalary+(sales*salesBonus))*(1-taxRate);
		account.deposit(totalSalary);
	}
	public String getInfo() {
		String info="";
		info=info+String.format("ID:"+ID);
		info=info+String.format("\nName:"+name);
		info=info+String.format("\nDepartment:%s\n",getDepartment());
		info=info+String.format("Total sales:%d\n",getSales());
		info=info+String.format("Total salary:%d\n",Math.round(getTotalSalary()));
		return info;
	}
}