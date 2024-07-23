package com.important;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Utility 
{
	public static ArrayList<Employee>getEmployees() throws ParseException
	{
		ArrayList<Employee>employees=new ArrayList();
		EmployeeInterf e=Employee::new;
		employees.add(e.getEmployee("Shubham", 95000.00, getDate("10-08-2022"), "M"));
		employees.add(e.getEmployee("Sia", 100000.00, getDate("15-09-2023"), "F"));
		employees.add(e.getEmployee("Amit", 80000.00, getDate("01-10-2023"), "F"));
		employees.add(e.getEmployee("Ria", 87000.00, getDate("25-07-2023"), "F"));
		employees.add(e.getEmployee("Rahul", 88000.00, getDate("13-11-2023"), "M"));
		employees.add(e.getEmployee("Priya", 93000.00, getDate("20-12-2023"), "F"));
		employees.add(e.getEmployee("Anil", 76000.00, getDate("05-01-2024"), "M"));
		employees.add(e.getEmployee("Kiran", 82000.00, getDate("18-02-2024"), "F"));
		employees.add(e.getEmployee("Neha", 91000.00, getDate("30-03-2024"), "F"));
		employees.add(e.getEmployee("Vikram", 85000.00, getDate("12-04-2024"), "M"));
		return employees;
	
	}
	public static Date getDate(String date)throws ParseException
	{
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date date2=dateFormat.parse(date);
		return date2;
		
		
	}
	public static Employee maxSalary(List<Employee> employees)
	{
		return employees.stream().max((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).get();
	}
	public static Employee secondMaxSalary(List<Employee>employees)
	{
		List<Employee>sorted=employees.stream().sorted((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())).toList();
		return sorted.get(sorted.size()-2);
	}
	public static long countMaleEmployees(List<Employee>employees)
	{
		long c=employees.stream().filter(e->{
			return e.getGender().equals("M");
		}).count();
		return c;
	}
	public static long countFemaleEmployees(List<Employee>employees)
	{
		long c=employees.stream().filter(e->{
			return e.getGender().equals("F");
		}).count();
		return c;
	}
}
