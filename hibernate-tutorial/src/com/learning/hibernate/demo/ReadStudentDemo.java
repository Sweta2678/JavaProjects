package com.learning.hibernate.demo;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) throws ParseException {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		System.out.println("session" + session);
		try {
			// create studnet object

			String theDateOfBirthStr = "31/12/1998";
			Date theDateOfBirth = DateUtils.parseDate(theDateOfBirthStr);

			Student tempStudent = new Student("Sweta", "Khatsuriya", theDateOfBirth, "swebha@gmail.com");
			System.out.println("tempStudent" + tempStudent); // start transaction
			session.beginTransaction(); // save student object session.save(tempStudent);
			// commit transaction session.getTransaction().commit();

			// find by id session = factory.getCurrentSession();
			session.beginTransaction();
			Student stud = session.get(Student.class, tempStudent.getId());
			System.out.println("Get Completeeee" + stud);

			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
