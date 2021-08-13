package com.learning.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				buildSessionFactory();
		
		//create session
		Session session  = factory.getCurrentSession();

		System.out.println("session"+session);
		try {
			/*
			 * //create studnet object Student tempStudent = new
			 * Student("Sweta","Bhavsar",,"swebha@gmail.com");
			 * System.out.println("tempStudent"+tempStudent); //start transaction
			 * session.beginTransaction(); //save student object session.save(tempStudent);
			 * //commit transaction session.getTransaction().commit();
			 */
		}finally {
			factory.close();
		}
	}

}
