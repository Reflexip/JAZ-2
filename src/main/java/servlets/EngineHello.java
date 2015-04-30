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


@WebServlet("/Hello")
public class EngineHello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsersManager usersManager = new UsersManager();
	CheckUser checker = new CheckUser();
	ArrayList<User> users;
	
    public EngineHello() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		
		context.setAttribute("classess.UsersManager.users", usersManager.getUsers());
		
		response.sendRedirect("SignIn.jsp");
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

}
