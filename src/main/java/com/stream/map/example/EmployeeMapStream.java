package com.stream.map.example;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.stream.example.Employee;

public class EmployeeMapStream {
	public static void main(String[] args) {
		Map<Employee, Integer> map = new TreeMap<Employee, Integer>();
		map.put(new Employee("Shubham", "IT", 75000.00), 15);
		map.put(new Employee("Alice", "HR", 75000.00), 10);
		map.put(new Employee("Bob", "Finance", 75000.00), 20);
		map.put(new Employee("Carol", "IT", 75000.00), 25);
		map.put(new Employee("Dave", "Marketing", 75000.00), 5);
		map.put(new Employee("Eve", "HR", 75000.00), 12);
		map.put(new Employee("Frank", "Finance", 75000.00), 18);
		map.put(new Employee("Grace", "IT", 85000.00), 22);
		map.put(new Employee("Heidi", "Marketing", 78000.00), 30);
		map.put(new Employee("Ivan", "HR", 76000.00), 8);
		System.out.println("Employee Comparing By Name");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpName))).forEach(System.out::println);
		System.out.println("\n\nEmployees Comparing By Salary");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		System.out.println("\n\nEmployee Comparing By Departement");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDeptName))).forEach(System.out::println);
		System.out.println("\n\nComparing By Values");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("\n\nDescending sorting by name");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpName).reversed())).forEach(System.out::println);
		
		System.out.println("\n\nDescending orting by salary");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
		System.out.println("Descending Order By Department");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDeptName).reversed())).forEach(System.out::println);
		System.out.println("Descending order by value");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
	}

}
