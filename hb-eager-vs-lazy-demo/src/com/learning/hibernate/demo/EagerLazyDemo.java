package com.learning.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Course;
import com.learning.hibernate.demo.entity.Instructor;
import com.learning.hibernate.demo.entity.InstructorDetail;

public class EagerLazyDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			//start transaction
			session.beginTransaction();
			int theId =1;
			//get the instructor from db
			Instructor instructor = session.get(Instructor.class, theId);
			
			System.out.println("Sweta :Instructor"+instructor);
			//get Courses for the instructor
//			instructor.getCourses();
			//commit transaction
			session.getTransaction().commit();
			//close the session
			session.close();
			System.out.println("conn closed");
			
			System.out.println("coursedsss"+instructor.getCourses());

			System.out.println("Done");
		} finally {
			session.close();
			factory.close();
		}
	}

}
