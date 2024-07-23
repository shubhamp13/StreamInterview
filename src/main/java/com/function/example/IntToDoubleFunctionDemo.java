package com.function.example;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionDemo {
	public static void main(String[] args) {
		IntToDoubleFunction fun=i->i*i*Math.PI;
		System.out.println("IntToDoubleFunction interface applyAsDouble() method takes primitive int as an argument and returns primitive double");
		double result=fun.applyAsDouble(5);
		System.out.println("IntToDoubleFunction: "+result);
		
	}
}
