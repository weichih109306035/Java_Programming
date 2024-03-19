
public class Course {
	private String id;
	private String name;
	private int credits;
	public Course(String id, String name, int credits) {
		this.id=id;
		this.name=name;
		this.credits=credits;
	}
	public String getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getCredits(){
		return credits;
	}
	public String getInfo() {
		String info="";
		info+=String.format("[Course ID: %s, Course Name: %s, Credits: %d]",getID(),getName(),getCredits());
		return info;
	}

}
