package pack1;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class ShowUser
 */
@WebServlet("/ShowUser")
public class ShowUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUser() {
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
		
		out.println("<html><body>");
		out.println("<h1>Show user page for the id = "+empId+" , name = "+empName+" </h1>");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emailersystem", "root", "");
			Statement stmt = con.createStatement();
			String qry = "select * from emp where empId !="+empId;
			ResultSet rs = stmt.executeQuery(qry);
			
			if (rs != null)
			{
					out.println("<table border = 1>");
					out.println("<tr><th>Employee Id </th> <th> Employee Name</th></tr>");
					while(rs.next())
					{
						out.println("<tr><td>"+ rs.getInt(1)+"</td> <td>"+ rs.getString(2)+" </td></tr>");
					}
					out.println("</table>");
			}
			else
			{
				out.println("user :- "+empName+" is alone in this system");
			}
		}
		catch(Exception e)
		{
			String ex = e.toString();
			out.println("<html><body>");
			out.println("<h1>Error due to "+e+" </h1>");
			out.println("</body></html>");
		}
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

