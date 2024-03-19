import java.util.ArrayList;

public class Student {
	private String id;
	private String name;
	private ArrayList<String> enrolledCourses;
	private int currentCredits;
	private int maxCredits;
	public Student(String id, String name) {
		this.id=id;
		this.name=name;
		currentCredits=0;
		maxCredits=25;
		enrolledCourses=new ArrayList<String>();
	}
	public String getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getCurrentCredits() {
		return currentCredits;
	}
	public int getMaxCredits() {
		return maxCredits;
	}
	public ArrayList<String> getEnrolledCourses() {
		return enrolledCourses;
	}
	public void setID(String id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setMaxCredits(int maxCredit) {
		this.maxCredits=maxCredits;
	}
	public void setCurrentCredits(int currentCredit) {
		this.currentCredits=currentCredits;
	}
	public void updateCurrentCredits(int addedCredits) {
		if(addedCredits>0&&currentCredits+addedCredits<maxCredits) {
			currentCredits+=addedCredits;
			//setCurrentCredits(currentCredits);
		}
		else if(addedCredits<0) {
			currentCredits-=Math.abs(addedCredits);
			//setCurrentCredits(currentCredits);
		}
		else {
			return;
		}
	}
	public String getInfo() {
		String info="";
		info+=String.format("Student ID: %s, Student Name: %s, Enrolled Courses: %s, Current Credits: %d, Max Credits: %d",getID(),getName(),getEnrolledCourses().toString(),getCurrentCredits(),getMaxCredits());
		return info;
	}

}
