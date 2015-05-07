package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import context.GetContext;
import context.SetContext;
import classes.CheckUser;
import classes.UsersManager;


@WebServlet("/EnginePremiumManager")
public class EnginePremiumManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UsersManager usersManager;
    

    public EnginePremiumManager() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		GetContext getContext = new GetContext(getServletContext());
		
		usersManager = (UsersManager)getContext.getContext();
		
		request.setAttribute("usersList", usersManager.getUsers());
		request.getRequestDispatcher("PremiumManager.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
