package com.learning.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Course;
import com.learning.hibernate.demo.entity.Instructor;
import com.learning.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			//create the object 
			
			  Instructor instructor = new Instructor("Suasan","khatsuriya1","1@gmail.com");
			  InstructorDetail instructorDetail = new InstructorDetail("www.youtube.com",
			  "videoGame!!");
			  
			  //associate the object. instructor.setInstructorDetail(instructorDetail);
			 instructor.setInstructorDetail(instructorDetail);

				/* int id=1; */
		
			session.beginTransaction();
			session.save(instructor);
			/*
			 * Instructor instructor = session.get(Instructor.class,id);
			 * if(instructor!=null) { session.delete(instructor); }
			 */

			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}

}
