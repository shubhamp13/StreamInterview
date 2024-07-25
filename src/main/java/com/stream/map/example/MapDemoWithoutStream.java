package com.stream.map.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class  MapDemoWithoutStream {
	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap();
		map.put(1,"One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		Set<Entry<Integer, String>> entry=map.entrySet();
		List<Entry<Integer,String>>list=new ArrayList(entry);
		Collections.sort(list,new MyComparator());
		System.out.println(list);
		
	}

}
class MyComparator implements Comparator<Entry<Integer,String>>
{

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
	 
//		return o2.getKey()-o1.getKey();
		return o2.getValue().compareTo(o1.getValue());
	}
	
}
