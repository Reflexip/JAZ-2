package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import classes.AccType;
import classes.CheckUser;


@WebFilter("/SignUp.jsp")
public class SignUpFilter implements Filter {

   FilterConfig fConfig;
   CheckUser checker;
    public SignUpFilter() {
    }

	
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		checker = (CheckUser)fConfig.getServletContext().getAttribute("classess.CheckUser.checker");
		if(	checker.getActualUser().getAccType().equals(AccType.NORMAL)||
			checker.getActualUser().getAccType().equals(AccType.PREMIUM)||
			checker.getActualUser().getAccType().equals(AccType.ADMIN)){
				request.getRequestDispatcher("EngineMySite").forward(request, response);
				chain.doFilter(request, response);
		}
		else if(checker.getActualUser().getAccType().equals(AccType.GUEST)){
			request.getRequestDispatcher("SignUp.jsp").forward(request, response);
		}
	}


	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
	}

}
