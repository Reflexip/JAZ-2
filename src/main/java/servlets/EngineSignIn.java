package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import contexts.GetContext;
import contexts.SetContext;
import classes.CheckUser;
import classes.User;
import classes.UsersManager;


@WebServlet("/EngineSignIn")
public class EngineSignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
//Fields-----------------------------------------------------------------
    UsersManager usersManager = new UsersManager();
    CheckUser checker = new CheckUser();
    User loggedUser;
//Constructors-----------------------------------------------------------

    public EngineSignIn() {
        super();
    }

//Methods----------------------------------------------------------------
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		GetContext getContext = new GetContext(getServletContext());
		
		setContext.setBaseContext(usersManager);
		
		
		if(checker.isExist(usersManager.getUsers(), request)){
			loggedUser = checker.getLoggedUser(usersManager.getUsers(), request);
			setContext.setLoggedUserContext(loggedUser);
			response.sendRedirect("results/MySite.jsp");
			
		
		}
		else response.sendRedirect("results/PassFailed.jsp");
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
