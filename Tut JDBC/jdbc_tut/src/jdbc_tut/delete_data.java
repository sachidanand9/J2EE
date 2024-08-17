package jdbc_tut;

import java.sql.*;

public class delete_data {

	public static void main(String[] args) throws ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/college";
		String username = "root";
		String password = "004321";
		String query = "DELETE FROM student where rollno = 209;  ";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" Driver Loaded Successfuly");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection establish sucessfully");

			Statement stmt = con.createStatement();
			int rowsaffected = stmt.executeUpdate(query);

			if (rowsaffected > 0) {
				System.out.println("Deleted Successfuly");
			} else {
				System.out.println("Deletion Failed");
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
