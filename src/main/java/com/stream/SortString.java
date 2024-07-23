package com.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortString
{
	LinkedList
	public static void main(String[] args) 
	{
		String []names= {"AAA","A","Ab"};
		Stream<String>stream=Arrays.stream(names);
		stream.sorted((a,b)->Integer.valueOf(b.length()).compareTo(a.length())).forEach(System.out::println);
	}
}
