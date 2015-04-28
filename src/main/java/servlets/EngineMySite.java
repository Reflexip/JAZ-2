package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import contexts.GetContext;
import contexts.SetContext;
import classes.User;

@WebServlet("EngineMySite")
public class EngineMySite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       User me;

    public EngineMySite() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		GetContext getContext = new GetContext(getServletContext());
		
		me = getContext.getLoggedUserContext();
		
		request.setAttribute("requestLogin", me.getLogin());
		request.setAttribute("requestEmail", me.getEmail());
		getServletContext().getRequestDispatcher("/results/MySite.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
