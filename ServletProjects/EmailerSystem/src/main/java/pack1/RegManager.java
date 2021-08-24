package pack1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegManager
 */
@WebServlet("/RegManager")
public class RegManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String empIdStr = request.getParameter("empId");
		String empName = request.getParameter("empName");
		String empass = request.getParameter("empass");
		
		java.io.PrintWriter out = response.getWriter(); 
		response.setContentType("text/html");
		out.println("register manager");
		
		if( (empIdStr!=null && empIdStr.trim().length()!=0) && (empName!=null && empName.trim().length()!=0) && (empass!=null && empass.trim().length()!=0))
		{
			int empId = Integer.parseInt(empIdStr);
			
//			out.println("<html><body>");
//			out.println("<h1>Registration successful</h1>");
//			out.println("</body></html>");
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emailersystem", "root", "");
				Statement stmt = con.createStatement();
				String qry = "insert into emp values ("+empId+",'"+empName+"','"+empass+"')";
				
				int x = stmt.executeUpdate(qry);
				
				if (x>0)
				{
					out.println("<html><body>");
					out.println("<h1>Registration successful </h1>");
					out.println("<h1>Welcome "+empName+" </h1>");
					out.println("<h2>Now, you can login into the emailer system</h2>");
					out.println("</body></html>");
					request.getRequestDispatcher("Login.html").include(request, response);
				}
				else 
				{
					out.println("<html><body>");
					out.println("<h1>Registration Unsuccessful</h1>");
					out.println("</body></html>");
				}
			}
			catch(Exception e)
			{
				String ex = e.toString();
				out.println("<html><body>");
				out.println("<h1>Registration Unsuccessful due to "+e+" </h1>");
				out.println("</body></html>");
			}
		}
		else 
		{
			out.println("<html><body>");
			out.println("<h1>Registration Unsuccessful</h1>");
			out.println("</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
