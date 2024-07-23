package com.function.example;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer>biFunction=(a,b)->(a+b)*(a-b);
		System.out.println("BiFunction:"+biFunction.apply(20, 10));//300
		System.out.println("BiFunction:"+biFunction.apply(10, 1));//99
	}
}
