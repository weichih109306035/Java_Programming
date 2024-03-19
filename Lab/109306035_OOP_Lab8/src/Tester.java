import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit("Apple",10);
		Fruit banana = new Fruit("Banana",12);
		Fruit orange = new Fruit("Orange",15);
		Fruit[] fruits= {apple,banana,orange};
		Register register = new Register();
		try {
		    File myObj = new File("sales.txt");
		    Scanner reader=new Scanner(myObj);
		    FileWriter myWriter = new FileWriter("register_info.txt");
		    try {
		        reader.nextLine();
		        int id = 0;
		        while(reader.hasNextInt()) {
			        for(Fruit fruit:fruits) {
				        register.calctotalCost(id, reader.nextInt(), fruit.getPrice());
			        }
			        id++;
		        }
		    }
		    finally{
		    	myWriter.write(register.getInfo());
		        reader.close();
		        myWriter.close();
	        }
		}
		catch(Exception e) {
			
		}
	}
}