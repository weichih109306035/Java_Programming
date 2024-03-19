import java.util.ArrayList;
public class Company {
	private String name;
	private ArrayList<FixedAsset> fixedAssets;
	private double bookValue;
	private double totalDepreciationExp;
	public Company(String name) {
		this.name=name;
		fixedAssets=new ArrayList<FixedAsset>();
		bookValue=0;
		totalDepreciationExp=0;
	}
	public void addFixedAsset(FixedAsset asset) {
		fixedAssets.add(asset);
		bookValue+=asset.getBookValue();
	}
	public double getTotalBookValue() {
		updateBookValue();
		return bookValue;
	}
	public double getDepreciationExp() {
		updateDepreciationExp();
		return totalDepreciationExp;
	}
	public void updateBookValue() {
		bookValue-=totalDepreciationExp;
	}
	public void updateDepreciationExp() {
		for(FixedAsset a:fixedAssets) {
			totalDepreciationExp+=a.getDepreciationExp();
		}
	}

}
