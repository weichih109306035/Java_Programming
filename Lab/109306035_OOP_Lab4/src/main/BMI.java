package main;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double weight,height,bmi;
		Scanner numScanner = new Scanner(System.in);
		
		System.out.print("Please input the weight(kg):");
		weight = numScanner.nextInt();
		System.out.print("Please input the height(cm):");
		height = numScanner.nextInt();
		
		height = height/100;
		bmi = weight/Math.pow(height,2);
		System.out.printf("Your BMI is:%.2f\n",bmi);
		if(bmi<18.5) {
			System.out.print("The result is:underweight");
		}
		else if(bmi>=24) {
			System.out.print("The result is:overweight");
		}
		else {
			System.out.print("The result is:normal");
		}
		
		numScanner.close();
	}
}
