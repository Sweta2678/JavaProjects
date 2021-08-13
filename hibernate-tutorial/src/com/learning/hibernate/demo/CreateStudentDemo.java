package com.learning.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();

			// query students
			List<Student> theStudents = session.createQuery("from Student").list();

			// dispalys
			displayStudents(theStudents);
			
			theStudents = session.createQuery("from Student s where s.lastName='Khatsuriya'").list();
			System.out.println("last name Khaturiya"+theStudents);
			displayStudents(theStudents);
			// commit
			
			theStudents = session.createQuery("from Student s where s.lastName='Khatsuriya' OR s.firstName='Sweta'").list();
			System.out.println("Hellooo"+theStudents);
			displayStudents(theStudents);
			
			theStudents = session.createQuery("from Student s where s.email LIKE '%@gmail.com1'").list();
			System.out.println("Hellooo222"+theStudents);
			displayStudents(theStudents);
			
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student stud : theStudents) {
			System.out.println(stud);
		}
	}

}
