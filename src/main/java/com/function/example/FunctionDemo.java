package com.function.example;

import java.util.function.Function;

public class FunctionDemo 
{
	public static void main(String[] args) {
		Function<Integer, Integer>f=i->i*i;
		System.out.println("Function Interface: "+f.apply(25));
		System.out.println("Function Interface: "+f.apply(15));
	}
}
