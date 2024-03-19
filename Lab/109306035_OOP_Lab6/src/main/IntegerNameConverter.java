package main;

public class IntegerNameConverter {
	private int num;
	public IntegerNameConverter(int num) {
		this.num = num;
	}
	public String intName(){
		String name= "";
		int part = num;
		if(part>=100) {
			name = digitName(part)+" hundred ";
			if(part%100>=20) {
				name= digitName(part)+" hundred "+tensName(part%100)+" "+digitName(part%100%20%10*100);
			}
			else if(20>part%100&&part%100>=10) {
				name = digitName(part)+" hundred "+teenName(part%100);
			}
			else if(10>part%100&&part%100>0) {
				name = digitName(part)+" hundred "+digitName(part%100*100);
			}
		}
		if(100>part&&part>=20) {
			name = tensName(part)+" "+digitName(part%10*100);
		}
		if(20>part&&part>=10) {
			name = teenName(part);
		}
		if(10>part&&part>0) {
			name = digitName(part*100);
		}
		return name;
	}
	public String digitName(int num){
		this.num =num;
		String name = " ";
		if(num/100 == 9) {
			name = "nine";
		}
		if(num/100 == 8) {
			name = "eight";
		}
		if(num/100 == 7) {
			name = "seven";
		}
		if(num/100 == 6) {
			name = "six";
		}
		if(num/100 == 5) {
			name = "five";
		}
		if(num/100 == 4) {
			name = "four";
		}
		if(num/100 == 3) {
			name = "three";
		}
		if(num/100 == 2) {
			name = "two";
		}
		if(num/100 == 1) {
			name = "one";
		}
		return name;
	}
	public String tensName(int num){
		this.num =num;
		String name = " ";
		if (num%100/10 == 9) {
			name = "ninety";
		}
		if (num%100/10 == 8) {
			name = "eighty";
		}
		if (num%100/10 == 7) {
			name = "seventy";
		}
		if (num%100/10 == 6) {
			name = "sixty";
		}
		if (num%100/10 == 5) {
			name = "fifty";
		}
		if (num%100/10 == 4) {
			name = "forty";
		}
		if (num%100/10 == 3) {
			name = "thirty";
		}
		if (num%100/10 == 2) {
			name = "twenty";
		}
		return name;
	}
	public String teenName(int num){
		this.num =num;
		String name = " ";
		if (num%100 == 19) {
			name = "nineteen";
		}
		if (num%100 == 18) {
			name = "eighteen";
		}
		if (num%100 == 17) {
			name = "seventeen";
		}
		if (num%100 == 16) {
			name = "sixteen";
		}
		if (num%100 == 15) {
			name = "fifteen";
		}
		if (num%100 == 14) {
			name = "forteen";
		}
		if (num%100 == 13) {
			name = "thirteen";
		}
		if (num%100 == 12) {
			name = "twelve";
		}
		if (num%100 == 11) {
			name = "eleven";
		}
		if(num%100 == 10) {
			name = "ten";
		}
		return name;
	}
}
