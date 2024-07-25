package com.stream.example;

public class Employee implements Comparable<Employee>
{
	private String empName;
	private String deptName;
	private double salary;
	public Employee(String empName, String deptName, double salary) {
		super();
		this.empName = empName;
		this.deptName = deptName;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", deptName=" + deptName + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empName.compareTo(o.empName);
	}
	
	
	
}
