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
import classes.AccType;
import classes.CheckUser;
import classes.User;
import classes.UsersManager;


@WebServlet("/Hello")
public class EngineHello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsersManager usersManager = new UsersManager();
	CheckUser checker = new CheckUser();
	
    public EngineHello() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		GetContext getContext = new GetContext(getServletContext());
		
		setContext.setContext(usersManager);
		setContext.setCheckUserContext(checker);
		
		
		response.sendRedirect("SignIn.jsp");
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

}
