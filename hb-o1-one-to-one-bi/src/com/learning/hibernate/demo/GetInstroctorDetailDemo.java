package com.learning.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Instructor;
import com.learning.hibernate.demo.entity.InstructorDetail;

public class GetInstroctorDetailDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			int id = 2;
			InstructorDetail instructorDetail = session.get(InstructorDetail.class, id);
			System.out.println("instructor Details" + instructorDetail);

			System.out.println("Instructorrrr" + instructorDetail.getInstructor());
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			session.close();
			factory.close();
		}
	}
}
