package com.supplier.example;

import java.util.function.Supplier;

public class SupplierDemo 
{
	public static void main(String[] args) {
		Supplier<String>supply=()->new String("Shubham");
		String name=supply.get();
		System.out.println(name);
	}
}
