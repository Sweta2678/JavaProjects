package com.learning.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		System.out.println("session" + session);
		try {
			/*
			 * int studentId = 1; session = factory.getCurrentSession();
			 * session.beginTransaction();
			 * 
			 * System.out.println("Gettin student with id" + studentId);
			 * 
			 * Student stud = session.get(Student.class, studentId);
			 * System.out.println("updateign" + stud);
			 * 
			 * session.delete(stud);
			 * 
			 * System.out.println("student finally"+stud);
			 * 
			 * session.getTransaction().commit();
			 */
			
			//NEW CODE
			
			  session =factory.getCurrentSession(); session.beginTransaction();
			  
			  System.out.println("updating email for studnet all students");
			  
			  session.createQuery("Delete from Student where id=2").executeUpdate();
			  
			  session.getTransaction().commit();
			 
			
			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
