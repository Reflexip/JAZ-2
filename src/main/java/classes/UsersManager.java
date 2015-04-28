package classes;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class UsersManager {
//Fields-----------------------------------------------------------------
	private ArrayList<User> users = new ArrayList<User>();
//Constructors-----------------------------------------------------------
	public UsersManager(){
		users.add(new User("admin","admin","admin@admin.pl",AccType.ADMIN));
	}
	
//Methods----------------------------------------------------------------

	public void addUser(User user){
		users.add(user);
	}
	public ArrayList<User> getUsers(){
		return users;
	}
	public void setUsers(ArrayList<User> users){
		this.users = users;		
	}
	public int getUsersSize(){
		return users.size();
	}
//-----------------------------------------------------------------------

}
