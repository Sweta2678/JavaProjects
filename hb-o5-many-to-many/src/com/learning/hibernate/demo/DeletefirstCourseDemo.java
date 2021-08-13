package com.learning.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Course;
import com.learning.hibernate.demo.entity.Instructor;
import com.learning.hibernate.demo.entity.InstructorDetail;
import com.learning.hibernate.demo.entity.Review;
import com.learning.hibernate.demo.entity.Student;

public class DeletefirstCourseDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			// start transaction
			session.beginTransaction();

			int id =1;
			//get student from database
			Student tempStuent = session.get(Student.class,id );
			System.out.println(tempStuent);
			System.out.println("mary's courses"+tempStuent.getCourses());
			
//			//create more course
//			Course course1 = new Course("How to solve rubik's Cube");
//			Course course2 = new Course("Game Development - 2048");
//			
//			course1.addStudents(tempStuent);
//			course2.addStudents(tempStuent);
//
//			//add student to course
//			session.save(course1);
//			session.save(course2);
			
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}

}
