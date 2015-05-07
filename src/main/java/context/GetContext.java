package context;

import java.util.ArrayList;

import javax.servlet.ServletContext;

import classes.CheckUser;
import classes.User;
import classes.UsersManager;

public class GetContext {

	private ServletContext context;
	
	public GetContext(ServletContext context){
		this.context = context;
	}

	public UsersManager getContext(){
		return (UsersManager)context.getAttribute("classess.UsersManager.usersManager");
	}
	public ArrayList<User> getArrayListContext(){
		return (ArrayList<User>)context.getAttribute("classess.UsersManager.users");
	}
	
	public User getLoggedUserContext(){
		return (User)context.getAttribute("classess.User.loggedUser");
	}
	
	public CheckUser getCheckUserContext(){
		return (CheckUser)context.getAttribute("classess.CheckUser.checker");
	}
	public User getGuestContext(){
		return (User)context.getAttribute("classess.User.guest");
	}
}
