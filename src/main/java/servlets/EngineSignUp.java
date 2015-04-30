package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.CheckFields;
import classes.CheckUser;
import classes.User;
import classes.UsersManager;



@WebServlet("/EngineSignUp")
public class EngineSignUp extends HttpServlet {
	
//Fields-----------------------------------------------------------------
	private static final long serialVersionUID = 1L;
	UsersManager usersManager = new UsersManager();
	CheckUser checker = new CheckUser();
	ArrayList<User> users;
		private User user;
//Constructors-----------------------------------------------------------
	
	
    public EngineSignUp() {
        super();
    }
    
//Methods----------------------------------------------------------------

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		
		users = (ArrayList<User>)context.getAttribute("classess.UsersManager.users");
		
		user = new User(request);
		for (User user : users) {
			if(user.getLogin().equals(request.getParameter("login"))){
				response.getWriter().print("This login is already used.");
			}
			else if(request.getParameter("password").equals(request.getParameter("passConfirm"))){
					if (request.getParameter("email") != null){
						users.add(user);
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
