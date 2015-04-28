package classes;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class CheckUser {
	
//Methods----------------------------------------------------------------
	
	//Method check user in base
	public boolean isExist(ArrayList<User> users, HttpServletRequest request){
		for(User user : users){
			if(user.getLogin().equals(request.getParameter("login"))){
				if(user.getPassword().equals(request.getParameter("password"))){
					return true;
				}
				return false;
			}
			return false;
		}
		return false;
		
	}
	
	//Method return logged user;
	public User getLoggedUser(ArrayList<User> users, HttpServletRequest request){
		
		for(User user : users){
			if(user.getLogin().equals(request.getParameter("login"))){
				if(user.getPassword().equals(request.getParameter("password"))){
					return user;
				}
				return null; 
			}
			else return null;
		}
		return null;
	}
	
}
