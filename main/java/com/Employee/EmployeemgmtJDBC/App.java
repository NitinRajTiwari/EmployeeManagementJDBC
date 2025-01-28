package com.Employee.EmployeemgmtJDBC;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {   
    	try {
    		EmployeeService empservice=new EmployeeService();
    		Employee Ram=new Employee(1,"Ram","IT");
    		Employee Shyam=new Employee(2,"Shyam","HR");
    		Employee Gopal=new Employee(3,"Gopal","Finance");
    		Employee sam=new Employee(4,"sam","Marketing");
//    		empservice.addEmployee(Ram);
//    		empservice.addEmployee(Shyam);
//    		empservice.addEmployee(Gopal);
//    		empservice.addEmployee(sam);
    		
//    		Employee emp=empservice.getById(1);
//    		System.out.println(emp);
    		
//			System.out.println(empservice.getAllEmployee());
    		
//    		empservice.deleteById(4);
    		
    		
				
			
	} 
    	catch (Exception e) {
		e.printStackTrace();
	}    
    }
}
