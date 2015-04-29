package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.CheckFields;
import classes.User;
import classes.UsersManager;
import contexts.GetContext;
import contexts.SetContext;


@WebServlet("/EngineSignUp")
public class EngineSignUp extends HttpServlet {
	
//Fields-----------------------------------------------------------------
	private static final long serialVersionUID = 1L;
	private UsersManager usersManager;;
	private CheckFields checker;
	private User user;
	
	
//Constructors-----------------------------------------------------------
	
	
    public EngineSignUp() {
        super();
    }
    
//Methods----------------------------------------------------------------

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		GetContext getContext = new GetContext(getServletContext());
		
		usersManager = getContext.getBaseContext();
		user = new User(request);
		for (User user : usersManager.getUsers()) {
			if(user.getLogin().equals(request.getParameter("login"))){
				response.getWriter().print("Your login is already used.");
			}
			else if(request.getParameter("password").equals(request.getParameter("passConfirm"))){
					if (request.getParameter("email") != null){
						usersManager.addUser(user);
						//response.sendRedirect("SignIn.jsp");
						//response.getWriter().print("Field 'Easdasasdasdddddddddddddddmail' is required.");

					}
					else response.getWriter().print("Field 'Email' is required.");
			}
			else response.getWriter().print("Confirm password failed.");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
