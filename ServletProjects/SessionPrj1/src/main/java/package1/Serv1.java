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
 * Servlet implementation class Serv1
 */
@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// have no way of doing session management
//		PrintWriter out = response.getWriter(); 
//		String login=request.getParameter("login");
//         String pd=request.getParameter("passwd");
//		out.println("<html><body><h1>Welcome "+ login +"!"); 
//		out.println("<a href='Serv2'>");
//		out.println("<br>Continue to next.. </a>");
//		out.println("</body></html>");

		/// url writing
//		PrintWriter out = response.getWriter(); 
//		String login=request.getParameter("login");
//		out.println("<html><body><h1>Welcome "+ login +"!"); 
//        String pd=request.getParameter("passwd");
//		out.println("<a href='Serv2?login="+login+"&passwd="+pd+"'>");
//		out.println("<br>Continue to next.. </a>");
//		out.println("</body></html>");
		
		// hidden form
//		PrintWriter out = response.getWriter(); 
//		String login=request.getParameter("login");
//		String pd=request.getParameter("passwd");
//		out.println("<html><body><h1>Welcome "+ login +"!"); 
//		out.println("<form action='Serv2'>");
//		out.println("<input type='hidden' name='login' value="+login+">");
//		out.println("<input type='hidden' name='passwd' value="+pd+">");
//		out.println("<br><input type='submit' value='Continue to next..'> </form>");
//		out.println("</body></html>");
		
		// cookies
//		PrintWriter out = response.getWriter(); 
//		String login=request.getParameter("login");
//		out.println("<html><body><h1>Welcome "+ login +"!"); 
//		Cookie ck=new Cookie("loginid",login);//creating cookie object  
//		response.addCookie(ck);//adding cookie in the response
//		out.println("<form action='Serv2' method='get'>");
//		out.println("<br><input type='submit' value='Continue to next..'> </form>");
//		out.println("</body></html>");
		
		// http session
		PrintWriter out = response.getWriter(); 
		String login=request.getParameter("login");
		out.println("<html><body><h1>Welcome "+ login +"!"); 
		HttpSession session= request.getSession(); 
		session.setAttribute("loginid",login); 
		out.println("<form action='Serv2' >");
		out.println("<br><input type='submit' value='Continue to next..'> </form>");
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
