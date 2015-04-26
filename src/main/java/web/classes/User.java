package web.classes;

import javax.servlet.http.HttpServletRequest;

public class User {
	private AccountType accType;
	private String login;
	private String password;
	private String email;
	
	User(){
		
	}
	User(AccountType acctype, String login, String password, String email){
		
	}
	User(HttpServletRequest request){
		
		
	}
	public AccountType getAccType() {
		return accType;
	}
	public void setAccType(AccountType accType) {
		this.accType = accType;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
