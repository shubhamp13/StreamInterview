package com.stream.map.example;

 
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.stream.example.Employee;

public class EmployeeMap {
	public static void main(String[] args) {
		Map<Employee, Integer> map = new TreeMap<Employee, Integer>((o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
//		Map<Employee, Integer> map = new TreeMap<Employee, Integer>((e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()));
//		Map<Employee, Integer> map = new TreeMap<Employee, Integer>((e1,e2)->e1.getDeptName().compareTo(e2.getDeptName()));
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
		
		Set<Entry<Employee, Integer>>set=map.entrySet();
		for(Entry<Employee, Integer>entry:set)
		{
			System.out.println("*********************************************");
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
 
		}
		

	}
}

//class MyComparator2 implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return (int) (o1.getSalary() - o2.getSalary());
//	}
//
//}
