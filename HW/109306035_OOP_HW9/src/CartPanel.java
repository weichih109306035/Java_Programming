import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CartPanel extends JPanel{
	private static final int FIELD_WIDTH=10;
	private ItemManager itemManager;
	private Order order;
	private JPanel itemPanel;
	private JPanel quantityPanel;
	private JPanel operatePanel;
	private JLabel itemLabel;
	private JLabel quantityLabel;
	private JComboBox itemCombo;
	private JTextField quantityField;
	private JButton buyButton;
	private JButton placeButton;
	private JTextArea infoArea;
	public CartPanel(ItemManager im) {
		itemManager=new ItemManager();
		order=new Order();
		//setTitle("E-Commerce");
		setSize(650,400);
		createPanel();
	}
	public void buyItem() {
		for(Item i:itemManager.getItems()) {
			if(itemCombo.getSelectedItem().toString().equals(i.getName())) {
				order.addItem(i, Integer.parseInt(quantityField.getText()));
			}
		}
	}
	public void createItemComp() {
		itemLabel=new JLabel("Item ");
	    quantityLabel=new JLabel("Quantity ");
	    itemCombo=new JComboBox();
	    quantityField=new JTextField(FIELD_WIDTH);
	}
	public void uploadItemComp() {
		//itemCombo.removeAllItems();
		for(int i=0;i<itemManager.getItems().size();i++) {
		    itemCombo.addItem(itemManager.getItems().get(i).getName());
		}
	}
	public void createInfoArea() {
		infoArea=new JTextArea(20,30);
	}
	public void createBuyButton() {
		buyButton=new JButton("Buy More");
		class ClickListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(Integer.parseInt(quantityField.getText())>0) {
					buyItem();
					infoArea.setText("Action completed!");
					quantityField.setText("0");
				}
				else {
					JOptionPane.showMessageDialog(infoArea,"The number must above than 0","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		ActionListener lb=new ClickListener();
		buyButton.addActionListener(lb);
	}
	public  void createPlaceButton() {
		placeButton=new JButton("Check out");
		class ClickListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(quantityField.getText().equals("0")) {
					JOptionPane.showMessageDialog(infoArea,"The number must above than 0!");
				}
				else {
					buyItem();
					infoArea.setText(order.checkout());
				}
			}
		}
		ActionListener lp=new ClickListener();
		placeButton.addActionListener(lp);
	}
	public  void createPanel() {
		uploadItemComp();
		createItemComp();
		createInfoArea();
		createBuyButton();
		createPlaceButton();
		itemPanel=new JPanel();
		itemPanel.add(itemLabel);
		itemPanel.add(itemCombo);
		quantityPanel=new JPanel();
		quantityPanel.add(quantityLabel);
		quantityPanel.add(quantityField);
		operatePanel=new JPanel();
	    operatePanel.setLayout(new GridLayout(2,2));
		operatePanel.add(itemPanel);
		operatePanel.add(quantityPanel);
		operatePanel.add(buyButton);
		operatePanel.add(placeButton);
		add(operatePanel);
	}

}
