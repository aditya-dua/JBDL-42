package one2many2;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import one2one.Address;

public class MappingMainExampleAnnonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory factory = c.configure("hbmO2MAnnotation.cfg.xml").buildSessionFactory();
		
		Cart1 cart = new Cart1(0,200,"myCarts");
		Items1 item = new Items1("2", 200, 2, cart);
		Items1 item2 = new Items1("3", 100, 1, cart);
		
		Set<Items1> itemSet = new HashSet<Items1>();
		itemSet.add(item2);
		itemSet.add(item);

		
		
		Session session = factory.openSession();
		
		Transaction tx;
		try {
			tx = session.beginTransaction();
			session.save(cart);
			session.save(item);
			session.save(item2);
			Cart1 cartRead = session.get(Cart1.class, 1);
			System.out.println(cartRead);
			//session.save(emp1);

			tx.commit();
			session.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

}
