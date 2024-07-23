package com.consumer.example;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
	public static void main(String[] args) {
		 BiConsumer<Integer,Long>biConsumer=(a,b)->
		 {
			 System.out.println("Integer "+a);
			 System.out.println("Double: "+b);
		 };
		 biConsumer.accept(10, 20L);
		 
	}
}
