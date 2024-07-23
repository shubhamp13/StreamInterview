package com.important;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenderSort 
{
	public static void main(String[] args) throws ParseException
	{
		List<Employee>employees=Utility.getEmployees();
		Map<String,Long>m=employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(m);
		String a="aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyxx";
		  Stream<Character> characterStream = a.chars()               // IntStream
                  .mapToObj(c -> (char) c);
		Map<Character,Long> m1=  characterStream.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(m1);
		
	 
		
		
	}
}
