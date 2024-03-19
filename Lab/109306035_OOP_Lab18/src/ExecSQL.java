import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecSQL {
	private static String url;
	private static String username;
	private static String password;
	private static Connection conn;
	public ExecSQL() throws SQLException {
		String server="jdbc:mysql://140.119.19.73:9306/";
		String database="HWTG03";
		url = server + database;
	    username = "HWTG03";
		password = "p6cPxv";
		String config="?useUnicode=true&characterEncoding=utf8";
		//conn=null;
		initializing();
		createStudentTable();
		createCourseTable();
	}
	private void initializing() throws SQLException{
		//try {
			conn = DriverManager.getConnection(url,username,password);
		//} 
		//catch (SQLException e) {
			
		//}
	}
	public boolean findTable(String tableName) throws SQLException{
		String sql="SHOW TABLES LIKE ?";
		boolean b=false;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,tableName);
			int i=ps.executeUpdate();
			if(i==-1) {
				b=true;
			}
			else {
				b=false;
			}
		} 
		catch (SQLException e) {
			
		}
		return b;
	}
	public boolean createStudentTable() throws SQLException {
		PreparedStatement cst=conn.prepareStatement("CREATE TABLE IF NOT EXISTS Student"
		        + " (ID VARCHAR(12) NOT NULL,"
				+ " Name VARCHAR(10) NOT NULL,"
				+ " CurrentCredits INT(3) NOT NULL,"
				+ " MaxCredits INT(3) NOT NULL,"
				+ " PRIMARY KEY (ID))");
		cst.executeUpdate();
		int result=cst.executeUpdate();
		if(result==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean createCourseTable() throws SQLException {
		PreparedStatement cct=conn.prepareStatement("CREATE TABLE IF NOT EXISTS Course"
				+ " (ID VARCHAR(12) NOT NULL,"
				+ " Name VARCHAR(10) NOT NULL,"
				+ " Credits INT(3) NOT NULL,"
				+ " PRIMARY KEY (ID))");
		cct.executeUpdate();
		int result=cct.executeUpdate();
		if(result==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean addStudent(Student student) throws SQLException {
		PreparedStatement as=conn.prepareStatement("INSERT INTO Student VALUES(?,?,?,?)");
		as.setString(1, student.getID());
		as.setString(2, student.getName());
		as.setInt(3, student.getCurrentCredits());
		as.setInt(4, student.getMaxCredits());
		as.executeUpdate();
		int result=as.executeUpdate();
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean addCourse(Course course) throws SQLException {
		PreparedStatement ac=conn.prepareStatement("INSERT INTO Course VALUES(?,?,?)");
		ac.setString(1, course.getID());
		ac.setString(2, course.getName());
		ac.setInt(3, course.getCredits());
		ac.executeUpdate();
		int result=ac.executeUpdate();
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
	}

}
