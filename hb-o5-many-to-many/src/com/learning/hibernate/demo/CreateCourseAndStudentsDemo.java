package com.learning.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Course;
import com.learning.hibernate.demo.entity.Instructor;
import com.learning.hibernate.demo.entity.InstructorDetail;
import com.learning.hibernate.demo.entity.Review;
import com.learning.hibernate.demo.entity.Student;

public class CreateCourseAndStudentsDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			// start transaction
			session.beginTransaction();

			// Create a course
			Course tempCourse = new Course("Pacman - game developement");
			
			session.save(tempCourse);
			System.out.println("Save course completed");
			
			//create student
			Student tempStudent1 = new Student("Sweta" , "khatsuriya" ,"s@gmail.com");
			Student tempStudent2 = new Student("Prachi", "khatsuriya" ,"s@gmail.com");
			Student tempStudent3 = new Student("Prathmesh", "khatsuriya" ,"s@gmail.com");
			
			tempCourse.addStudents(tempStudent1);
			tempCourse.addStudents(tempStudent2);
			tempCourse.addStudents(tempStudent3);
			
			//save student
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);

		
			
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}

}
