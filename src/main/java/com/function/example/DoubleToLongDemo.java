package com.function.example;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongDemo {
	public static void main(String[] args) {
		DoubleToLongFunction fun=i->(long)(i*i*Math.PI);
		System.out.println("DoubleToLongFunction having applyAsLong() method which takes primitive double as argument and return primitive long");
		
		long result=fun.applyAsLong(10);
		System.out.println("DoubleToLongFunction: "+result);
		
	}
}
