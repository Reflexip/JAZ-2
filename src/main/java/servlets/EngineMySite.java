package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import classes.AccType;
import classes.User;

@WebServlet("EngineMySite")
public class EngineMySite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       User me;
       
    public EngineMySite() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		
		me = (User)context.getAttribute("classess.User.loggedUser");
		
		request.setAttribute("requestLogin", me.getLogin());
		request.setAttribute("requestEmail", me.getEmail());
		if(me.getAccType().equals(AccType.ADMIN)){
			getServletContext().getRequestDispatcher("/results/AdminSite.jsp").forward(request, response);
		}
		else getServletContext().getRequestDispatcher("/results/MySite.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
