package contexts;

import java.util.ArrayList;

import javax.servlet.ServletContext;

import classes.User;
import classes.UsersManager;

public class SetContext {

//Fields-----------------------------------------------------------------
	private ServletContext context;
	

	
//Constructors-----------------------------------------------------------
	public SetContext(ServletContext context){
		super();
		this.context = context;
		
	}	
//Methods----------------------------------------------------------------
	public void setLoggedUserContext(User user){
		context.setAttribute("loggedUser", user);		
	}
	
	public void setBaseContext(UsersManager usersManager){
		context.setAttribute("UsersManager.users", usersManager.getUsers());
	}
	
	
	

}
