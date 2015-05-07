package classes;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class UsersManager {
//Fields-----------------------------------------------------------------
	private ArrayList<User> users = new ArrayList<User>();
//Constructors-----------------------------------------------------------
	public UsersManager(){
		addUser(new User("admin","admin","admin@admin.pl",AccType.ADMIN));
		
	}
	
//Methods----------------------------------------------------------------

	public void addUser(User user){
		users.add(user);
	}
	public ArrayList<User> getUsers(){
		return users;
	}
	public int getUsersSize(){
		return users.size();
	}
	public boolean isExist(HttpServletRequest request){
		for(User user : users){
			if(user.getLogin().equals(request.getParameter("login"))){
				return true;
			}
			else return false;
		}
		return false;
		
	}
	
//-----------------------------------------------------------------------

}
