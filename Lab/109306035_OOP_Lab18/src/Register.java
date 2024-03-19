import java.sql.SQLException;

public class Register {
	private ExecSQL exec;
	public Register()throws SQLException{
		exec=new ExecSQL();
	}
	public boolean addStudent(String id, String name) throws SQLException{
		if(exec.findTable("Student")!=false) {
			Student s=new Student(id,name);
			exec.addStudent(s);
			return true;
		}
		else {
			return false;
		}
	}
	public boolean addCourse(String id, String name, int credits) throws SQLException{
		if(exec.findTable("Course")!=false) {
			Course c=new Course(id,name,credits);
			exec.addCourse(c);
			return true;
		}
		else {
			return false;
		}
	}

}
