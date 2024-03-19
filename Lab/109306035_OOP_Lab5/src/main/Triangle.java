package main;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sideA, sideB, angleC;
		Triangle triangle = new Triangle();
		Scanner sideScanner = new Scanner(System.in);
		Scanner angleScanner = new Scanner(System.in);
		System.out.print("Please enter the length of the two sides of the triangle:");
		sideA = sideScanner.nextInt();
		sideB = sideScanner.nextInt();
		System.out.print("Please enter the angle of the triangle:");
		angleC = angleScanner.nextInt();
		double sideC =triangle.side(sideA,sideB,angleC);
		double perimeter =triangle.perimeter(sideA,sideB,sideC);
		double area =triangle.area((int)perimeter,sideA,sideB,sideC);
		double angleA =triangle.angleA(sideA,sideB,sideC);
		double angleB =triangle.angleB(sideA,sideB,sideC);
		System.out.println("The other side length is "+(int)sideC);
		System.out.println("The perimeter of the triangle is "+(int)perimeter);
		System.out.printf("The area of the triangle is %.2f\n",area);
		System.out.printf("The opposite angle of sideA(length(s):%.2f) in the triangle is %d degrees\n",(float)sideA,Math.round(angleA));
		System.out.printf("The opposite angle of sideB(length(s):%.2f) in the triangle is %d degrees",(float)sideB,Math.round(angleB));
		sideScanner.close();
		angleScanner.close();
	}
	public double side(double a,double b,double c) {
		double sideC = Math.pow(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c)), 0.5);
		return sideC;
	}
	public double perimeter(double a, double b, double c) {
		double perimeter = a+b+c;
		return perimeter;
	}
	public double area(int perimeter,double a,double b,double c) {
		int s = (int) (perimeter*0.5);
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	public double angleA(double a, double b, double c) {
		double angleA = Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
		return angleA;
	}
	public double angleB(double a, double b, double c) {
		double angleB = Math.toDegrees(Math.acos((a*a+c*c-b*b)/(2*a*c)));
		return angleB;
	}
}