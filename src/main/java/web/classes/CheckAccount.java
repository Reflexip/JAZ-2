package web.classes;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class CheckAccount {
	
	private boolean exist;
	

	
	public CheckAccount(HttpServletRequest request, ArrayList<User> users){
		for(int i = 0; i <= 1; i++){
			if(request.getParameter("login") == users.get(i).getLogin()){
				if(request.getParameter("password") == users.get(i).getPassword()){
					 exist = true;	
				}
				else exist = false;
			}
			else exist = false;
			
				
			}
		
			
		}



	public boolean isExist() {
		return exist;
	}



	public void setExist(boolean exist) {
		this.exist = exist;
	}

	}


