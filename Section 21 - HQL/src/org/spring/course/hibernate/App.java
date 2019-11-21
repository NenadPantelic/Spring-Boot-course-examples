package org.spring.course.hibernate;

import java.util.List;

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

			// start transaction
			session.beginTransaction();

			List<User> users = session.createQuery("from User").getResultList();
			for (User user : users) {
				System.out.println(user);
			}
			// column names - entity property name (firstName) or database name (first_name)
			List<User> users2 = session.createQuery("from User where username='SonebratStalone'").getResultList();
			System.out.println("Desired users: ");
			for (User user : users2) {
				System.out.println(user);
			}
			
			session.createQuery("update User set password='pass123' where id=3").executeUpdate();
			
			session.createQuery("delete User where id=9").executeUpdate();
			session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();

		}
	}
}
