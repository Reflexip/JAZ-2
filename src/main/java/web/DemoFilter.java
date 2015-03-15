package web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/")
public class DemoFilter implements Filter {


	public void destroy() {
	}

	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain chain) throws IOException, ServletException {

		String name = request.getParameter("name");
		
		if(name!=null)
			chain.doFilter(request, response);
		else
			response.getWriter().println("No request parameter 'name'!");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
