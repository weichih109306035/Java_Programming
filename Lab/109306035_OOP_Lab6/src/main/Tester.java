package main;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Please enter a positive integer < 1000:");
		int input = inputScanner.nextInt();
		IntegerNameConverter converter = new IntegerNameConverter(input);
		System.out.println(converter.intName());
		inputScanner.close();
	}

}
