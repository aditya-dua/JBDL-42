package one2many;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory = c.configure("hbmM2M.cfg.xml").buildSessionFactory();
		
		Address address = new Address(1, "Street", "CIty", "State", "ZIPCode");
		Address address1 = new Address(1, "Street", "CIty", "State", "ZIPCode");

		Set<Address> addSet = new HashSet<Address>();
		addSet.add(address1);
		addSet.add(address);
		
		Employee emp = new Employee(2, "Aditya", "Dua");
		emp.setAddress(addSet);
		//Employee emp1 = new Employee(2, "ABC", "XYZ");

		Session session = factory.openSession();
		
		Transaction tx;
		try {
			tx = session.beginTransaction();
			session.save(address);
			session.save(address1);
			session.save(emp);
			//session.save(emp1);

			tx.commit();
			session.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

}
