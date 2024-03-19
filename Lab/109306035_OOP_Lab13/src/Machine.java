
public class Machine implements FixedAsset{
	private int id;
	private double cost;
	private double durableYear;
	private double residualValue;
	private double depreciationExp;
	private double bookValue;
	private int depreciationYear;
	public Machine(int id, double cost, double durableYear, double residualValue) {
		this.id=id;
		this.cost=cost;
		this.durableYear=durableYear;
		this.residualValue=residualValue;
		bookValue=cost;
		depreciationYear=0;
	}
	public void calcDepreciationExp(){
		if(durableYear>depreciationYear) {
			depreciationExp=(cost-residualValue)/durableYear;
		}
		else {
			depreciationExp=0;
		}
	}
	public void calcBookValue() {
		bookValue-=depreciationExp;
	}
	public double getDepreciationExp() {
		calcDepreciationExp();
		return depreciationExp;
	}
	public double getBookValue() {
		calcBookValue();
		return bookValue;
	}

}
