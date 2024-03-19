
public class Triangle implements Shape {
	private double sideA;
	private double sideB;
	private double sideC;
	private double area;
	private double perimeter;
	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		calcPerimeter();
		double s = getPerimeter()/2;
		area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}

	@Override
	public void calcPerimeter() {
		// TODO Auto-generated method stub
		perimeter=sideA+sideB+sideC;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return area;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return perimeter;
	}

}
