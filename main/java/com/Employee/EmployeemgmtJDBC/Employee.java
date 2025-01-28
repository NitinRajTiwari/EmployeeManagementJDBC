package com.Employee.EmployeemgmtJDBC;

public class Employee{
	private int id;
	private String name;
	private String Dept;
	Employee(){}
	Employee(int id,String name,String Dept){
		this.id=id;
		this.name=name;
		this.Dept=Dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Dept=" + Dept + "]";
	}
}