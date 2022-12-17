package springProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		HelloWorld hwBean = (HelloWorld) context.getBean("helloWorld");
		
		hwBean.print();
	}
}
