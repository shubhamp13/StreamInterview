package com.stream.map.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapDemoWithStream {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(1, "January");
		map.put(2, "February");
		map.put(3, "March");
		map.put(4, "April");
		map.put(5, "May");
		map.put(6, "June");
		map.put(7, "July");
		map.put(8, "August");
		map.put(9, "September");
		map.put(10, "October");
		map.put(11, "November");
		map.put(12, "December");
		
		System.out.println("Sorted by keys");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("Descending Sorted By Keys");
		map.entrySet().stream().sorted((e1,e2)->e2.getKey().compareTo(e1.getKey())).forEach(System.out::println);
		
		
		System.out.println("\n\nAnother way to descending order");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
		System.out.println("\n\nValues in Ascending order");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("\n\nValues in Descending order");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
	}
}
