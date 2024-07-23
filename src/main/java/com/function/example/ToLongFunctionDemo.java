package com.function.example;

import java.util.function.ToLongFunction;

public class ToLongFunctionDemo {

	public static void main(String[] args) {
		ToLongFunction<Integer>fun=i->i*i+1000L;
		System.out.println("ToLongFunction interface applyAsLong takes generic as argument and return primitive long value");
		long result=fun.applyAsLong(3);
		System.out.println("ToDoubleFunction: "+result);

	}
}
