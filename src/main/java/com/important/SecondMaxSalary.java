package com.important;

import java.text.ParseException;
import java.util.List;

public class SecondMaxSalary 
{
	public static void main(String[] args) throws ParseException
	{
		List<Employee>employees=Utility.getEmployees();
		Employee secondMaxSlary=Utility.secondMaxSalary(employees);
		System.out.println(secondMaxSlary);
	}
}
