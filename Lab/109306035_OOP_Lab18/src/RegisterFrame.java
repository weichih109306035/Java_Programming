import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class RegisterFrame extends JFrame{
	private static final int FRAME_WIDTH=800;
	private static final int FRAME_HEIGHT=300;
	private static final int FIELD_WIDTH=10;
	private static final int COLUMN=40;
	private final Register register;
	private JPanel panel;
	private JPanel addedStudentPanel;
	private JPanel addedCoursePanel;
	private JLabel addedStudentIDLabel;
	private JLabel addedCourseIDLabel;
	private JLabel addedStudentNameLabel;
	private JLabel addedCourseNameLabel;
	private JLabel creditLabel;
	private JTextField addedStudentIDField;
	private JTextField addedCourseIDField;
	private JTextField addedStudentNameField;
	private JTextField addedCourseNameField;
	private JTextField creditField;
	private JTextArea resultArea;
	private JButton addStuButton;
	private JButton addCourButton;
	public RegisterFrame() throws SQLException {
		register=new Register();
		setTitle("Course Register");
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		createPanel();
	}
	public void createAddStudentComp() {
		addedStudentPanel=new JPanel();
		addedStudentIDLabel=new JLabel("Student ID");
		addedStudentIDField=new JTextField(FIELD_WIDTH);
		addedStudentNameLabel=new JLabel("Student Name");
		addedStudentNameField=new JTextField(FIELD_WIDTH);
		addStuButton=new JButton("Add");
		EtchedBorder eb=new EtchedBorder();
		addedStudentPanel.setBorder(eb);
		Border b=BorderFactory.createTitledBorder("Add Student");
		addedStudentPanel.setBorder(b);
		class ClickListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					addedStudentIDField.getText();
					addedStudentNameField.getText();
					if(addedStudentIDField.getText()!=""&&addedStudentNameField.getText()!="") {
						register.addStudent(addedStudentIDField.getText(), addedStudentNameField.getText());
						resultArea.setText("Operation Success");
					}
					else {
						resultArea.setText("Operation failure");
					}
				}
				catch(Exception SQLException) {
					resultArea.setText("Operation Success");
				}
				finally{
					addedStudentIDField.setText("");
					addedStudentNameField.setText("");
				}
			}
		}
		ActionListener lb=new ClickListener();
		addStuButton.addActionListener(lb);
		addedStudentPanel.add(addedStudentIDLabel);
		addedStudentPanel.add(addedStudentIDField);
		addedStudentPanel.add(addedStudentNameLabel);
		addedStudentPanel.add(addedStudentNameField);
		addedStudentPanel.add(addStuButton);
		//titleBorder EtchedBorder
	}
	public void createAddCourseComp() {
		addedCoursePanel=new JPanel();
		addedCourseIDLabel=new JLabel("Course ID");
		addedCourseIDField=new JTextField(FIELD_WIDTH);
		addedCourseNameLabel=new JLabel("Course Name");
		addedCourseNameField=new JTextField(FIELD_WIDTH);
		creditLabel=new JLabel("Credit");
		creditField=new JTextField(FIELD_WIDTH);
		addCourButton=new JButton("Add");
		EtchedBorder eb=new EtchedBorder();
		addedCoursePanel.setBorder(eb);
		Border b=BorderFactory.createTitledBorder("Add Course");
		addedCoursePanel.setBorder(b);
		class ClickListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					addedCourseIDField.getText();
					addedCourseNameField.getText();
					creditField.getText();
					if(addedCourseIDField.getText()!=""&&addedCourseNameField.getText()!=""&&creditField.getText()!="") {
						register.addCourse(addedCourseIDField.getText(), addedCourseNameField.getText(),Integer.parseInt(creditField.getText()));
						resultArea.setText("Operation Success");
					}
					else {
						resultArea.setText("Operation failure");
					}
				}
				catch(Exception SQLException) {
					resultArea.setText("Operation Success");
				}
				finally{
					addedStudentIDField.setText("");
					addedStudentNameField.setText("");
					creditField.setText("");
				}
			}
		}
		ActionListener lb=new ClickListener();
		addCourButton.addActionListener(lb);
		addedCoursePanel.add(addedCourseIDLabel);
		addedCoursePanel.add(addedCourseIDField);
		addedCoursePanel.add(addedCourseNameLabel);
		addedCoursePanel.add(addedCourseNameField);
		addedCoursePanel.add(creditLabel);
		addedCoursePanel.add(creditField);
		addedCoursePanel.add(addCourButton);
		//titleBorder EtchedBorder
	}
	public void createPanel() {
		panel=new JPanel(new GridLayout(3,1));
		resultArea=new JTextArea(FRAME_HEIGHT,COLUMN);
		resultArea.setLineWrap(true);
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.add(resultArea);
		createAddStudentComp();
		createAddCourseComp();
		//panel.setLayout(new GridLayout(3,1));
		panel.add(addedStudentPanel);
		panel.add(addedCoursePanel);
		//panel.add(scrollPane);
		panel.add(resultArea);
		add(panel);
	}

}
