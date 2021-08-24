

package com.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context =
	new ClassPathXmlApplicationContext("Beans.xml");
	HelloWorld obj = (HelloWorld) context.getBean("idhello2");
	obj.getMessage();
	context.close();
	}
	
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//	ApplicationContext context =
//	new ClassPathXmlApplicationContext("Beans.xml");
//	HelloWorld obj = (HelloWorld) context.getBean("idhello");
//	obj.getMessage();
//	//context.close();
//	}
//	public static void main(String[] args) {
//	ApplicationContext context = (ApplicationContext)
//	new ClassPathXmlApplicationContext("Beans.xml");
//	HelloWorld obj = (HelloWorld) context.getBean("idhello");
//	obj.getMessage();
//	//context.close();
//	}
}