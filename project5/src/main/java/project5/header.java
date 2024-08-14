package project5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class header
 */
@WebServlet("/header")
public class header extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public header() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		  response.setContentType("text/html");
	        java.io.PrintWriter out = response.getWriter();
	        String userAgent = request.getHeader("User-Agent");
	        String host = request.getHeader("Host");
	        String acceptLanguage = request.getHeader("Accept-Language");
	        out.println("<html><body>");
	        out.println("<h2>Client Header Information</h2>");
	        out.println("<table border='1'>");
	        out.println("<tr><th>Header</th><th>Value</th></tr>");
	        out.println("<tr><td>User-Agent</td><td>" + userAgent + "</td></tr>");
	        out.println("<tr><td>Host</td><td>" + host + "</td></tr>");
	        out.println("<tr><td>Accept-Language</td><td>" + acceptLanguage + "</td></tr>");
	        out.println("</table>");
	        out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
