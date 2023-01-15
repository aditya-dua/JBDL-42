package one2many2;
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
		
		SessionFactory factory = c.configure("hbmO2M.cfg.xml").buildSessionFactory();
		
		Items item = new Items("2", 200, 2);
		Items item2 = new Items("3", 100, 1);
		
		Set<Items> itemSet = new HashSet<Items>();
		itemSet.add(item2);
		itemSet.add(item);

		
		Cart cart = new Cart(300,"myCart",itemSet);
		Session session = factory.openSession();
		
		Transaction tx;
		try {
			tx = session.beginTransaction();
			session.save(cart);
			session.save(item);
			session.save(item2);
			
			//session.save(emp1);

			tx.commit();
			session.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

}
