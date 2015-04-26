package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.classes.CheckAccount;
import web.classes.DummyDB;


@WebServlet("/EngineSignIn")
public class EngineSignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	
	
    public EngineSignIn() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DummyDB dataBase = new DummyDB();
		CheckAccount check = new CheckAccount(request, dataBase.getUsers());
			if(check.isExist()){
				response.sendRedirect("UserPage.jsp");
			}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}
	}


