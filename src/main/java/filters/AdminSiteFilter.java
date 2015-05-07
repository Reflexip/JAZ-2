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

/**
 * Servlet Filter implementation class AdminSiteFilter
 */
@WebFilter("/AdminSite.jsp")
public class AdminSiteFilter implements Filter {
	FilterConfig fConfig;
	CheckUser checker;
    
    public AdminSiteFilter() {
    }

	
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		checker = (CheckUser)fConfig.getServletContext().getAttribute("classess.CheckUser.checker");
		if(	checker.getActualUser().getAccType().equals(AccType.GUEST)||
			checker.getActualUser().getAccType().equals(AccType.NORMAL)||
			checker.getActualUser().getAccType().equals(AccType.PREMIUM)){
			if(checker.getActualUser().getAccType().equals(AccType.GUEST)){
				request.getRequestDispatcher("SignIn.jsp").forward(request, response);
				chain.doFilter(request, response);
			}
			request.getRequestDispatcher("EngineMySite").forward(request, response);
			chain.doFilter(request, response);
		}
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
	}

}
