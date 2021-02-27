package com.xworkz.rich.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.rich.entity.RichEntity;

public class RichDAOImpl implements RichDAO {

	@Override
	public void create(RichEntity richEntity) {
		System.out.println("Invoked create");
		System.out.println("Entity:" + richEntity);
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(RichEntity.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.save(richEntity);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
