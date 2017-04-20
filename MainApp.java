package tpoint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ApplicationConfig;

public class MainApp {

	public static void main(String[] args) {		
	//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");	//  not using Beans.xml here
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    	HelloWorld hw = (HelloWorld)ctx.getBean("helloworld");
    	hw.printMe();
	}
}
