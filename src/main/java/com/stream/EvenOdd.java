package com.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Even numbers Using Stream
public class EvenOdd 
{
	public static void main(String[] args) 
	{
		List<Integer>list=List.of(5,10,15,20,25,40,12,24,21);
		
		Stream<Integer>stream=list.stream();
		List<Integer>evenList=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenList);
	}
}
