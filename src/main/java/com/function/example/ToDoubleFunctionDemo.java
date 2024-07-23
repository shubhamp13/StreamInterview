package com.function.example;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionDemo {
	public static void main(String[] args) {
		ToDoubleFunction<Integer>fun=i->i*i*Math.PI;
		System.out.println("ToDoubleFunction interface applyAsDouble takes generic as argument and return double value");
		double result=fun.applyAsDouble(3);
		System.out.println("ToDoubleFunction: "+result);
	}
}
