package com.learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.demo.entity.Student;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";

		try {
			System.out.println("Connection to database" + jdbcUrl);
			Connection myConnection = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection Successful");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
