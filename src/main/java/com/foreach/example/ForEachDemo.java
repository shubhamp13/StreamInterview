package com.foreach.example;

import java.util.ArrayList;
import java.util.List;
public class ForEachDemo {
	public static void main(String[] args) {
		System.out.println("******************************************************\n");
		
		List<String>list=new ArrayList<String>();
		list.add("Shubham");
		list.add("Shrikant");
		list.add("Sejal");
		list.add("Ajay");
		list.add("Puri");
		list.add("Surve");
		list.add("Patankkar");
		for(String name:list)
		{
			System.out.println(name);
		}
		System.out.println("******************************************************\n");
		
		list.forEach(System.out::println);
		System.out.println("******************************************************\n");
		
		//Filter Names which are starting with s
		list.stream().filter(s->s.startsWith("S")).forEach(System.out::println);
		System.out.println("******************************************************");
		
	 
	}

}
