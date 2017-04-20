package com.tpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.services.MyService;

public class MainApp {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	MyService myService = context.getBean("PrintService",MyService.class);
	
	//MyServiceImpl myService = (MyServiceImpl)context.getBean("PrintService");
	AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext("HelloWorldConfig.class");
	myService.printMe();		
	}

}
