package com.function.example;

 
import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {
	public static void main(String[] args) {
		ToIntFunction<Integer>fun=i->i*i*i;
		int result=fun.applyAsInt(10);
		System.out.println("ToIntFunction interface applyAsInt() method takes generic as argument and return int primitive value");
		System.out.println("ToIntFunction: "+result);
		
	}

}
