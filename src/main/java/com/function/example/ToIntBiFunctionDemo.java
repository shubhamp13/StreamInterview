package com.function.example;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionDemo 
{
	public static void main(String[] args) {
		ToIntBiFunction<Integer,Integer>fun=(a,b)->a+b;
		System.out.println("ToIntBiFunction interface have applyAsInt() method which takes two generic type inputs and return primitive int");
		int result=fun.applyAsInt(10, 20);
		System.out.println("ToIntBiFunction: "+result);
	}
}
