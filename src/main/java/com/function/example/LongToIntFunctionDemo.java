package com.function.example;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionDemo {
	public static void main(String[] args) {
		LongToIntFunction fun=i->(int)(i*i);
		int result=fun.applyAsInt(10);
		System.out.println("LongToIntFunction interface have method applyAsInt() which takes primitive long as argument and  returns primitive int");
		System.out.println("LongToIntFunction:-"+result);
	}
}
