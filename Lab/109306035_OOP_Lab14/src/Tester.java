import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Tester {
	private static final int FRAME_WIDTH=400;
	private static final int FRAME_HEIGHT=300;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double>discounts =new ArrayList<Double>();
		discounts.add(100.0);
		discounts.add(200.0);
		discounts.add(300.0);
		ArrayList<Double>discountsRate =new ArrayList<Double>();
		discountsRate.add(0.1);
		discountsRate.add(0.15);
		discountsRate.add(0.2);
		Furniture sofa=new Furniture(1, 10000, 30, 200, discounts);
		Luxury wallet=new Luxury(2, 160000, 1000, discountsRate);
		Membership Tom=new Membership(1);
		int t=Tom.buy(sofa, 2);
		Tom.buy(t, wallet, 2);
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JTextArea ta=new JTextArea();
		JButton b=new JButton("Check out");
		p.setLayout(new BorderLayout());
		f.add(b);
		p.add(b, BorderLayout.SOUTH);
		p.add(ta);
		f.add(p);
		ta.setText("Depreciation year");
		class ButtonListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.setText(Tom.checkOut(t));
			}
		}
		ActionListener button=new ButtonListener();
		b.addActionListener(button);
		f.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
