package com.springmvc.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.*;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Setup connection Variables
		String user = "springstudent";
		String  password ="springstudent";
		
		//get connection Db //&serverTimezone=UTC
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			
			Class.forName(driver);
			out.println("Connectiongg:::::;"+jdbcUrl);
			
			Connection conn = DriverManager.getConnection(jdbcUrl,user,password);
			out.println("Helloo connection done");
			conn.close();
			
			
		}catch(Exception exp) {
			exp.printStackTrace();
			throw new ServletException();
		}
		
	}

}
