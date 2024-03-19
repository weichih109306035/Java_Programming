
public class Vehicle implements FixedAsset{
	private int id;
	private double cost;
	private double durableYear;
	private double residualValue;
	private double depreciationRate;
	private double depreciationExp;
	private double bookValue;
	private int depreciationYear;
	public Vehicle(int id, double cost, double durableYear, double residualValue) {
		this.id=id;
		this.cost=cost;
		this.durableYear=durableYear;
		this.residualValue=residualValue;
		bookValue=cost;
		depreciationYear=0;
		calcDepreciationRate();
	}
	public void calcDepreciationRate() {
		depreciationRate=(1/durableYear)*2;
	}
	public void calcDepreciationExp() {
		if(durableYear>depreciationYear) {
			depreciationExp=bookValue*depreciationRate;
		}
		else if(durableYear==depreciationYear) {
			depreciationExp=bookValue-residualValue;
		}
		else {
			depreciationExp=0;
		}
	}
	public void calcBookValue() {
		bookValue-=depreciationExp;
	}
	public double getDepreciationExp() {
		calcDepreciationRate();
		calcDepreciationExp();
		return depreciationExp;
	}
	public double getBookValue() {
		calcBookValue();
		return bookValue;
	}

}
