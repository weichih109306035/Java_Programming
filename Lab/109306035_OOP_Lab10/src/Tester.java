import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount accountA=new SavingsAccount(8000, 306049001, 1);
		SavingsAccount accountB=new SavingsAccount(1000, 306049011, 2);
		CheckingAccount accountC=new CheckingAccount(9000, 306016033);
		CheckingAccount accountD=new CheckingAccount(3000, 306016041);
		BankAccount[]accounts= {accountA,accountB,accountC,accountD};
		Scanner wordScanner=new Scanner(System.in);
		Scanner accountScanner = new Scanner(System.in);
		Scanner numScanner = new Scanner(System.in);
		while(true) {
			System.out.print("D)Deposit W)Withdraw M)Month end Q)Quit:");
			String word=wordScanner.next();
			if(word.equals("D")) {
				System.out.print("Enter your account number:");
				int account=accountScanner.nextInt();
				System.out.print("Enter transaction amount:");
				int num=numScanner.nextInt();
				for(int i=0;i<accounts.length;i++) {
				if(accounts[i].getID()==account) {
					accounts[i].deposit(num);
					System.out.printf("Balance: %.1f",accounts[i].getBalance());
				}
				else {
					System.out.print("Corresponding account cannot be found");
				}
				break;
				}
				System.out.println();
			}
			else if(word.equals("W")) {
				System.out.print("Enter your account number:");
				int account=accountScanner.nextInt();
				System.out.print("Enter transaction amount:");
				int num=numScanner.nextInt();
				for(int i=0;i<accounts.length;i++) {
				if(accounts[i].getID()==account) {
					accounts[i].withdraw(num);
					System.out.printf("Balance: %.1f",accounts[i].getBalance());
				}
				else {
					System.out.print("Corresponding account cannot be found");
				}
				break;
				}
				System.out.println();
			}
			else if(word.equals("M")) {
				for(int j=0;j<accounts.length;j++) {
					accounts[j].monthEnd();
					System.out.print(j+" "+accounts[j].getBalance()+"\n");
				}
			}
			else if(word.equals("Q")) {
				break;
			}
		}
	}
}
