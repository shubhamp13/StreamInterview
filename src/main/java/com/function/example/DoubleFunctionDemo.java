package com.function.example;

import java.util.function.DoubleFunction;

public class DoubleFunctionDemo 
{
	public static void main(String[] args) {
		DoubleFunction<Double>fun=d->d*d*Math.PI;
		System.out.println("DpubleFunction interface apply method takes primitive double as an argument and returns generic type");
		System.out.println("DoubleFunction: "+fun.apply(3.00));
	}
}
