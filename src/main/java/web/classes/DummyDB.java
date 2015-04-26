package web.classes;

import java.util.ArrayList;

public class DummyDB{
	
	private static ArrayList<User> users = new ArrayList<User>();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void addUser(User user){
		users.add(user);
	}

	public int getArraySize(){
		return users.size();
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	

}
