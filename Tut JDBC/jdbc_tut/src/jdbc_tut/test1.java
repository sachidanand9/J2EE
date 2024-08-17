package jdbc_tut;

import java.sql.*;

public class test1 {
	public static void main(String[] args) throws ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/college";
		String username = "root";
		String password = "004321";
		String query = "Select * from student;";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers loaded successfully");

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connection establish successfully");
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			
			while(res.next()){
				int rollno = res.getInt("rollno");
				String name = res.getString("name");
				int marks = res.getInt("marks");
				String GRADE = res.getString("GRADE");
				String city = res.getString("city");
				
				System.out.println();
				System.out.println("--------------------");
				System.out.println("NAME :"+name);
				System.out.println("ROLL NO :"+rollno);
				System.out.println("MARKS :"+marks);
				System.out.println("GRADE :"+GRADE);
				System.out.println("CITY :"+city);
						
			}
			
			res.close();
			stmt.close();
			con.close();
			
			System.out.println("Connection closed Successfully");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
