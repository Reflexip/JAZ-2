package contexts;

import java.util.ArrayList;

import javax.servlet.ServletContext;

import classes.User;

public class GetContext {
//Fields-----------------------------------------------------------------
	private ServletContext context;
//Constructors-----------------------------------------------------------
	
	public GetContext(ServletContext context){
		this.context = context;
	}
//Methods----------------------------------------------------------------
	public User getLoggedUserContext(){
		return (User)context.getAttribute("loggedUser");
	}
	public ArrayList<User> getBaseContext(){
		return (ArrayList<User>)context.getAttribute("UsersManager.users");
	}
	
}
