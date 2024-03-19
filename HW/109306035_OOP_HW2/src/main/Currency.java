package main;
import java.util.Scanner;
public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currency;
		double value;
		Scanner cyScanner = new Scanner(System.in);
		System.out.printf("Convert from TWD, USD, JPY:");
		currency = cyScanner.nextLine();
		System.out.printf("Value:");
		value = cyScanner.nextDouble();
		
		if(currency.equals("TWD")) {
			System.out.printf("The result:%.2f TWD = %.2f USD = %.2f JPY",value,value*0.034,value*3.568);
	        //System.out.printf("%.2f USD = ",value*0.034);
			//System.out.printf("%.2f JPY",value*3.568);
		}
		else if(currency.equals("USD")) {
			System.out.printf("The result:%.2f USD = ",value);
		    System.out.printf("%.2f TWD = ",value/0.034);
			System.out.printf("%.2f JPY",(value/0.034)*3.568);
		}
		else if(currency.equals("JPY")) {
			System.out.printf("The result:%.2f JPY = ",value);
			System.out.printf("%.2f TWD = ",value/3.568);
			System.out.printf("%.2f USD",(value/3.568)*0.034);
		}
		cyScanner.close();
	}
}
