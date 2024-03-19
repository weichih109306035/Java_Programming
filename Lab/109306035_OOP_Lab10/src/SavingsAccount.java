
public class SavingsAccount extends BankAccount {
	private double interestRate;
	public SavingsAccount(int amount, int ID, double interestRate) {
		super.setBalance(amount);
		super.setID(ID);
		this.interestRate=interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	public void monthEnd() {
		interestRate=interestRate*0.01;
		deposit(getBalance()*interestRate);
	}
}
