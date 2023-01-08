import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory = c.configure("hbm.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		System.out.println("Session Started");
		
		session.close();
	}

}
