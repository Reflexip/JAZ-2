package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import context.SetContext;
import web.classes.Access;
import web.classes.DummyDB;
import web.classes.User;

@WebServlet("/EngineSignUp")
public class EngineSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	DummyDB database = new DummyDB();
	Access access = new Access();
	
	
    public EngineSignUp() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		setContext.setArrayContext(database);
		setContext.setArraySizeContext(database);
		
		
		access.setGetContext(getServletContext());
		
		if(access.checkExist(request)){
			if(access.checkFields(request)){
				if(access.checkConfirmPassword(request)){
					User user = new User(request);
					database.addUser(user);
					response.sendRedirect("Successful.jsp");
					
				}
				else response.sendRedirect("PassFailed.jsp");
			}
			else response.sendRedirect("FillFields.jsp");
			
		}
		response.getWriter().println("Size: " + database.getArraySize());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
