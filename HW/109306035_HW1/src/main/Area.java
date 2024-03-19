package main;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pi,r,area;
		pi =3.14f;
		System.out.print("Please input the radius:");
		Scanner rInput = new Scanner(System.in);
		r = (float) rInput.nextDouble();
		area = r*r*pi;
		System.out.printf("Area :%.2f\n",area);
		
		rInput.close();

	}

}