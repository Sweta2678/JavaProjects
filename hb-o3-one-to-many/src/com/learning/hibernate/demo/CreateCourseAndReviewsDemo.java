package com.learning.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Course;
import com.learning.hibernate.demo.entity.Instructor;
import com.learning.hibernate.demo.entity.InstructorDetail;
import com.learning.hibernate.demo.entity.Review;

public class CreateCourseAndReviewsDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			// start transaction
			session.beginTransaction();

			// Create a course
			Course tempCourse = new Course("Pacman - game developement");

			System.out.println("saving courseee");
			// add reviews for course
			tempCourse.addReviews(new Review("Goodddd"));
			tempCourse.addReviews(new Review("Bad"));
			tempCourse.addReviews(new Review("Fantasic"));

			System.out.println("saving courseee");
			System.out.println(tempCourse);
			System.out.println(tempCourse.getReviews());

			// save cpourse = also save all reviews - cascade all leverage
			session.save(tempCourse);
			//
			System.out.println("Done");

			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}

}
