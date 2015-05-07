package context;

import javax.servlet.ServletContext;

import classes.CheckUser;
import classes.User;
import classes.UsersManager;

public class SetContext {
	private ServletContext context;
	
	public SetContext(ServletContext context){
		super();
		this.context = context;
	}

	public void setContext(UsersManager usersManager){
		context.setAttribute("classess.UsersManager.usersManager", usersManager);
	}
	public void setCheckUserContext(CheckUser checker){
		context.setAttribute("classess.CheckUser.checker", checker);
	}
	
}
