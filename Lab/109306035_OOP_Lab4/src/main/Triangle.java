package main;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int layer=1;
		Scanner layerScanner = new Scanner(System.in);
		System.out.print("Please input the layer:");
		layer=layerScanner.nextInt();
		
		for(int i=1;i<=layer;i++) {
			for(int j=layer;j>i;j--) {
				System.out.print(" ");
				}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
		System.out.println();
		}
		layerScanner.close();

	}

}
