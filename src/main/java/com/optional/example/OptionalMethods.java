package com.optional.example;

import java.util.Optional;

public class OptionalMethods 
{
	public static void main(String[] args) {
		
		String name="Shubham";
		Optional<String>optionName=Optional.ofNullable(name);
		
		//1.ifPresent(Consumer<>)
		//	This method will print value if object contains value otherwise
		//this method will print consumer which we have provided
		
//		optionName.ifPresent(s->System.out.println(s));
		
		
		//2.isPresent()
		//This method will return true if object contains value otherwise
		//it will return false
		
//		if(optionName.isPresent())
//		{
//			System.out.println(optionName);
//		}
		
		//3.isPresentOrElse()
//		optionName.ifPresentOrElse(s->System.out.println(s),()->System.out.println("Child Thread"));
		
		//4.orElseGet(Supplier<>)
		//This method will return value if present inside object otherwise it will simply return provided String supplier
//		System.out.println(optionName.orElseGet(() -> "Invalid Name"));
		System.out.println(optionName.orElseThrow(() -> new IllegalArgumentException("Invalid Argument")));
		
		
	}
}
