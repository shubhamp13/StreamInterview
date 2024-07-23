package com.predicate.example;

import java.util.function.IntPredicate;

public class IntPredicateDemo {
	public static void main(String[] args) {
		IntPredicate predicate=i->i%2==0;
		System.out.println("IntPredicate: "+predicate.test(10));
		System.out.println("IntPredicate: "+predicate.test(25));
		
	}

}
