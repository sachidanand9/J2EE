package jdbc_tut;

import java.sql.*;

public class Update_Data {

	public static void main(String[] args) throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/college";
		String username = "root";
		String password = "004321";
		String query = "UPDATE student\n" + "SET name = 'Rohit', marks = 63\n"+"WHERE rollno = 105;" ;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection establish successfully");

			Statement stm = con.createStatement();
			int rowaffected = stm.executeUpdate(query);
			
			if (rowaffected>0) {
				System.out.println("Updated Sucessfuly "+rowaffected+"rows(s) affceted");
			} else {
System.out.println(" Updation falied");
			}
			
			System.out.println();
			System.out.println(" Connection closed Successfully");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
