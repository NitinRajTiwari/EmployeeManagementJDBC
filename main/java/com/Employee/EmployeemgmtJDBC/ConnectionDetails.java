package com.Employee.EmployeemgmtJDBC;
import java.sql.*;

public class ConnectionDetails{

	public static String url="jdbc:mysql://localhost:3306/nitin";
	public static String username="root";
	private static String Password="Nitin@1234";
	public static Connection GetConnection() throws Exception {
		Connection connection = DriverManager.getConnection(url,username,Password);
		return connection;
	}
}