package com.consumer.example;

import java.util.function.IntConsumer;

public class IntConsumerDemo 
{
	public static void main(String[] args) {
		IntConsumer consumer=a->System.out.println("Primitive Consumer "+a);
		consumer.accept(100);
	}
}
