package classes;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class CheckUser {
//Fields-----------------------------------------------------------------
	private User actualUser = new User(null, null, null, AccType.GUEST);
//Constructors-----------------------------------------------------------

	public CheckUser(){
		
	}
//Methods----------------------------------------------------------------
	
	//Method check user in base
	public boolean isExist(ArrayList<User> users, HttpServletRequest request){
		System.out.println("Ładuję listę");
		for(User user : users){
			if(user.getLogin().equals(request.getParameter("login"))){
				if(user.getPassword().equals(request.getParameter("password"))){
					return true;
				}
				else return false;
			}
		}
		return false;
	}
	public boolean isExist2(ArrayList<User> users, String login){
		for(User user : users){
			if(user.getLogin().equals(login)){
				return true;
			}
		}
		return false;
		
	}
	
	//Method return Actual user;
	public User getActualUser(){
		return actualUser;		
	}
	public void logout(){
		actualUser = new User(null, null, null, AccType.GUEST);
	}
	public void setActualUser(ArrayList<User> users, HttpServletRequest request){
		for(User user : users){
			if(user.getLogin().equals(request.getParameter("login"))){
				if(user.getPassword().equals(request.getParameter("password"))){
					actualUser = user;
					break;
				}
				else actualUser = null;
			}
			else actualUser = null;
		}
	}
	
}
