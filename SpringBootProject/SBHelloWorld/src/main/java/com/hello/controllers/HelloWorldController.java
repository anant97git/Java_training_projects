package com.hello.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {
	@RequestMapping("/helloworld")
	@ResponseBody
	public String sayHello() {
		return "Hello Spring Boot World !!!";
	}
	
	@RequestMapping("/welcomeWorld")
	@ResponseBody
	public String sayWelcome() {
		return "welcome to this place";
	}
}