import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student(1, "ABC", 12, "12345678");
		Configuration c = new Configuration();
		
		SessionFactory factory = c.configure("hbm.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(s);
		
		tx.commit();
		System.out.println("Session Started");
		
		session.close();
	}

}
