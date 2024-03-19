
public class BankAccount {
	private int ID;
	private double balance;
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
		if(balance>amount) {
			balance=balance-amount;
		}
		else {
			System.out.println("Your account does not have enough money.");
		}
	}
	public double getBalance() {
		return balance;
	}
	public void monthEnd() {
		
	}
}
