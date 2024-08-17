package jdbc_tut;

import java.sql.*;

import java.sql.SQLException;

public class insert_data {
	public static void main(String[] args) throws ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/college";
		String username = "root";
		String password = "004321";
		String query = "INSERT INTO student(rollno, name , marks, GRADE, city) VALUES (209, 'Sahil', 78, 'A', 'Noida')";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded successfully");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection establish sucessfully");

			Statement stmt = con.createStatement();
			int rowsaffected = stmt.executeUpdate(query);

			if (rowsaffected > 0) {
				System.out.println("Inserrt Successful " + rowsaffected + " rows(s) affected");
			} else {
				System.out.println("Insertion failed ");
			}
			con.close();
			stmt.close();

			System.out.println();
			System.out.println("Connection closed Successfuly");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
