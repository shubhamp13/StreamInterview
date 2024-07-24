package com.stream.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao 
{
	public static List<Employee> getEmployees()
	{
		List<Employee>employees=new ArrayList<Employee>();
		employees.add(new Employee("Shubham Puri", "IT", 95000));
		employees.add(new Employee("Sia Patankar", "Finance", 478000));
		employees.add(new Employee("Rohan Mehta", "HR", 6200));
		employees.add(new Employee("Anita Verma", "Marketing", 750));
		employees.add(new Employee("Vikram Singh", "Sales", 600));
		employees.add(new Employee("Neha Gupta", "IT", 90000));
		employees.add(new Employee("Arjun Kapoor", "Finance", 71000));
		employees.add(new Employee("Priya Reddy", "HR", 630));
		employees.add(new Employee("Kiran Patel", "Marketing", 4000));
		employees.add(new Employee("Lakshmi Iyer", "Sales", 70000));
		return employees;

	}
}
