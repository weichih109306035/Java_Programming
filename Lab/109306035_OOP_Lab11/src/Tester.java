
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Land Florida = new Land(1,30000);
		Land Indiana = new Land(2,17000);
		Florida.addArea(new Square(10));
		Florida.addArea(new Circle(5));
		Florida.addArea(new Triangle(3,4,5));
		Indiana.addArea(new Square(5));
		Indiana.addArea(new Circle(7));
		Indiana.addArea(new Triangle(6,6,6));
		Florida.calcTotalValue();
		Indiana.calcTotalValue();
		System.out.printf("<<Florida>>\n%s\n",Florida.getInfo());
		System.out.printf("<<Indiana>>\n%s",Indiana.getInfo());
	}

}
