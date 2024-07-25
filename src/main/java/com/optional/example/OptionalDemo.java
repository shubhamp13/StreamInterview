package com.optional.example;

 
import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) 
	{
		
		//We can create Optional object by three static methods
		
		//1.Optional.of()
		//	If Provided Object is null then it throws NPE
		//Example:
		String firstName= "Shubham";
		Optional<String>optionalFirstName=Optional.of(firstName);
		System.out.println(optionalFirstName);
		
		//2.Optional.ofNullable()
			//If Provided object is null then it will return an empty Optional object it wont throw NPE
		String middleName=null;
		Optional<String>optionalMiddleName=Optional.ofNullable(middleName);
		System.out.println(optionalMiddleName);//Optional.empty
		
		
		//3.Optional.empty()
			//This will return an Empty optional object
		
		Optional<?>emptyOptional=Optional.empty();
		System.out.println(emptyOptional);
		 
		
		
	}

}
