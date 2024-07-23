package com.function.example;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionDemo 
{
	public static void main(String[] args) {
		ToDoubleBiFunction<Double,Double>fun=(a,b)->(a*b)/10.0;
		System.out.println("ToDoubleBiFunction interface have applyAsDouble() method which takes generics as arguments and returns primitive double");
		double result=fun.applyAsDouble(10.0, 20.0);
		 System.out.println("ToDoubleBiFunction: "+result);
 
	}
}
