package bookstore.model;

public class UserBuilder {

	
	private String userName;
	private String pseudonym;
	private String password;
	
	public UserBuilder setUserName(String userName) {
		this.userName = userName;
		return this;
	}
	public UserBuilder setPseudonym(String pseudonym) {
		this.pseudonym = pseudonym;
		return this;
	}
	public UserBuilder setPassword(String password) {
		this.password = password;
		return this;
	}
	
	public User getUser() {
		return new User(userName, pseudonym, password);
	}
	
}
