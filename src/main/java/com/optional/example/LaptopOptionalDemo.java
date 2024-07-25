package com.optional.example;

import java.util.Optional;
import java.util.function.Supplier;

public class LaptopOptionalDemo {
	public static void main(String[] args) {
		
//		LaptopInterf l=Laptop::new;
		LaptopInterf l=(name,modelName,price)->new Laptop(name,modelName,price);
		Laptop l1=l.getLaptop("Dell", "Inspiron 157570", 79000.00);
		Optional<String>name=l1.getName();
		System.out.println(name.get());
		Supplier<String>supply=()->new String("Shubham");
		String s1=supply.get();
		String s2=supply.get();
		System.out.println(s1+" "+s2);
		 
		
	}
}
