package classes;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;



public class CheckFields {
  
//Methods----------------------------------------------------------------
	public static boolean checkLoginField(HttpServletRequest request, ArrayList<User> users){
		for (User user : users) {
			if(user.getLogin().equals(request.getParameter("login"))){
				return false;
			}
			else return true;
		}
		return true;
	}
	public static boolean checkPasswordField(HttpServletRequest request){
		if(request.getParameter("password").equals(request.getParameter("passConfirm"))){
			return true;
		}
		else return false;
	}
	public static boolean checkEmailField(HttpServletRequest request){
		if(request.getParameter("email").equals("")){
			return false;
		}
		else return true;
	}


}
