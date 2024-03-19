package main;
import java.util.Scanner;
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		System.out.printf("Please input two integer numbers:");
		Scanner numScanner = new Scanner(System.in);
		num1 = numScanner.nextInt();
		num2 = numScanner.nextInt();
		
		int max=1;
        for (int i = 2; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                max = i;
            }
        }
        System.out.printf("Result: the highest common factor is %d ",max);
		numScanner.close();
	}

}
