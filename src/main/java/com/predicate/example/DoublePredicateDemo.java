package com.predicate.example;

import java.util.function.DoublePredicate;

public class DoublePredicateDemo {
	public static void main(String[] args) {
		DoublePredicate predicate=d->d%2==0;
		System.out.println("Double Predicate:"+predicate.test(10.00));
		System.out.println("Double Predicate:"+predicate.test(13.00));
	}
}
