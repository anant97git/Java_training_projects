package com.logincontroller;
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
		
		if (uname.equals("java") && passwd.equals("spring"))
		{
			ModelAndView model = new ModelAndView("Success");
			model.addObject("msg1","Details submitted by user is correct");
			model.addObject("msg2"," details are : uname = "+uname+" , passwd = "+passwd);
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("Error");
			model.addObject("msg1","Details submitted by user is incorrect");
			model.addObject("msg2"," details are : uname = "+uname+" , passwd = "+passwd);
			return model;
		}
		
	}	
}
