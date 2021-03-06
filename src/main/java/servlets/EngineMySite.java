package servlets;

import java.io.IOException;

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

@WebServlet("/EngineMySite")
public class EngineMySite extends HttpServlet {
	private static final long serialVersionUID = 1L;
		CheckUser checker;
   
       
    public EngineMySite() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetContext setContext = new SetContext(getServletContext());
		GetContext getContext = new GetContext(getServletContext());
		
		checker = (CheckUser)getContext.getCheckUserContext();
		

		
		request.setAttribute("requestLogin", 	checker.getActualUser().getLogin());
		request.setAttribute("requestEmail", 	checker.getActualUser().getEmail());
		request.setAttribute("requestAccType",	checker.getActualUser().getAccType());
		if(checker.getActualUser().getAccType().equals(AccType.ADMIN)){
			getServletContext().getRequestDispatcher("/AdminSite.jsp").forward(request, response);
		}
		else{
			getServletContext().getRequestDispatcher("/MySite.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
