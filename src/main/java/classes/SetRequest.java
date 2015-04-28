package classes;

import javax.servlet.http.HttpServletRequest;

public class SetRequest {

//Methods----------------------------------------------------------------
	
	public void setRequestAtributes(HttpServletRequest request, User user){
		request.setAttribute("requestLogin", user.getLogin());
		request.setAttribute("requestEmail", user.getLogin());
	}
}
