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
 * Servlet implementation class LogManager
 */
@WebServlet("/LogManager")
public class LogManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogManager() {
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
//		String empName = request.getParameter("empName");
		String empass = request.getParameter("empass");
		
		java.io.PrintWriter out = response.getWriter(); 
		response.setContentType("text/html");
		
		if( (empIdStr!=null && empIdStr.trim().length()!=0) && (empass!=null && empass.trim().length()!=0))
		{
			int empId = Integer.parseInt(empIdStr);
			
//			out.println("<html><body>");
//			out.println("<h1>Login successful</h1>");
//			out.println("</body></html>");
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emailersystem", "root", "");
				Statement stmt = con.createStatement();
				String qry = "select * from emp where empId="+empId+" and empass='"+empass+"'";
				ResultSet rs = stmt.executeQuery(qry);
				
				
				if (rs != null)
				{
					rs.last();
					int rcount = rs.getRow();
					if (rcount == 1)
					{
						String empName = rs.getString(2);
						out.println("<html><body>");
						out.println("<h1>Login successful </h1>");
						out.println("<h1>Welcome "+empName+" </h1>");
//						out.println("<a href='Serv2?login="+login+"&passwd="+pd+"'>");
						out.println("<a href='ShowUser?empId="+empId+"&empName="+empName+"'>Show other users</a>");
						out.println("<a href='ComposeMail?empId="+empId+"&empName="+empName+"'>Compose</a>");
						out.println("<a href='InboxMail?empId="+empId+"&empName="+empName+"'>Inbox</a>");
						out.println("<a href='DraftMail?empId="+empId+"&empName="+empName+"'>Draft</a>");
						out.println("<a href='DeleteMail?empId="+empId+"&empName="+empName+"'>Delete</a>");
						out.println("<a href='index.html'>LogOut</a>");
						out.println("</body></html>");
//						request.getRequestDispatcher("Welcome.html").include(request, response);
						
					}
					else 
					{
						out.println("<html><body>");
						out.println("<h1>Login Unsuccessful  </h1>");
						out.println("</body></html>");
					}
				}
				else
				{
					out.println("<html><body>");
					out.println("<h1>Login Unsuccessful  </h1>");
					out.println("</body></html>");
				}
			}
			catch(Exception e)
			{
				String ex = e.toString();
				out.println("<html><body>");
				out.println("<h1>Login Unsuccessful due to "+e+" </h1>");
				out.println("</body></html>");
			}
		}
		else 
		{
			out.println("<html><body>");
			out.println("<h1>Login Unsuccessful</h1>");
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
