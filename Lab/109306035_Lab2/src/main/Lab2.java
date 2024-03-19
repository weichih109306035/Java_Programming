package main;
import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname = "weichih Lu";
		System.out.printf(fullname);
		System.out.print(" ");
		System.out.println(fullname.length());
		System.out.println(fullname.substring(8));
		
		int num1,num2,mul,max;
		Scanner numScanner = new Scanner(System.in);
		System.out.print("Please input two number(use space to split) :");
		num1 = numScanner.nextInt();
		num2 = numScanner.nextInt();
		
		int sum = num1 + num2;
		System.out.printf("sum:%d\n",sum);
		mul = num1*num2;
		System.out.printf("mul:%d\n",mul);
		float avg = (float)sum/2;
		System.out.printf("avg:%.1f\n",avg);
		max = Math.max(num1, num2);
		System.out.printf("max:%d\n",max);
		if(num1%2 ==1&&num2%2 ==1) {
			System.out.print("Both num1 and num2 are odd.");
		}
		else if(num1%2 ==0&&num2%2 ==0) {
			System.out.print("Both num1 and num2 are even.");
		}
		else if(num1%2 ==1&&num2%2 ==0) {
			System.out.print("num1 is odd, num2 is even.");
		}
		else if(num1%2 ==0&&num2%2 ==1) {
			System.out.print("num1 is even, num2 is odd.");
		}
		
		numScanner.close();

	}

}
