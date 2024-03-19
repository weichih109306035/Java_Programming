import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class CartFrame extends JFrame{
	private final int FRAME_WIDTH=400;
	private final int FRAME_HEIGHT=400;
	private final int FIELD_WIDTH=10;
	private ItemManager itemManager;
	private Order order;
	private JPanel itemPanel;
	private JPanel quantityPanel;
	private JPanel overallPanel;
	private JPanel operatePanel;
	private JLabel itemLabel;
	private JLabel quantityLabel;
	//private JComboBox<Item> itemCombo;
	//private JComboBox<String> itemCombo;
	private JComboBox itemCombo;
	private JTextField quantityField;
	private JButton buyButton;
	private JButton placeButton;
	private JTextArea infoArea;
	public CartFrame() {
		//JFrame cf=new CartFrame();
		itemManager=new ItemManager();
		order=new Order();
		itemManager.addNewItem(1, "Lamp", 500);
		itemManager.addNewItem(2, "Desk", 1500);
		itemManager.addNewItem(3, "Chair", 1300);
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		setTitle("Shopping cart");
		createItemComp();
		createInfoArea();
		createBuyButton();
		createPlaceButton();
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
	    //String s[]= {"Lamp","Desk","Chair"};
	    //itemCombo=new JComboBox<String>();
	    //itemCombo=new JComboBox<Item>();
	    itemCombo=new JComboBox();
	    quantityField=new JTextField(FIELD_WIDTH);
		//for(Item i:itemManager.getItems()) {
			//itemCombo.addItem(i);
		//}
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
				if(Integer.parseInt(quantityField.getText())>0) {//quantityField.getText().equals("0")
					//order.addItem((Item)itemCombo.getSelectedItem(),Integer.parseInt(quantityField.getText()));
				    //infoArea.setText("Action completed!");
					//quantityField.setText("0");
					buyItem();
					infoArea.setText("Action completed!");
					quantityField.setText("0");
				}
				else {
					JOptionPane.showMessageDialog(infoArea,"The number must above than 0!","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		ActionListener lb=new ClickListener();
		buyButton.addActionListener(lb);
	}
	public void createPlaceButton() {
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
	public void createPanel() {
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
		overallPanel=new JPanel();
		overallPanel.setLayout(new BorderLayout());
		overallPanel.add(operatePanel,BorderLayout.NORTH);
		overallPanel.add(infoArea,BorderLayout.CENTER);
		add(overallPanel);
	}

}
