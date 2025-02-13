package com.sraynitjsr.streams;

import java.util.*;
import java.util.stream.*;

public class MyStreamAPIOne {
	public static void start() {
		System.out.println("Streams API Using Java");

		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 1, 2, -5, 1, 3, 4));
		
		System.out.println(myList);
		
		Stream<Integer> stream1 = myList.stream();
		
		stream1.forEach(data -> System.out.print(data + " "));
		System.out.println();
		
		Stream<Integer> stream2 = myList.stream();
		stream2.forEach(System.out::print);
		System.out.println();
	}
}
