package classes;

import javax.servlet.http.HttpServletRequest;

public class User {
	
//Fields-----------------------------------------------------------------
	private String login;
	private String password;
	private String email;
	private AccType accType;
//Constructors-----------------------------------------------------------	
	
	User(HttpServletRequest request){
		this.login = request.getParameter("login");
		this.password = request.getParameter("password");
		this.email = request.getParameter("email");
		this.accType = AccType.NORMAL;
	}

	User(String login, String password, String email, AccType accType){
		this.login = login;
		this.password = password;
		this.email = email;
		this.accType = accType;		
	}
	
//Getters and Setters-----------------------------------------------------

		
	
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

	public AccType getAccType() {
		return accType;
	}

	public void setAccType(AccType accType) {
		this.accType = accType;
	}
	
}
