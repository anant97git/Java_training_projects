package bankLoan;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.time.LocalDateTime; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BankLoanDet
 */
@WebServlet("/BankLoanDet")
public class BankLoanDet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankLoanDet() {
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
		String accNo = request.getParameter("accNo");
		String loan = request.getParameter("loanAm");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		String random = String.format("%04d", new Random().nextInt(10000));
		
		out.println("Hello "+name+" "+dtf.format(now)+" "+loan+" "+accNo+" "+random+"<br>" ); 
		out.println("</body></html>"); 
	}

}
