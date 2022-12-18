package springProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		HelloWorld hwBean = (HelloWorld) context.getBean("helloWorld");
		System.out.println(hwBean);
		
		HelloWorld hwBean1 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(hwBean1);
		
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);
		
		Employee emp1 = (Employee) context.getBean("employee");
		System.out.println(emp1);
		
		Employee empObj = (Employee) context.getBean("emp");
		System.out.println(empObj);
		
		Employee emp1Obj = (Employee) context.getBean("emp");
		System.out.println(emp1Obj);
		
		
		hwBean.print();
	}
}
