package com.learning.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Course;
import com.learning.hibernate.demo.entity.Instructor;
import com.learning.hibernate.demo.entity.InstructorDetail;
import com.learning.hibernate.demo.entity.Review;

public class DeleteCourseAndReviewsDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			// start transaction
			session.beginTransaction();

			//get the course
			int id = 15;
			
			Course course  = session.get(Course.class, id);
			
			session.delete(course);
			
			System.out.println("course" + course);
			
			System.out.println("Reviews" + course.getReviews());
			
			System.out.println("Done");

			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}

}
