package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import context.GetContext;
import context.SetContext;
import classes.CheckFields;
import classes.CheckUser;
import classes.User;
import classes.UsersManager;



@WebServlet("/EngineSignUp")
public class EngineSignUp extends HttpServlet {
	
//Fields-----------------------------------------------------------------
	private static final long serialVersionUID = 1L;
	private UsersManager usersManager;
	private User user;
//Constructors-----------------------------------------------------------
	
	
    public EngineSignUp() {
        super();
    }
    
//Methods----------------------------------------------------------------

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		GetContext getContext = new GetContext(getServletContext());
		
		usersManager = getContext.getContext();

		if(!usersManager.isExist(request)){
			if(request.getParameter("password").equals(request.getParameter("passConfirm"))){
					if (request.getParameter("email") != null){
						usersManager.addUser(user = new User(request));
						response.sendRedirect("SignIn.jsp");
					}
					else response.getWriter().print("Field 'Email' is required.");
			}
			else response.getWriter().print("Confirm password failed.");
		}
		else{
			response.getWriter().print("This login is already used.");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
