package main;
import java.util.Scanner;
public class Factorial_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,result = 1;
		Scanner numScanner = new Scanner(System.in);
		System.out.printf("Please input a factorial number:");
		num = numScanner.nextInt();
		
		int i=1;
		while(i<=num) {
			result*= i;
			i++;
		}
		System.out.printf("The result is: %d\n", result);
		numScanner.close();
	}

}
