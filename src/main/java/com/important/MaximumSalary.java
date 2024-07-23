package com.important;

 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

 

public class MaximumSalary 
{
	public static void main(String[] args) throws ParseException
	{	 
		List<Employee>employees=Utility.getEmployees();
	  Employee t=employees.stream().max((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).get();
	  System.out.println(t);
		
	}

}
