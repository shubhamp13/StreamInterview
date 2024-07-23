package com.function.example;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionDemo {
	public static void main(String[] args) {
		LongToDoubleFunction fun = i -> i * i * Math.PI;
		System.out.println(
				"LongToDoubleFunction have applyAsDouble() method which takes primitive long as argument and returns primitive double");
		double result=fun.applyAsDouble(5);
		System.out.println("LongToDoubleFunction: " +result);
		
	}

}
