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
import classes.CheckUser;
import classes.User;
import classes.UsersManager;


@WebServlet("/EngineSignIn")
public class EngineSignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
//Fields-----------------------------------------------------------------
	UsersManager usersManager;
	CheckUser checker;
	User loggedUser;
//Constructors-----------------------------------------------------------

    public EngineSignIn() {
        super();
    }

//Methods----------------------------------------------------------------
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		GetContext getContext = new GetContext(getServletContext());
		
		checker = getContext.getCheckUserContext();
		usersManager = getContext.getContext();
		
		if(checker.isExist(usersManager.getUsers(), request)){
			checker.setActualUser(usersManager.getUsers(), request);
			response.sendRedirect("EngineMySite");
			
		}
		else response.sendRedirect("PassFailed.jsp");
	}
	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
