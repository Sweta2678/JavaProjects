package com.learning.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Instructor;
import com.learning.hibernate.demo.entity.InstructorDetail;

public class CreateDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			//create the object 
			/*
			 * Instructor instructor = new Instructor("sweta1","khatsuriya1","1@gmail.com");
			 * InstructorDetail instructorDetail = new InstructorDetail("www.youtube.com",
			 * "Codess!!");
			 * 
			 * //associate the object. instructor.setInstructorDetail(instructorDetail);
			 */
			int id=1;
		
			session.beginTransaction();
			Instructor instructor = session.get(Instructor.class,id);
			if(instructor!=null) {
				session.delete(instructor);
			}

			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}


}
