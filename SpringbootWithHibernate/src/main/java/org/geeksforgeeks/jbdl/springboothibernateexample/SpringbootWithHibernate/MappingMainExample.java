package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory = c.configure("hbm.cfg.xml").buildSessionFactory();
		
		
		
		Employee emp = new Employee( "Aditya", "Dua");
		Employee emp1 = new Employee("ABC", "XYZ");

		Session session = factory.openSession();
		
		Transaction tx;
		try {
			tx = session.beginTransaction();
			
			session.save(emp);
			session.save(emp1);

			tx.commit();
			session.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

}
