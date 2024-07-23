package com.stream;

import java.util.ArrayList;
import java.util.List;

//Select Only Passes Student
//Add Grace Marks to failed student
public class StudentResult 
{
	public static void main(String[] args) 
	{        
		List<Student>students=new ArrayList();
		addStudents(students);
//		List<Student>passedStudent=students.stream().filter(s->s.getMarks()>=35).toList();
//		System.out.println(passedStudent);
//		
//		List<Student>graceMarks=students.stream().map(s->{
//			if(s.getMarks()<35)
//			{
//				s.setMarks(s.getMarks()+5);
//			}
//			return s;
//		}).toList();
//		
//		graceMarks.stream().forEach(System.out::println);
		
		List<Student>addMarks=students.stream().filter(s->s.getMarks()<35).map(s1->{
			s1.setMarks(s1.getMarks()+5);
			return s1;
		}).toList();
		System.out.println(addMarks);
		
	}
	public static void addStudents(List<Student>students)
	{

	 	Student s1 = new Student("Shubham", 101, 85);
        Student s2 = new Student("Sia", 102, 90);
        Student s3 = new Student("John", 103, 28);
        Student s4 = new Student("Alice", 104, 18);
        Student s5 = new Student("Bob", 105, 92);
        Student s6 = new Student("Eve", 106, 80);
        Student s7 = new Student("Charlie", 107, 15);
        Student s8 = new Student("Dave", 108, 5);
        Student s9 = new Student("Mallory", 109, 89);
        Student s10 = new Student("Oscar", 110, 91);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        
	}
}
