package com.jwt.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jwt.hibernate.bean.Pessoa;

public class UserDAO {

	public void addUserDetails(String userName, String password, String email,
			String phone, String city) {
		try {
			// 1. configuring hibernate
			Configuration configuration = new Configuration().configure();

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();
			Pessoa usu = new Pessoa();
			usu.setUserName(userName);
			usu.setPassword(password);
			usu.setEmail(email);
			usu.setCity(city);
			usu.setPhone(phone);
			session.save(usu);
			transaction.commit();
			System.out.println("\n\n Details Added \n");
			session.close();
			

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}
		

	}

}
