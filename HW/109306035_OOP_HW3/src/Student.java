
public class Student {
	private int studentID;
	private String name;
	private String department;
	private int[] grades;
	private int gradesIndex;
	public Student(int studentID, String name, String department){
		this.studentID = studentID;
		this.name = name;
		this.department = department;
		grades = new int[5];
		gradesIndex = 0;
	}
    public int getStudentID() {
		return studentID;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public int[] getGrades() {
		return grades;
	}
	public int getGradesIndex() {
		return gradesIndex;
	}
	public int getGrade(int idx) {
		return grades[idx];
	}//用來從grades抓出一個一個分數

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void addGrade(int grade) {
		if(gradesIndex<5) {
			grades[gradesIndex]=grade;
			gradesIndex++;
		}
		else {
			System.out.println("Array index out of bounds.");
		}
	}
	public void updategrade(int idx, int grade){
		grades[idx]=grade;
	}
	public String info() {
		String info = "";
		info = info+String.format("Student ID: %d",getStudentID());
		info = info+String.format("\n   Name: %s",getName());
		info = info+String.format("\nDepartment: "+getDepartment());
		info = info+String.format("\n  Grades: "+getGrade(0)+" "+getGrade(1)+" "+getGrade(2)+" "+getGrade(3)+" "+getGrade(4));
		return info;
	}
}