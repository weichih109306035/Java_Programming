import java.util.ArrayList;
public class Instructor extends Person {
	private String department;
	private ArrayList<String>lectureList;
	private ArrayList<Student>studentList;
	public Instructor(int ID, String name, String department) {
		super(ID,name);
		this.department=department;
		lectureList=new ArrayList<String>();
		studentList=new ArrayList<Student>();	
	}
	public String getDepartment() {
		return department;
	}
	public ArrayList<String> getLectureList() {
		return lectureList;
	}
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	public void addLecture(String lectureName) {
		lectureList.add(lectureName);
	}
	public boolean addStudent(Student student) {
		if(student.getTutorName().equals(super.getName())) {
		    studentList.add(student);
		    return true;
		}
		else {
			return false;
		}
	}
	public String getStudentName() {
		String Info="";
		for(Student stu:studentList) {
	        if(stu!=null) {
			Info+=String.format("%s,",stu.getName());
			}
		}
		Info=Info.substring(0,7);
		return Info;
	}
	public double getStudentAverage() {
		double avg=0;
		double total=0;
		double num=0;
		for(Student stu:studentList) {
		    if(stu!=null) {
			    stu.getGrade();			
		    }
		    total=total+stu.getGrade();	
		    num++;
		    avg=total/num;
		}
		return avg;
	}
	public String getInfo() {
		String info2="";
		info2+=String.format("Instructor[ID=%d, name=%s, department=%s, lectureList=%s, %s, studentList=%s]",getID(),getName(),getDepartment(),getLectureList().get(0),getLectureList().get(1),getStudentName());
		return info2;
	}
}
