package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Serv2
 */
@WebServlet("/Serv2")
public class Serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// url writing, hidden form
//		PrintWriter out = response.getWriter(); 
//		out.println("<html><body><h1>Welcome Again "+ request.getParameter("login")+"! "+ request.getParameter("passwd")+"</h1>"); 
//		out.println("</body></html>");
		
		// cookies
//		PrintWriter out = response.getWriter(); 
//		Cookie ck[]=request.getCookies();
//		out.println("<html><body><h1>Welcome Again "+ ck[0].getValue()+"!"); 
//		out.println("</body></html>");
//		
		// httpsession
		PrintWriter out = response.getWriter(); 
		HttpSession session= request.getSession(); 
		out.println("<html><body><h1>Welcome Again "+ session.getAttribute("loginid")+"!"); 
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
