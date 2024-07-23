package com.consumer.example;

import java.util.function.DoubleConsumer;

public class DoubleConsumerDemo {
	public static void main(String[] args) {
		DoubleConsumer consumer=a->System.out.println("Double Consumer "+a);
		double d=3.14d;
		consumer.accept(d);
	}
  
}
