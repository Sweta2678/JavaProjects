package com.learning.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.learning.hibernate.demo.entity.Course;
import com.learning.hibernate.demo.entity.Instructor;
import com.learning.hibernate.demo.entity.InstructorDetail;

public class GetInstructorCoursesDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			//start transaction
			session.beginTransaction();
			
			//hibernate Query 
			
			
			int theId =1;
			//get the instructor from db
			 //query with the HQL
			
			Query<Instructor> query = session.createQuery(
					"Select i from Instructor i " + "JOIN FETCH i.courses " + "where i.id=:theInstructorId",
					Instructor.class);
			
			//set param on query :
			query.setParameter("theInstructorId", theId);
			Instructor tmpInstructor = query.getSingleResult();
			session.getTransaction().commit();
			session.close();
			//execute query and instructor 
		
			
			System.out.println("tmpInstructor"+tmpInstructor);
			//commit transaction
			
		} finally {
			session.close();
			factory.close();
		}
	}

}
