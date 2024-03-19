
public class BankAccount {
	private int accountID;
	private double balance;
	private double interestRate;
	public BankAccount(int accountID) {
		this.accountID=accountID;
		balance=0;
		interestRate=0.001;
	}
	public int getAccountID() {
		return accountID;
	}
	public double getBalance() {
		return balance;
	}
	public String deposit(double amount) {
		balance+=amount;
		String dep=Double.toString(balance);
		return dep;
	}
	public String withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			String wit1=Double.toString(balance);
			return wit1;
		}
		else {
			String wit2="Transaction failed.";
			return wit2;
		}
	}
	public void updateInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	public void interestPay() {
		
	}
	public void yearEnd() {
		
	}
	public String getInfo() {
		String info="";
		info+=String.format("Account ID: %d\n",getAccountID());
		info+=String.format("Balance: %.2f\n",getBalance());
		return info;
	}
}
