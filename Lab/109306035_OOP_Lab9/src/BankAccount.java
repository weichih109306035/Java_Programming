
public class BankAccount {
	private int ID;
	private double balance;
	public BankAccount(int ID, double balance) {
		this.ID=ID;
		this.balance=balance;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}
	public void withdraw(double amount) {
		if(balance<amount) {
			System.out.println("Your account does not have enough money.");
		}
		else {
			balance=balance-amount;
		}
	}
	public double getBalance() {
		return balance;
	}
}