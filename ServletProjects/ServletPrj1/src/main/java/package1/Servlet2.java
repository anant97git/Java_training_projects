package package1;

import java.io.IOException;
import java.lang.String;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    static int count;
    
    static String getMethod()
    {
    	return "fresh look :- ";
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		String x=Integer.toString(request.getServerPort());
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath()).append(x).append(request.getServerName());
		
//		java.util.Date currDate=new java.util.Date(); 
//		java.io.PrintWriter out = response.getWriter(); 
//		response.setContentType("text/html"); 
//		out.println("<html><head><title>Greetings Servlet </title></head>"); 
//		out.println("<body>Hello "+currDate+"</body></html>"); 
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		count++;
		out.println("<html>");	
		out.println("<head><title>FreshLookServlet</title></head>");
		out.println("<body>");
		if (count%10 == 0)
		{
		out.println(Servlet2.getMethod()+"You are user number   " + String.valueOf(count)+ "  visting our web site"+ "\n");
		}
		else {
			out.println("You are user number   " + String.valueOf(count)+ "  visting our web site"+ "\n");
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
