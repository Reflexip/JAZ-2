package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import contexts.GetContext;
import contexts.SetContext;
import classes.SetRequest;
import classes.User;

@WebServlet("results/MySite")
public class EngineMySite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       User me;
       SetRequest setRequest;

    public EngineMySite() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		GetContext getContext = new GetContext(getServletContext());
		
		me = (User)getContext.getLoggedUserContext();
		
		setRequest.setRequestAtributes(request, me);
		getServletContext().getRequestDispatcher("results/MySite.jsp").forward(request, response);
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
