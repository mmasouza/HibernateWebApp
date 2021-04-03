package com.jwt.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jwt.hibernate.bean.Pessoa;

public class UserDAO {

	public List<Pessoa> buscarTodasPessoas() {

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		List<Pessoa> listaPessoas = session.createQuery("FROM Pessoa p ORDER BY p.id ASC").list();

		for (Pessoa pessoa : listaPessoas) {
			System.err.println(pessoa);
		}

		session.close();

		return listaPessoas;
	}

	public static List<Pessoa> buscarTodasPessoas(String nome, Integer idade) {

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		List<Pessoa> listaPessoas = session.createQuery("FROM Pessoa").list();

		for (Pessoa pessoa : listaPessoas) {
			System.err.println(pessoa);
		}

		session.close();

		return listaPessoas;
	}

	public void addUserDetails(String userName, String password, String email, String phone, String city) {
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
			System.out.println("\n\n Registro Adicionado. \n");
			session.close();

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}

}
