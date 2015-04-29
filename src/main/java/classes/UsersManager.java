package classes;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class UsersManager {
//Fields-----------------------------------------------------------------
	public static ArrayList<User> users;
//Constructors-----------------------------------------------------------
	public UsersManager(){
		users = new ArrayList<User>();
		users.add(new User("admin","admin","admin@admin.pl",AccType.ADMIN));
	}
	
//Methods----------------------------------------------------------------

	public void addUser(User user){
		users.add(user);
	}
	public ArrayList<User> getUsers(){
		return (ArrayList<User>)users;
	}

	public static int getUsersSize(){
		return users.size();
	}
//-----------------------------------------------------------------------

}
