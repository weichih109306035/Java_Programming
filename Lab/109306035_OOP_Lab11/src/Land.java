
public class Land {
	private int id;
	private double valuePerAcre;
	private double totalArea;
	private double netValue;
	public Land(int id, double unitLandValue) {
		this.id=id;
		this.valuePerAcre=unitLandValue;
	}
	public void addArea(Shape shape) {
		shape.calcArea();
		totalArea+=shape.getArea();
	}
	public void calcTotalValue() {
		netValue=totalArea*valuePerAcre;
	}
	public String getInfo() {
		String info="";
		info=info+String.format("The area ID: "+id);
		info=info+String.format("\nValue per acre: $%.2f",valuePerAcre);
		info=info+String.format("\nTotal area: %.2f",totalArea);
		info=info+String.format("\nTotal value: $%.2f\n",netValue);
		return info;
	}

}
