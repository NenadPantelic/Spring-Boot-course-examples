package org.spring.course.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.spring.course.hibernate.entity.User;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
			// create an object
			User user = new User("username", "password", "test", "test");
			// start transaction
			session.beginTransaction();
			// save the created object
			session.save(user);
			// commit transaction
			User user2 = session.get(User.class, 2);
			System.out.println(user2);
			
			User user3 = session.get(User.class, 4);
			user3.setUsername("SonebratStalone");
			
			User user4 = session.get(User.class, 5);
			session.delete(user4);
			
			session.getTransaction().commit();
			System.out.println("Row added");

		} finally {
			session.close();
			factory.close();

		}
	}
}
