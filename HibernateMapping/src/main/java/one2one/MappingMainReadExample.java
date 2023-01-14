package one2one;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMainReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory = c.configure("hbm121.cfg.xml").buildSessionFactory();
		
		

		Session session = factory.openSession();
		
		Transaction tx;
		try {
			tx = session.beginTransaction();
			Address address = session.get(Address.class, 1);
			
			System.out.println("Address: "+address);
			
			Employee emp = session.get(Employee.class, 1);
			
			System.out.println("Employee	: "+emp);

			

			tx.commit();
			session.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

}
