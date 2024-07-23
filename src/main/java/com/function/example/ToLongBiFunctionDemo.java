package com.function.example;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionDemo {
	public static void main(String[] args) {
		ToLongBiFunction<Long,Long>fun=(a,b)->a*b;
		System.out.println("ToLongBiFunction takes generic as input and return primitive long as result");
		long result=fun.applyAsLong(20L, 15L);
		System.out.println("ToLongBiFunction: "+result);
	}
}
