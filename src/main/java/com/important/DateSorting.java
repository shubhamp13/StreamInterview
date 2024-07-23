package com.important;

import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class DateSorting 
{
	public static void main(String[] args) throws ParseException
	{
		List<Employee>employees=Utility.getEmployees();
		Employee emp=employees.stream().min((e1,e2)->{
			return e1.getJoiningDate().compareTo(e2.getJoiningDate());
		}).get();
		System.out.println(emp);
		
	}
}
