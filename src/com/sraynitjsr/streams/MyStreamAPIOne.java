package com.sraynitjsr.streams;

import java.util.*;
import java.util.stream.*;

public class MyStreamAPIOne {
	public static void start() {
		System.out.println("Streams API Using Java");

		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 1, 2, -5, 1, 3, 4));

		System.out.println("\nOriginal List:");
		System.out.println(myList);

		System.out.println("\nPrinting using stream1:");
		Stream<Integer> stream1 = myList.stream();
		stream1.forEach(data -> System.out.print(data + " "));
		System.out.println();

		System.out.println("\nPrinting using stream2:");
		Stream<Integer> stream2 = myList.stream();
		stream2.forEach(System.out::print);
		System.out.println();

		System.out.println("\nOnly Even Numbers Are:");
		myList.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));
		System.out.println();

		System.out.println("\nOnly Odd Numbers Are:");
		myList.stream().filter(num -> num % 2 != 0).forEach(num -> System.out.print(num + " "));
		System.out.println();

		System.out.println("\nSum of Numbers:");
		System.out.println(myList.stream().reduce(0, (a, b) -> a + b));

		System.out.println("\nSum of Odd Numbers Only");
		System.out.println(myList.stream().filter(num -> num % 2 != 0).reduce(1, (a, b) -> a * b));
		
		System.out.println("\nProduct of Numbers:");
		System.out.println(myList.stream().reduce(1, (a, b) -> a * b));

		System.out.println("\nProduct of Even Numbers Only");
		System.out.println(myList.stream().filter(num -> num % 2 == 0).reduce(1, (a, b) -> a * b));
		
		System.out.println("\nSorting List Using Stream, Ascending");
		myList.stream().sorted().forEach(val -> System.out.print(val + " "));
		System.out.println();
		
		System.out.println("\nSorting List Using Stream, Descending");
		myList.stream().sorted(Collections.reverseOrder()).forEach(val -> System.out.print(val + " "));
		System.out.println();
	}
}




