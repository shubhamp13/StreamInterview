package com.stream.example;

import java.util.List;

public class TaxService 
{
	public List<Employee>evaluateTaxUsers()
	{
		return EmployeeDao.getEmployees().stream().filter(e->e.getSalary()*12>700000).toList();
	}
}
