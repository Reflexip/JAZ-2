package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.AccType;
import classes.CheckUser;
import classes.User;
import classes.UsersManager;
import context.GetContext;
import context.SetContext;

/**
 * Servlet implementation class EngineSetPremium
 */
@WebServlet("/EngineSetPremium")
public class EngineSetPremium extends HttpServlet {
	private static final long serialVersionUID = 1L;
    CheckUser checker;
    UsersManager usersManager;
    public EngineSetPremium() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		GetContext getContext = new GetContext(getServletContext());
		
		usersManager = (UsersManager)getContext.getContext();
		checker = (CheckUser)getContext.getCheckUserContext();
		
		if(checker.isExist2(usersManager.getUsers(), request.getParameter("username"))){
			for(User user : usersManager.getUsers()){
				if(user.getLogin().equals(request.getParameter("username"))){
					user.setAccType(AccType.PREMIUM);
				}
			}
		}
		else response.getWriter().print("This user doesn't extist.");
		response.sendRedirect("EnginePremiumManager");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
