
public class User {
	private int userID;
	private String password;
	private String identity;
	public User(int userID, String password, String identity) {
		this.userID=userID;
		this.password=password;
		this.identity=identity;
	}
	public int getID() {
		return userID;
	}
	public String getPassword() {
		return password;
	}
	public String getIdentity() {
		return identity;
	}

}
