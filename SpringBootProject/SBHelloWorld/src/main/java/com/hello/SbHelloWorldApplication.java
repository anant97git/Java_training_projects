package com.hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbHelloWorldApplication {
   	public static void main(String[] args) {
		SpringApplication.run(SbHelloWorldApplication.class, args);
	}
}


//package com.hello;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@RestController
//@EnableAutoConfiguration
//@SpringBootApplication
//public class SbHelloWorldApplication {
//    @RequestMapping("/hello")
//    String hello() {
//        return "Hello World! Java Spring Boot Project";
//    }
//	public static void main(String[] args) {
//		SpringApplication.run(SbHelloWorldApplication.class, args);
//	}
//}
