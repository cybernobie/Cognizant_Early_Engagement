public class Login {
	private String userName;
	private String Password;
	
	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.Password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}


}
