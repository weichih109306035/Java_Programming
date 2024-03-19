import java.util.ArrayList;

public class Register {
	private ArrayList<Student> studentList;
	private ArrayList<Course> courseList;
	public Register() {
		studentList=new ArrayList<Student>();
		courseList=new ArrayList<Course>();
	}
	public void addStudent(String id, String name) {
		Student s=new Student(id,name);
		studentList.add(s);
	}
	public void addCourse(String id, String name, int credits) {
		Course c=new Course(id,name,credits);
		courseList.add(c);
	}
	public Student findStudent(String studentID) {
		for(Student s:studentList) {
			if(studentID.equals(s.getID())){
				return s;
			}
		}
		return null;
	}
	public Course findCourse(String courseID) {
		for(Course c:courseList) {
			if(courseID.equals(c.getID())){
				return c;
			}
		}
		return null;
	}
	public boolean enrollCourse(String studentID, String courseID) {
		/*for(Student s:studentList) {
			if(studentID.equals(s.getID())){
				for(Course c:courseList) {
					if(courseID.equals(c.getID())){
						s.updateCurrentCredits(c.getCredits());
						if(!s.getEnrolledCourses().contains(courseID)&&s.getCurrentCredits()<s.getMaxCredits()) {
							s.updateCurrentCredits(c.getCredits());
							s.getEnrolledCourses().add(courseID);
							break;
						}
					}
				}
			}
			return true;
		}
		return false;*/
		
		/*findStudent(studentID);
		findCourse(courseID);
		if(findCourse(courseID)!=null&&findStudent(studentID)!=null) {
			if(findStudent(studentID).getCurrentCredits()+findCourse(courseID).getCredits()<findStudent(studentID).getMaxCredits()&&!findStudent(studentID).getEnrolledCourses().contains(courseID)) {
				findStudent(studentID).updateCurrentCredits(findCourse(courseID).getCredits());
				findStudent(studentID).getEnrolledCourses().add(courseID);
			}
			return true;
		}
		else {
			return false;
		}*/
		findStudent(studentID);
		findCourse(courseID);
		if(findCourse(courseID)!=null&&findStudent(studentID)!=null) {
			if(findStudent(studentID).getCurrentCredits()+findCourse(courseID).getCredits()<findStudent(studentID).getMaxCredits()&&!findStudent(studentID).getEnrolledCourses().contains(courseID)) {
				findStudent(studentID).updateCurrentCredits(findCourse(courseID).getCredits());
				findStudent(studentID).getEnrolledCourses().add(courseID);
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	public boolean dropCourse(String studentID, String courseID) {
		/*for(Student s:studentList) {
			if(studentID.equals(s.getID())){
				for(String str:findStudent(studentID).getEnrolledCourses()) {
					if(str==courseID){
						s.updateCurrentCredits(-(findCourse(str).getCredits()));
						s.getEnrolledCourses().remove(findCourse(str).getID());
						break;
					}
				}
			}
			return true;
		}
		return false;*/
		
		/*findStudent(studentID);
		findCourse(courseID);
		if(findCourse(courseID)!=null&&findStudent(studentID)!=null) {
			for(String s:findStudent(studentID).getEnrolledCourses()) {
				if(s==courseID) {
					findStudent(studentID).updateCurrentCredits(-(findCourse(courseID).getCredits()));
					findStudent(studentID).getEnrolledCourses().remove(courseID);
				}
			}
			return true;
		}
		else {
			return false;
		}*/
		boolean b;
		findStudent(studentID);
		findCourse(courseID);
		if(findCourse(courseID)!=null&&findStudent(studentID)!=null) {
			if(findStudent(studentID).getEnrolledCourses().contains(courseID)) {
				findStudent(studentID).updateCurrentCredits(-(findCourse(courseID).getCredits()));
				findStudent(studentID).getEnrolledCourses().remove(courseID);
				b=true;
			}
			else {
				b=false;
			}
		}
		else {
			b=false;
		}
		return b;
	}

}
