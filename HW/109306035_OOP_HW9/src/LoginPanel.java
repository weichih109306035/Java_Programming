import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginPanel extends JPanel{
	private final int FIELD_WIDTH=10;
	private JPanel loginPanel;
	private JPanel userIDPanel;
	private JPanel passwordPanel;
	private JLabel imgLabel;
	private JLabel userIDLabel;
	private JLabel passwordLabel;
	private JTextField userIDField;
	private JPasswordField passwordField;
	private JButton loginButton;
	public LoginPanel() {
		createComp();
	}
	public void createComp() {
		loginPanel=new JPanel();
		userIDPanel=new JPanel();
		passwordPanel=new JPanel();
		ImageIcon shop=new ImageIcon("store.png");
		imgLabel=new JLabel(shop);
		userIDLabel=new JLabel("User ID: ");
		passwordLabel=new JLabel("Password: ");
		userIDField=new JTextField(FIELD_WIDTH);
		passwordField=new JPasswordField(FIELD_WIDTH);
		loginButton=new JButton("Log in");
		userIDPanel.add(userIDLabel);
		userIDPanel.add(userIDField);
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordField);
		loginPanel.setLayout(new BorderLayout());
		JPanel p=new JPanel();
		p.add(userIDPanel);
		p.add(passwordPanel);
		loginPanel.add(imgLabel,BorderLayout.NORTH);
		loginPanel.add(p,BorderLayout.CENTER);
		loginPanel.add(loginButton,BorderLayout.SOUTH);
		add(loginPanel);
	}
	public JButton getLoginButton() {
		return loginButton;
	}
	public void addButtonListener(JPanel panel1, CartPanel cartPanel, UserManagement userManagement, JMenuBar mb) {
		class ClickListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try{
					userIDField.getText();
					passwordField.getPassword();
					for(int i=0;i<userManagement.getUsers().size();i++) {
						if(userManagement.getUsers().get(i)!=null) {
							if(userManagement.getUsers().get(i).getIdentity().equals("User")) {
								cartPanel.uploadItemComp();
								CardLayout cl=(CardLayout)panel1.getLayout();
								cl.show(panel1, "2");
								mb.setVisible(true);
								break;
							}
							else if(userManagement.getUsers().get(i).getIdentity().equals("Admin")){
								((CardLayout)panel1.getLayout()).show(panel1,"3");
								mb.setVisible(true);
								break;
							}
						}
						else {
							JOptionPane.showMessageDialog(loginPanel,"The username or password is wrong","Error",JOptionPane.ERROR_MESSAGE);
						}
					}
					/*for(User u:userManagement.getUsers()) {
						if(u.getIdentity().equals("User")) {
							cartPanel.getLayout();
							show();
							break;
						}
						else if(u.getIdentity().equals("Admin")){
							panel1.getLayout();
							show();
							break;
						}
						JOptionPane.showMessageDialog(loginPanel,"The username or password is wrong","Error",JOptionPane.ERROR_MESSAGE);
					}*/
					/*if(userManagement.findUser(Integer.parseInt(userIDField.getText()))!=null) {
						if(userManagement.findUser(Integer.parseInt(userIDField.getText())).getIdentity().equals("Admin")){
							CardLayout c1=new CardLayout();
							c1.show(cartPanel, null);
							return;
						}
						else if(userManagement.findUser(Integer.parseInt(userIDField.getText())).getIdentity().equals("User")) {
							CardLayout c2=new CardLayout();
							c2.show(panel1, null);
							return;
						}
					}
					else {
						JOptionPane.showMessageDialog(loginPanel,"The username or password is wrong","Error",JOptionPane.ERROR_MESSAGE);
					}*/
					
				}
				catch(NumberFormatException Exception) {
					JOptionPane.showMessageDialog(loginPanel,"Please enter the relevant information correctly","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		ActionListener lb=new ClickListener();
		loginButton.addActionListener(lb);
	}

}
