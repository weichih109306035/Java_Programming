package main;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=2,num2=4;
		double num3=1.5,num4=3.2;
		
		System.out.printf("num1=:%d  ",num1);
		System.out.printf("num2=:%d  ",num2);
		System.out.printf("num1=:%f  ",num3);
		System.out.printf("num2=:%f\n",num4);
		
		System.out.printf("num1+num2=:%d  ",num1+num2);
		System.out.printf("num2/num1=:%d  ",num2/num1);
		System.out.printf("num4-num3=:%f\n",num4-num3);
		
		//int myinteger =num3;
		//System.out.print(myinteger);
		//System.out.printf("\n");
		//���~,�]��double��int��narrow casting,�ݤ�ʽվ�
		
		double mydouble=num1;
		System.out.print(mydouble);
		System.out.printf("\n");
		//�i����,�]��int��double��widen casting,�i��������
		
		int days_of_month =30;
		byte mybyte = (byte) days_of_month;
		System.out.print(mybyte);
		
	}

}
