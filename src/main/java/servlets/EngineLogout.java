package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.CheckUser;
import classes.User;
import context.GetContext;
import context.SetContext;


@WebServlet("EngineLogout")
public class EngineLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       CheckUser checker;
       User guest;
  
    public EngineLogout() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		GetContext getContext = new GetContext(getServletContext());
		
		checker = getContext.getCheckUserContext();
		guest = getContext.getGuestContext();
		checker.logout();
		getServletContext().getRequestDispatcher("/SignIn.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
