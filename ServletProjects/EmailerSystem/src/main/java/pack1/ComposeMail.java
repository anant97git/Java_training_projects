package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ComposeMail
 */
@WebServlet("/ComposeMail")
public class ComposeMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComposeMail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		int empId = Integer.parseInt(request.getParameter("empId"));
		String empName = request.getParameter("empName");
		
		out.println("<html><head><title>Compose mail</title></head><body><h1>Welcome "+ empName +"!"); 
		out.println("Compose mail page </h1><br/><br/>");
		out.println("<form action='ComposeManager'>");
		out.println("<input type='hidden' name='srId' value="+empId+">");
		out.println("<input type='hidden' name='srName' value="+empName+">");
		out.println("Receiver Id :- <input type='text' name='recId'> <br/>");
		out.println("Receiver Name :- <input type='text' name='recName'> <br/> ");
		out.println("Email Content :- <input type='text' name='emContent' height='50' width='100'> <br/> ");
		out.println("<br><input type='submit' value='Send'> </form>");
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
