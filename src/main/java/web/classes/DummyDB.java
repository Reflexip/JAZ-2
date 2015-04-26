package web.classes;

import java.util.ArrayList;

public class DummyDB{
	
	private ArrayList<User> users = new ArrayList<User>();
	private User admin;
	

	public DummyDB(){
		addAdmin();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	
	public void addAdmin(){
		users.add((admin = new User(AccountType.ADMIN, "admin", "admin", "admin@admin.com")));
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}


}
