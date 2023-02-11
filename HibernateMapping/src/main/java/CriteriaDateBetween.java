import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


public class CriteriaDateBetween {

	public static void main(String[] args) {

		Configuration c = new Configuration();
		
		SessionFactory factory = c.configure("dateHbm.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = null;
		User user = null;

		try {
			transaction = session.beginTransaction();
			for (int i = 0; i < 10; i++) {
				user = new User(1 * i, "User " + i, "NEW DELHI" + i,
				"999999458" + i, "User@gmail.com" + i, new Date(),
						12 * i, 25000.00 * i);
				session.save(user);
			}
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		try {
			// Creating a Criteria instance
		
			 
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date d1 = (Date) format.parse("2022-11-11 00:15:00");
			Date d2 = (Date) format.parse("2024-01-01 00:15:00");
			  
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<User> cqEmp = cb.createQuery(User.class);
			Root<User> order = cqEmp.from(User.class);
			cqEmp.select(order);
			cqEmp.where(cb.between(order.<Date>get("UserDOB"), d1, d2));
			//CriteriaQuery crit = session.
			 TypedQuery<User> query = session.createQuery(cqEmp);

			List list = query.getResultList();
			
			Iterator itr = list.iterator();
			while (itr.hasNext()) {
			user = (User) itr.next();
			System.out.println("UserId: " + user.getUserId());
			System.out.printf("\t");
			System.out.println("UserName: " + user.getUserName());
			System.out.printf("\t");
			System.out.println("UserAddr: " + user.getUserAddr());
			System.out.printf("\t");
			System.out.println("ExpInMonth: " + user.getExpInMonth());

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
