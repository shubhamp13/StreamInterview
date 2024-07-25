package com.reference.method;

import java.util.function.BiConsumer;
 

public class CalculatorDemo 
{
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		BiConsumer<Integer, Integer>bi=calculator::add;
		bi.accept(10, 20);
		
		BiConsumer<Integer,Integer>bi2=Calculator::multiply;
		bi2.accept(15, 20);
	}
}
