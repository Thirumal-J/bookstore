package bookstore.model;

public class User {
	
	private String userName;
	private String pseudonym;
	private String password;
	
	public User(String userName, String pseudonym, String password) {
		super();
		this.userName = userName;
		this.pseudonym = pseudonym;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", pseudonym=" + pseudonym + ", password=" + password + "]";
	}
	
	
}
