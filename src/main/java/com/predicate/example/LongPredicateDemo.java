package com.predicate.example;

import java.util.function.LongPredicate;

public class LongPredicateDemo {
	public static void main(String[] args) {
		LongPredicate predicate=l->l%2==0;
		System.out.println("Long Predicate: "+predicate.test(13));
		System.out.println("Long Predicate: "+predicate.test(10));
		
	}
}
