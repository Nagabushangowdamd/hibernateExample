package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		

		System.out.println("hello");

		// Create Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		Employee emp = new Employee();
		emp.seteId(2);
		emp.setName("Rama");
		emp.setSalary(1000);

		session.beginTransaction();

		// Here we have used
		// save() method of JPA
		session.save(emp);

		session.getTransaction().commit();
		session.close();
	}
}
