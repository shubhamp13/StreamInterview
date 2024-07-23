package com.function.example;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionDemo {
	public static void main(String[] args) {
		long l=100L;
		IntToLongFunction fun=i->i+l;
		System.out.println("IntToLongFunction interface applyAsLong() method takes primitive int as argument and returns long");
		long result=fun.applyAsLong(20);
		System.out.println("IntToLongFunction: "+result);
		
		
	}

}
