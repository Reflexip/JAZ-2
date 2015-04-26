package web.classes;

import javax.servlet.http.HttpServletRequest;

public class User {
	//--------------------------------------------------------------------------------------

	private AccountType accType;
	private String login;
	private String password;
	private String email;
	
	private String city;
	private String country;
	private String postCode;
	private String Street;
	//--------------------------------------------------------------------------------------

	User(){
		
	}
	User(AccountType acctype, String login, String password, String email){
		this.accType 	= acctype;
		this.login 		= login;
		this.password 	= password;
		this.email 		= email;
	}
	
	public User(HttpServletRequest request){
		
	}
	
	
	
	//--------------------------------------------------------------------------------------
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
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	
}
