package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import classes.CheckUser;
import classes.User;
import classes.UsersManager;


@WebServlet("/EngineSignIn")
public class EngineSignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
//Fields-----------------------------------------------------------------
	CheckUser checker = new CheckUser();
	UsersManager usersManager;
	User loggedUser;
//Constructors-----------------------------------------------------------

    public EngineSignIn() {
        super();
    }

//Methods----------------------------------------------------------------
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		
		usersManager = (UsersManager)context.getAttribute("classess.UsersManager");
		
		if(checker.isExist(usersManager.getUsers(), request)){
			loggedUser = checker.getLoggedUser(usersManager.getUsers(), request);
			context.setAttribute("classess.User.loggedUser", loggedUser);
			response.sendRedirect("EngineMySite");
		}
		else response.sendRedirect("results/PassFailed.jsp");
	}
	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
