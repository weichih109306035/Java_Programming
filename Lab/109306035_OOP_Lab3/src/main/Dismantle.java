package main;
import java.util.Scanner;
public class Dismantle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,hundred,ten,unit;
		Scanner numScanner = new Scanner(System.in);
		System.out.print("Please enter a three-digit number:");
		num = numScanner.nextInt();
		hundred = num/100;
		ten = (num%100)/10;
		unit = (num%100)%10;
		
		int sum,product,difference;
		sum = hundred+ten+unit;
		product = hundred*ten*unit;
		difference = hundred-ten-unit;
		System.out.printf("The sum is:%d\n",sum);
		System.out.printf("The product is:%d\n",product);
		System.out.printf("The difference is:%d\n",difference);
		
		numScanner.close();

	}

}
