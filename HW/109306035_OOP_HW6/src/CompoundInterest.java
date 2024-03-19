import java.util.ArrayList;
public class CompoundInterest extends DepositInsurance {
	private ArrayList<Double> interestRate;
	public CompoundInterest(BankAccount account, double annuity, int experiment) {
		super(account,annuity,experiment);
		interestRate=new ArrayList<Double>();
	}
	public void setInterestRate(double rate) {
		interestRate.add(rate);
	}
	public void interestPay() {
		if(super.getCurrentYear()==1) {
		    super.updateTotalValue((interestRate.get(0)+1)*super.getAnnuity());
		}
		else if(super.getCurrentYear()==2) {
			super.updateTotalValue((interestRate.get(1)+1)*super.getAnnuity());
		}
		else if(super.getCurrentYear()==3) {
			super.updateTotalValue((interestRate.get(2)+1)*super.getAnnuity());
		}		
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
