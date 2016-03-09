
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/HomePage.jsp")
public class LogFilter implements Filter {

    private static final String USERNAME = "ivan";
    private static final String PASSWORD = "12345";

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain) throws IOException,
            ServletException {
    	
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession();
        
        Object usr = session.getAttribute("username");
        Object pass = session.getAttribute("password");

        if (!USERNAME.equals(usr) || !PASSWORD.equals(pass)) {
        	httpResponse.sendRedirect("Login.jsp");
        } else {
            System.out.println("False");
        }

        filterchain.doFilter(request, response);

    }

    @Override
    public void init(FilterConfig filterconfig) throws ServletException {
        // TODO Auto-generated method stub

    }

}
