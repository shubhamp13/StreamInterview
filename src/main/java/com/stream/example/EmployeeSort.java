package com.stream.example;

import java.util.Comparator;
import java.util.List;

public class EmployeeSort 
{
	public static List<Employee>sortEmployeeByName()
	{
		return EmployeeDao.getEmployees().stream().sorted(Comparator.comparing(Employee::getEmpName)).toList();
	}
	public static List<Employee>sortEmployeeBySalary()
	{
		return EmployeeDao.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
	}
	public static List<Employee>sortEmployeeByDept()
	{
		return EmployeeDao.getEmployees().stream().sorted(Comparator.comparing(Employee::getDeptName)).toList();
	}
	public static Employee getMaxSalary()
	{
		return EmployeeDao.getEmployees().stream().max(Comparator.comparing(Employee::getSalary)).get();
	}
	public static Employee getMinSalary()
	{
		return EmployeeDao.getEmployees().stream().min(Comparator.comparing(Employee::getSalary)).get(); 
	}
	public static Employee getSecondMaxSalary()
	{
		return EmployeeDao.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).toList().get(0);
	}
}
