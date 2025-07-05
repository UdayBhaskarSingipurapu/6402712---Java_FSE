package com.SpringDataJpa_Ex2;

import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringDataJpa_Ex2.model.Employee;

@SpringBootApplication
@EntityScan(basePackages = "com.SpringDataJpa_Ex2.model")
public class SpringDataJpaEx2Application {
	
	private static SessionFactory sessionFactory;
	
	
	public static void buildSession() {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static Integer saveEmployeeByHibernate(Employee e) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer empId = null;
		try {
			tx = session.beginTransaction();
			session.persist(e);      
	        tx.commit();
	        empId = e.getId();
		}
		catch(Exception ex) {
	         if (tx != null) tx.rollback();
	         ex.printStackTrace();
	         
		}
		finally {
			session.close();
		}
		return empId;
	}
	

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaEx2Application.class, args);
		
		buildSession();
		int empId = saveEmployeeByHibernate(new Employee(6, "Syam", 20000));
		System.out.println(empId);
	}

}
