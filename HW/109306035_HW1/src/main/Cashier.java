package main;
import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("***cashier***\n");
		int qtyApple, qtyBanana, qtyOrange, qtyKiwi, total, payment, balance;
		Scanner itemScanner = new Scanner(System.in);
		System.out.print("Please enter the quantity of apple ($NT 10 per unit) you purchased:");
		qtyApple = itemScanner.nextInt();
		System.out.print("Please enter the quantity of banana ($NT 15 per unit) you purchased:");
		qtyBanana = itemScanner.nextInt();
		System.out.print("Please enter the quantity of orange ($NT 13 per unit) you purchased:");
		qtyOrange = itemScanner.nextInt();
		System.out.print("Please enter the quantity of kiwifruit ($NT 17 per unit) you purchased:");
		qtyKiwi = itemScanner.nextInt();
		
		total = qtyApple*10 +qtyBanana*15+qtyOrange*13+qtyKiwi*17;
		System.out.printf("The total cost :%d\n",total);
		System.out.print("Please enter payment amount(must above total cost):");
		payment = itemScanner.nextInt();
		balance = payment-total;
		System.out.printf("Amount to be change:%d\n",balance);
		System.out.printf("The amount of each change is as follows:\n");
		
		System.out.printf("$NT 100:%d\n",balance/100);
		System.out.printf("$NT 50:%d\n",(balance%100)/50);
		System.out.printf("$NT 10:%d\n",((balance%100)%50)/10);
		System.out.printf("$NT 5:%d\n",(((balance%100)%50)%10)/5);
		System.out.printf("$NT 1:%d",((((balance%100)%50)%10)%5)/1);
		
		itemScanner.close();
		
	}

}