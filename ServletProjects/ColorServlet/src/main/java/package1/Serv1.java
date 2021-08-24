package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter(); 
		out.println("<html><body>"); 
		String name=request.getParameter("uname"); 
		String colors[]=request.getParameterValues("color");
		int clen = colors.length;
		out.println("<html><body><h1>Welcome "+ name +"!"); 
		
		out.println("<form action='Serv2'>");
		out.println("<input type='hidden' name='name' value="+name+">");
		out.println("<input type = 'hidden' name='clen' value="+clen+">");
		if (clen!=0)
		{
			for (int i=0;i<clen;i++)
				{
				  out.println("<input type = 'hidden' name = 'color"+i+"' value="+colors[i]+">");
				}
		}
		
		out.println("<br><input type='submit' value='Continue to next..'> </form>");
//		for(int i=0;i<colors.length;i++) 
//		out.println("<font color='"+ colors[i]+"'>Hello "+name+"</font><br>" ); 
		out.println("</body></html>"); 
	}

}
