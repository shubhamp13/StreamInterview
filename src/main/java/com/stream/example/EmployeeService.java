package com.stream.example;

import java.util.List;

public class EmployeeService {
	public static void main(String[] args) {
		TaxService t = new TaxService();
		List<Employee> list = t.evaluateTaxUsers();
		System.out.println("Employees Eligible For Tax Pay");
		list.forEach(System.out::println);
		System.out.println("**************************************************************");
		System.out.println("Employess Sorted By Name");
		List<Employee> sortedByNameList = EmployeeSort.sortEmployeeByName();
		sortedByNameList.forEach(System.out::println);
		System.out.println("**************************************************************");
		System.out.println("Employees Sorted By Salary");
		List<Employee> sortedBySalary = EmployeeSort.sortEmployeeBySalary();
		sortedBySalary.forEach(System.out::println);
		System.out.println("**************************************************************");
		System.out.println("Employees Sorted By Departement");
		List<Employee> sortedByDept = EmployeeSort.sortEmployeeByDept();
		sortedByDept.forEach(System.out::println);
		System.out.println("**************************************************************");
		System.out.println("Employee Maximum Salary");
		System.out.println(EmployeeSort.getMaxSalary());
		System.out.println("**************************************************************");
		System.out.println("Employee Minimum Salary");
		System.out.println(EmployeeSort.getMinSalary());
		System.out.println("**************************************************************");
		System.out.println("Employee Second Max Salary");
		System.out.println(EmployeeSort.getSecondMaxSalary());
	}
}
