package com.consumer.example;

import java.util.function.LongConsumer;

public class LongConsumerDemo 
{
	public static void main(String[] args) {
		LongConsumer consumer=a->System.out.println("Long Consumer:"+a);
		long l=200L;
		consumer.accept(l);
	}
}
