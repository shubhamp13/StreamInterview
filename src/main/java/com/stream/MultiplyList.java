package com.stream;

import java.util.List;
import java.util.stream.Stream;

//Find square of each element of List
public class MultiplyList {

	public static void main(String[] args) {
		List<Integer>list=List.of(1,2,3,4,5,6,7,8,9,10);
		Stream<Integer>stream=list.stream();
		List<Integer>squareList=stream.map(i->i*i).toList();
		System.out.println(squareList);
	}
}
