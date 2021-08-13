package com.learning.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Course;
import com.learning.hibernate.demo.entity.Instructor;
import com.learning.hibernate.demo.entity.InstructorDetail;
import com.learning.hibernate.demo.entity.Review;
import com.learning.hibernate.demo.entity.Student;

public class AddCoursesForManyDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			// start transaction
			session.beginTransaction();

			int courseId=11;
			
			Course tempCourse = session.get(Course.class, courseId);
			
			session.delete(tempCourse);

			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}

}
