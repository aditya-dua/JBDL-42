package springProject.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-di.xml");
		

		
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);
		
		Address a = (Address) context.getBean("address");
		System.out.println(a);
		
		Student stu = (Student) context.getBean("student");
		System.out.println(stu);
		
		stu.print();
		
		emp.print();
	}
}
