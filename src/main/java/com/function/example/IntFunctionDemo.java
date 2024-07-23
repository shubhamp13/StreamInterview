package com.function.example;

import java.util.function.IntFunction;

public class IntFunctionDemo 
{
	public static void main(String[] args) {
		System.out.println("IntFunction interface apply method takes primitive"
				+ "int as argument and return generic type");
		IntFunction<Integer>f=i->i*i;
		System.out.println("IntFunction :"+f.apply(10));
	}
}
