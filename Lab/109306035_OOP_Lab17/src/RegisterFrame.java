import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RegisterFrame extends JFrame{
	private static final int FRAME_WIDTH=500;
	private static final int FRAME_HEIGHT=300;
	private static final int FIELD_WIDTH=10;
	private static final int COLUMN=40;
	private final Register register;
	private JPanel panel;
	private JPanel stuPanel;
	private JPanel courPanel;
	private JPanel butPanel;
	private JLabel studentIDLabel;
	private JLabel courseIDLabel;
	private JTextField studentIDField;
	private JTextField courseIDField;
	private JButton studentInfoButton;
	private JButton courseInfoButton;
	private JButton enrollButton;
	private JButton dropButton;
	private JTextArea resultArea;
	public RegisterFrame() {
		register=new Register();
		setTitle("Course Register");
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		createPanel();
		register.addCourse("306050001","OOPI",2);
		register.addCourse("306050021","ICS",2);
		register.addCourse("301303999","Intern",3);
		register.addStudent("109356001","A");
		register.addStudent("109356010","B");
	}
	public void createStudentIDComp() {
		studentIDLabel=new JLabel("Student ID:");
		studentIDField=new JTextField(FIELD_WIDTH);
		studentInfoButton=new JButton("Student INFO");
		courPanel=new JPanel();
		courPanel.add(studentIDLabel);
		courPanel.add(studentIDField);
		courPanel.add(studentInfoButton);
		class ClickListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				studentIDField.getText();
				register.findStudent(studentIDField.getText());
				if(register.findStudent(studentIDField.getText())!=null) {
					resultArea.setText(register.findStudent(studentIDField.getText()).getInfo());
				}
				else {
					resultArea.setText("Cannot find the student");
				}
			}
		}
		ActionListener lb=new ClickListener();
		studentInfoButton.addActionListener(lb);
	}
	public void createCourseIDComp() {
		courseIDLabel=new JLabel("Course ID:");
		courseIDField=new JTextField(FIELD_WIDTH);
		courseInfoButton=new JButton("Course INFO");
		stuPanel=new JPanel();
		stuPanel.add(courseIDLabel);
		stuPanel.add(courseIDField);
		stuPanel.add(courseInfoButton);
		class ClickListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courseIDField.getText();
				register.findCourse(courseIDField.getText());
				if(register.findCourse(courseIDField.getText())!=null) {
					resultArea.setText(register.findCourse(courseIDField.getText()).getInfo());
				}
				else {
					resultArea.setText("Cannot find the course");
				}
			}
		}
		ActionListener lb=new ClickListener();
		courseInfoButton.addActionListener(lb);
	}
	public void createEnrollBtn() {
		enrollButton=new JButton("Enroll");
		class ClickListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				studentIDField.getText();
				courseIDField.getText();
				if(register.enrollCourse(studentIDField.getText(),courseIDField.getText())==false) {
					resultArea.setText("Error");
				}
				else {
					register.enrollCourse(studentIDField.getText(),courseIDField.getText());
					String s=String.format("%s enrolled in %s\n",studentIDField.getText(),courseIDField.getText());
					resultArea.setText(s);
				}
			}
		}
		ActionListener lb=new ClickListener();
		enrollButton.addActionListener(lb);
	}
	public void createDropBtn () {
		dropButton=new JButton("Drop");
		class ClickListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				studentIDField.getText();
				courseIDField.getText();
				if(register.dropCourse(studentIDField.getText(),courseIDField.getText())==false) {
					resultArea.setText("Error");
				}
				else {
					register.dropCourse(studentIDField.getText(),courseIDField.getText());
					String s=String.format("%s dropped out of %s\n",studentIDField.getText(),courseIDField.getText());
					resultArea.setText(s);
				}
			}
		}
		ActionListener lb=new ClickListener();
		dropButton.addActionListener(lb);
	}
	public void createPanel() {
		panel=new JPanel();
		resultArea=new JTextArea(FRAME_HEIGHT,COLUMN);
		resultArea.setLineWrap(true);
		JScrollPane scrollPane=new JScrollPane(resultArea);
		createStudentIDComp();
		createCourseIDComp();
		createEnrollBtn();
		createDropBtn();
		butPanel=new JPanel();
		butPanel.add(enrollButton);
		butPanel.add(dropButton);
		panel.add(courPanel);
		panel.add(stuPanel);
		panel.add(butPanel);
		panel.add(scrollPane);
		add(panel);
	}

}
