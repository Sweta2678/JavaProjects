//package writeintotextfile;
//
//import java.beans.Statement;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//
//public class writewithDb {
//
//	public static void main(String[] args) {
//		List data = new ArrayList();
//		try {
//			Connection con = null;
//			Class.forName("com.mysql.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery("Select * from employee");
//
//			while (rs.next()) {
//				String id = rs.getString("emp_id");
//				String name = rs.getString("emp_name");
//				String address = rs.getString("emp_address");
//				String contactNo = rs.getString("contactNo");
//				data.add(id + " " + name + " " + address + " " + contactNo);
//
//			}
//			writeToFile(data, "Employee.txt");
//			rs.close();
//			st.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//
//	private static void writeToFile(java.util.List list, String path) {
//		BufferedWriter out = null;
//		try {
//			File file = new File(path);
//			out = new BufferedWriter(new FileWriter(file, true));
//			for (Object s : list) {
//				System.out.print(s);
//
//			}
//			out.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
