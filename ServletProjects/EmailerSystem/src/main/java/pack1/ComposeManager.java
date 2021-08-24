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

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

/**
 * Servlet implementation class ComposeManager
 */
@WebServlet("/ComposeManager")
public class ComposeManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComposeManager() {
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
		int empId = Integer.parseInt(request.getParameter("srId"));
		String empName = request.getParameter("srName");
		
		int srId = empId;
		String srName = empName;
		int recId = Integer.parseInt(request.getParameter("recId"));
		String recName = request.getParameter("recName");
		String emContent = request.getParameter("emContent");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		String timing = now.toString();
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emailersystem", "root", "");
			Statement stmt = con.createStatement();
//			String qry = "select * from emp where empId="+empId+" and empass='"+empass+"'";
//			ResultSet rs = stmt.executeQuery(qry);
			
			String qry1 = "select empName from emp where empId = "+recId;
			ResultSet rs1 = stmt.executeQuery(qry1);
			
			if (rs1 != null)
			{
//				out.println("hele");
				String rname = "";
				
				while (rs1.next())
				{
					rname = rs1.getString(1);
				}
				
				if (rname.equals(recName))
				{
				String qry2 = "insert into email (srId,srName,recId,recName,emContent,Timing) VALUES ("+srId+",'"+srName+"',"+recId+",'"+recName+"','"+emContent+"','"+timing+"')";
//							insert into email (srId, srName, recId, recName, emContent, Timing) VALUES (1,'Anant',2,'Ram','hello', '2017/11/06 12:11:58');
				int x = stmt.executeUpdate(qry2);
				
					if (x>0)
					{
						out.println("<html><body>");
						out.println("<h1>email sent successful</h1>");
						out.println("</body></html>");
					}
					else
					{
						out.println("<html><body>");
						out.println("<h1>email r1 sent Unsuccessful</h1>");
						out.println("</body></html>");
					}
			    }
				else
				{
					out.println("<html><body>");
					out.println("<h1>email r2 sent Unsuccessful</h1>");
					out.println("</body></html>");
				}
			}
			else
			{
				out.println("<html><body>");
				out.println("<h1>email sent Unsuccessful</h1>");
				out.println("</body></html>");
			}
			
		}		
		catch(Exception e)
		{
			String ex = e.toString();
			out.println("<html><body>");
			out.println("<h1>Composing mail Unsuccessful due to "+e+" </h1>");
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
