package com.consumer.example;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerDemo 
{
	public static void main(String[] args) {
		Consumer<Integer>consumer=i->System.out.println("Printing:  "+i);
		consumer.accept(100);
		consumer.accept(200);
		consumer.accept(300);
		consumer.accept(400);
		BiConsumer<Integer, Double>biConsumer=(a,b)->{
			System.out.println("Integer Value Is "+a);
			System.out.println("Double Value Is "+b);
		};
		biConsumer.accept(10,55.00);
	 
	}
}
