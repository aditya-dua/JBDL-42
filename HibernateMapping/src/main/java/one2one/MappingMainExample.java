package one2one;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory = c.configure("hbm121.cfg.xml").buildSessionFactory();
		
		Address address = new Address(1, "Street", "CIty", "State", "ZIPCode");
		Address address1 = new Address(1, "Street", "CIty", "State", "ZIPCode");

		
		Employee emp = new Employee(2, "Aditya", "Dua", address);
		Employee emp1 = new Employee(2, "ABC", "XYZ", address1);

		Session session = factory.openSession();
		
		Transaction tx;
		try {
			tx = session.beginTransaction();
			session.save(address);
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
