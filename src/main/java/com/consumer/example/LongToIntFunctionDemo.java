package com.consumer.example;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionDemo 
{
	public static void main(String[] args) {
		LongToIntFunction fun=i->(int)(i*i);
		System.out.println("LongToIntFunction interface have applyAsInt() method which takes primitive long as an argument and returns primitive as int");
		long l=20L;
		System.out.println("LongToIntFunction : "+fun.applyAsInt(l));
	}
}
