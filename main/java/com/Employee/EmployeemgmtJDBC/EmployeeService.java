package com.Employee.EmployeemgmtJDBC;
import java.sql.*;
import java.util.*;
public class EmployeeService{
	public void addEmployee(Employee employee) throws Exception {
	    String insertSQL = "INSERT INTO Employee (id, name, dept) VALUES (?, ?, ?)";
	    try (Connection connection = ConnectionDetails.GetConnection();
	         PreparedStatement insertStatement = connection.prepareStatement(insertSQL)) {
	        insertStatement.setInt(1, employee.getId());
	        insertStatement.setString(2, employee.getName());
	        insertStatement.setString(3, employee.getDept());
	        int updated = insertStatement.executeUpdate();
	        System.out.println("Record inserted successfully! Employee ID: " + employee.getId());
	    }
	}
	
	public Employee getById(int id)throws Exception {
		 String updateSQL = "select * from Employee where id=?";
		Connection connection = ConnectionDetails.GetConnection();
        PreparedStatement Statement = connection.prepareStatement(updateSQL);
        Statement.setInt(1,id);
        ResultSet result = Statement.executeQuery();
        Employee emp=new Employee();
        while (result.next()) {
			emp.setId(result.getInt("id"));
			emp.setName(result.getString("name"));
			emp.setDept(result.getString("dept"));
			System.out.println("some thing");
		}

        connection.close();
        return emp;
	}
	
	public void updateEmployee(Employee employee)throws Exception {
		Connection connection = ConnectionDetails.GetConnection();
        String updateSQL = "update Employee set name = ?, dept = ?, where id= ?";
        PreparedStatement updateStatement = connection.prepareStatement(updateSQL);
        updateStatement.setString(1,employee.getName());
        updateStatement.setString(2,employee.getDept());
        updateStatement.setInt(3,employee.getId());
        int Updated = updateStatement.executeUpdate();
        System.out.println("Record inserted successfully!"+Updated);
        updateStatement.close();
        connection.close();
	}
	
	public List<Employee> getAllEmployee() throws Exception {
		List<Employee> EmployeeList=new ArrayList<>();
		Connection connection = ConnectionDetails.GetConnection();
        String updateSQL = "select * from Employee";
        PreparedStatement Statement = connection.prepareStatement(updateSQL);
        ResultSet result = Statement.executeQuery();
        while (result.next()) {
			EmployeeList.add(new Employee(result.getInt("id"),result.getString("name"),result.getString("dept")));			
		}
        Statement.close();
        connection.close();
        return EmployeeList;
	}
	
	public void deleteById(int id)throws Exception {
		Connection connection = ConnectionDetails.GetConnection();
        String updateSQL = "Delete from Employee where id=?";
        PreparedStatement Statement = connection.prepareStatement(updateSQL);
        Statement.setInt(1,id);
        int updated = Statement.executeUpdate();
        System.out.println("Successfully deleted rows:"+updated);
        Statement.close();
        connection.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}