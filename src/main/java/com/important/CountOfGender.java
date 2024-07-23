package com.important;

import java.text.ParseException;
import java.util.List;

public class CountOfGender 
{
	public static void main(String[] args) throws ParseException
	{
		List<Employee>employees=Utility.getEmployees();
		long maleEmployees=Utility.countMaleEmployees(employees);
		long femaleEmployees=Utility.countFemaleEmployees(employees);
		System.out.println("No of Male Employees:"+maleEmployees);
		System.out.println("No Of Female Employees:"+femaleEmployees);
		
	}
}
