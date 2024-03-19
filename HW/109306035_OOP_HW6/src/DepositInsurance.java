
public class DepositInsurance extends BankAccount{
	private BankAccount account;
	private double totalValue;
	private double annuity;
	private int experiment;
	private int currentYear;
	public DepositInsurance(BankAccount account, double annuity, int experiment) {
		super(account.getAccountID());
		this.account=account;
		this.annuity=annuity;
		this.experiment=experiment;
		currentYear=0;
		totalValue=0;
	}
	public int getExperiment() {
		return experiment;
	}
	public int getCurrentYear() {
		return currentYear;
	}
	public BankAccount getAccount() {
		return account;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public double getAnnuity() {
		return annuity;
	}
	public int updateCurrentYear() {
		this.currentYear=currentYear;
		currentYear++;
		return currentYear;
	}
	public void updateAnnuity(double amount) {
		annuity+=amount;
	}
	public void updateTotalValue(double amount) {
		totalValue+=amount;
	}
	public void redemption() {
		account.deposit(totalValue);
	}
	public void redemption(double redemptionRate) {
		account.deposit(getTotalValue()-redemptionRate);
	}
	public void yearEnd() {
		
	}
	public String getInfo() {
		String info1="";
		info1+=String.format("Designated Bank Accounts:%d",getAccount().getAccountID());
		info1+=String.format("\nCurrent total value:%.2f",getTotalValue());
		info1+=String.format("\nElapsed Years:%d",getCurrentYear());
		return info1;
	}
}
