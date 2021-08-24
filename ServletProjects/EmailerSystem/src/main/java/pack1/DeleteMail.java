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
 * Servlet implementation class DeleteMail
 */
@WebServlet("/DeleteMail")
public class DeleteMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMail() {
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
		out.println("<h1>Inbox page for the user with id = "+empId+" , name = "+empName+" </h1>");
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emailersystem", "root", "");
			Statement stmt = con.createStatement();
			
			out.println("<h1>Sent Emails</h1>");
			
			String qry1 = "select emailId, recId,recName,emContent,Timing from email where srId="+empId;
			ResultSet rs1 = stmt.executeQuery(qry1);
			
			if (rs1 != null)
			{
				out.println("<table border = 1>");
				out.println("<tr><th>RecId</th> <th> RecName</th> <th>Email content</th> <th>Timing</th> <th> Delete </th> </tr>");
				while(rs1.next())
				{
					int emailId = rs1.getInt(1);
					out.println("<tr><td>"+ rs1.getInt(2) +"</td> <td> "+ rs1.getString(3)+"</td> <td> "+rs1.getString(4)+"</td> <td>"+rs1.getString(5)+"</td> <td><form action='DeleteManager'> <input type='hidden' name='emailId' value="+emailId+"> <input type='submit' value='Delete'> </form></td> </tr>");
				}
				
				out.println("</table>");
			}
			else 
			{
				out.println("<br/><br/><h3>You have not sent any mail.</h3>");
			}
			
			out.println("<br/><br/> <h1>Received Emails </h1> ");
			qry1 = "select emailId, srId,srName,emContent,Timing from email where recId="+empId;
			rs1 = stmt.executeQuery(qry1);
			
			if (rs1 != null)
			{
				out.println("<table border = 1>");
				out.println("<tr><th>SrId</th> <th> SrName</th> <th>Email content</th> <th>Timing</th> <th> Delete </th> </tr>");
				while(rs1.next())
				{
					int emailId = rs1.getInt(1);
					out.println("<tr><td>"+ rs1.getInt(2) +"</td> <td> "+ rs1.getString(3)+"</td> <td> "+rs1.getString(4)+"</td> <td>"+rs1.getString(5)+"</td> <td><form action='DeleteManager'> <input type='hidden' name='emailId' value="+emailId+"> <input type='submit' value='Delete'> </form></td> </tr>");
				}
				
				out.println("</table>");
			}
			else 
			{
				out.println("<br/><br/><h3>You have not received any mail.</h3>");
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
