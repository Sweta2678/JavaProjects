package com.learning.hibernate.demo;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

public static void main(String[] args) throws ParseException {
		
		//create session factory
		SessionFactory factory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				buildSessionFactory();
		
		//create session
		Session session  = factory.getCurrentSession();

		System.out.println("session"+session);
		try {
			//create 3 studnet object
			String theDateOfBirthStr = "31/12/1998";
			Date theDateOfBirth = DateUtils.parseDate(theDateOfBirthStr);

			Student tempStudent = new Student("Sweta", "Khatsuriya", theDateOfBirth, "swebha@gmail.com");
			
			  Student tempStudent1 = new Student("Sweta3","Bhavsar1",theDateOfBirth,"swebha@gmail.com1");
			  Student tempStudent2 = new Student("Sweta1","Bhavsar2",theDateOfBirth,"swebha@gmail.com2");
			  Student tempStudent3 = new Student("Sweta2","Bhavsar3",theDateOfBirth,"swebha@gmail.com3");
			 
			
			  System.out.println("tempStudent"+tempStudent1); //start transaction
			  session.beginTransaction(); //save student object session.save(tempStudent1);
			  session.save(tempStudent2); session.save(tempStudent3);
			 
			
			//commit transaction
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
	}

}
