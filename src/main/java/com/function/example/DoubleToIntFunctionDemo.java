package com.function.example;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionDemo {
	public static void main(String[] args) {

		DoubleToIntFunction fun = i -> (int) (i * i * Math.PI);
		System.out.println(
				"DoubleToInt interface have applayAsInt() method which takes primitive double as argument and return primitive int");
		int result=fun.applyAsInt(10);
		System.out.println("DoubleToIntFumction: " +result);

	}

}
