
public class SimpleInterest extends DepositInsurance {
	private double interestRate;
	public SimpleInterest(BankAccount account, double annuity, double interestRate, int experiment) {
		super(account,annuity,experiment);
		this.interestRate=interestRate;
	}
	public void interestPay() {
		addPremium(super.getAnnuity()*(1+interestRate));
	}
	public void addPremium(double amount) {
		super.updateTotalValue(amount);
	}
	public void yearEnd() {
        if(super.getCurrentYear()>super.getExperiment()) {
			super.redemption();
		}
		else {
			if(super.getAccount().getBalance()>super.getAnnuity()) {
				super.getAccount().withdraw(super.getAnnuity());
				interestPay();
			}
			else {
				System.out.println("¡§Deduction is not successful.¡¨");
			}
		}
	}
}
