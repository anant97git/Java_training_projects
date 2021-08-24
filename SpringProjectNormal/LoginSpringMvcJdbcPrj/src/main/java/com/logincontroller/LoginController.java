package com.logincontroller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map; import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam; import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController {
	
	@RequestMapping(value="/loginForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("LoginForm");
		return model;	}
	
//	@RequestMapping("/submitAdmissionForm.html")
//	public ModelAndView submitAdmissionForm(@RequestParam("candidateName") String name, @RequestParam("candidateHobby") String hobby) {
//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("msg","Details submitted by you:: Name: "+name+ ", Hobby: " + hobby);
//		return model;	}
	
	
	@RequestMapping(value="/submitLoginForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar)
	{
		String uname = reqPar.get("uname");
		String passwd = reqPar.get("passwd");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
			Statement stmt = con.createStatement();
			String qry = "select username, password from users where username='"+uname+"' and password='"+passwd+"'";
			ResultSet rs = stmt.executeQuery(qry);
			
			String username = "";
			String password = "";
			
			while (rs.next())
			{
				username = rs.getString(1);
				password = rs.getString(2);
			}
	
			
			if (username.equals(uname) && password.equals(passwd))
			{
				
				ModelAndView model = new ModelAndView("Success");
				model.addObject("msg1","Details submitted by user is correct");
				model.addObject("msg2"," details are : uname = "+uname+" , passwd = "+passwd);
				return model;
			}
			else
			{
				ModelAndView model = new ModelAndView("Error");
				model.addObject("msg1","exceptions happened");
				model.addObject("msg2","check again");
				return model;
			}
		}
		catch(Exception e)
		{
			System.out.println("exception :- "+e);
			ModelAndView model = new ModelAndView("Error");
			model.addObject("msg1","Details submitted by user is incorrect");
			model.addObject("msg2"," details are : uname = "+uname+" , passwd = "+passwd);
			return model;
		}
				
	}	
}
