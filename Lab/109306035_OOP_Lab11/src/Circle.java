
public class Circle implements Shape {
	private double PI;
	private double radius;
	private double area;
	private double perimeter;
	public Circle(double radius) {
		this.radius=radius;
		this.PI=3.14;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area=radius*radius*PI;
	}

	@Override
	public void calcPerimeter() {
		// TODO Auto-generated method stub
		perimeter=radius*2*PI;
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
