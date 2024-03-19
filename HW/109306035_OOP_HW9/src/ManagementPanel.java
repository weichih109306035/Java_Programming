import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ManagementPanel extends JPanel{
	private final int FIELD_WIDTH=10;
	private JLabel titleLabel;
	private JLabel IDLabel;
	private JLabel nameLabel;
	private JLabel priceLabel;
	private JTextField IDField;
	private JTextField nameField;
	private JTextField priceField;
	private JButton sentButton;
	private ItemManager itemManager;
	public ManagementPanel(ItemManager itemManager) {
		this.itemManager=itemManager;
		createComp();
	}
	public void createComp() {
		titleLabel=new JLabel("E-Commerce management platform");
		Font f=new Font("Dialog",Font.BOLD,25);
		titleLabel.setFont(f);
		IDLabel=new JLabel("item ID");
		nameLabel=new JLabel("item name");
		priceLabel=new JLabel("item price");
		IDField=new JTextField(FIELD_WIDTH);
		nameField=new JTextField(FIELD_WIDTH);
		priceField=new JTextField(FIELD_WIDTH);
		sentButton=new JButton("Send");
		setLayout(new GridLayout());
		class ClickListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try{
					IDField.getText();
					nameField.getText();
					priceField.getText();
					ItemManager im=new ItemManager();
					im.addNewItem(Integer.parseInt(IDField.getText()),nameField.getText(),Double.parseDouble(priceField.getText()));
				}
				catch(Exception NumberFormatException) {
					JOptionPane.showMessageDialog(titleLabel,"Please enter the relevant information correctly","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		ActionListener lb=new ClickListener();
		sentButton.addActionListener(lb);
	}

}
