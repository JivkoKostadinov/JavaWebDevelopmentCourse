package bg.jw.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DynamicContent
 */
@WebServlet("/DynamicContent")
public class DynamicContent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DynamicContent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html ");
		Integer count = (Integer) request.getSession().getAttribute("COUNTER");
		if(count == null){
			count = 0;
		}
		response.getWriter().append(count.toString());
		request.getSession().setAttribute("COUNTER", ++count);
		response.getWriter().println(formatDynamicContent((Integer) 
				request.getSession().getAttribute("COUNTER")));
	}
	
	private String formatDynamicContent (int count) {
		StringBuilder builder = new StringBuilder();
		builder.append("<html>");
		builder.append("<head><title>").append("Dynamic servlet").append("</title></head>");
		builder.append("<body>");
		builder.append("<h2>TimeStamp: " + new Date() + "<br>").append("Times is: " + count + "</h2>" );//
		builder.append("</body></html>");
		
		return builder.toString();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
