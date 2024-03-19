package main;
import java.util.Scanner;
public class Factorial_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner numScanner = new Scanner(System.in);
		System.out.printf("Please input a factorial number:");
		num = numScanner.nextInt();
		
		int result=1;
	    for(int i= 1;i <= num;i++){
	        result *= i;
	    }
	    System.out.printf("The result is: %d",result);
		numScanner.close();
		}
}


