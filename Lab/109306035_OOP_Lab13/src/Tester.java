import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FRAME_WIDTH=400;
		final int FRAME_HEIGHT=200;
		Company NCCU=new Company("NCCU");
		Vehicle v=new Vehicle(1,500000,10,50000);
		NCCU.addFixedAsset(v);
		JFrame f=new JFrame("Depreciation Expense Calculator");
		JButton b=new JButton("Do Calculate");
		class ButtonListener implements ActionListener {
			private int currentYear=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				currentYear++;
				System.out.printf("Year: %d\n",currentYear);
				System.out.printf("Total depreciation expense: %.2f\n",v.getDepreciationExp());
				System.out.printf("Book value of fixed assets :%.2f\n\n\n",v.getBookValue());
			}
		}
		ActionListener button=new ButtonListener();
		b.addActionListener(button);
		f.add(b);
		f.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
