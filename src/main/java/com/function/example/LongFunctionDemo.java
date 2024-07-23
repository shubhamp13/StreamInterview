package com.function.example;

import java.util.function.LongFunction;

public class LongFunctionDemo {
	public static void main(String[] args) {
		LongFunction<Long>l=i->i+10L;
		System.out.println("LongFunction interface apply method takes"
				+ "primitive long as an argument and returns generic");
		System.out.println("LongFunction: "+l.apply(20L));
		
	}

}
