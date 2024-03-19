import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Viewer {
	private static final int FRAME_WIDTH=650;
	private static final int FRAME_HEIGHT=400;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManagement um=new UserManagement();
		um.addNewUser(110306500,"Aa123456","Admin");
		um.addNewUser(110306501,"Aa123456","User");
		JFrame f=new JFrame("E-Commerce");
		f.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		ItemManager im=new ItemManager();
		JPanel p=new JPanel();
		CardLayout cl=new CardLayout();
		p.setLayout(cl);
		LoginPanel lp=new LoginPanel();
		CartPanel cp=new CartPanel(im);
		ManagementPanel mp=new ManagementPanel(im);
		JMenuBar jmb=new JMenuBar();
		JMenu jm=new JMenu("Menu");
		JMenuItem jmi1=new JMenuItem("Log Out");
		//jmi1.setActionCommand("Log Out");
		JMenuItem jmi2=new JMenuItem("Exit");
		jm.add(jmi1);
		jm.add(jmi2);
		jmb.add(jm);
		f.add(jmb);
		f.setJMenuBar(jmb);
		p.add(lp,"1");
		p.add(cp,"2");
		p.add(mp,"3");//打到這裡
		//jmi2.setActionCommand("Exit");
		/*CardLayout cl=new CardLayout();
		LoginPanel lp=new LoginPanel();
		CartPanel cp=new CartPanel();
		ManagementPanel mp=new ManagementPanel(null);
		cl.addLayoutComponent(lp,"1");
		cl.addLayoutComponent(cp,"2");
		cl.addLayoutComponent(mp,"3");
		
		JFrame j=new JFrame("E-Commerce");
		j.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		ItemManager im=new ItemManager();
		JPanel p=new JPanel();
		JMenuBar jmb=new JMenuBar();
		JMenu jm=new JMenu("Menu");
		JMenuItem jmi1=new JMenuItem("Log Out");
		jmi1.setActionCommand("Log Out");
		JMenuItem jmi2=new JMenuItem("Exit");
		jmi2.setActionCommand("Exit");*/
		lp.addButtonListener(p,cp,um,jmb);
		jmb.setVisible(false);
		f.add(p);
		f.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		class LogOutListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//cl.show(lp, "1");
				((CardLayout)p.getLayout()).show(p, "1");
				jmb.setVisible(false);
			}
		}
		ActionListener lb1=new LogOutListener();
		jmi1.addActionListener(lb1);
		class ExitListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		}
		ActionListener lb2=new ExitListener();
		jmi2.addActionListener(lb2);

	}

}
