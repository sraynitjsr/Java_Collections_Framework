package com.sraynitjsr.streams;

import java.util.*;
import java.util.stream.*;

public class MyStreamAPITwo {
	public static void start() {
		System.out.println("Streams API Using Java HashMap");

		HashMap<String, Integer> myHashMap = new HashMap<>();

		myHashMap.put("Sachin", 10);
		myHashMap.put("Virat", 18);
		myHashMap.put("Dhoni", 07);
		myHashMap.put("Rohit", 45);
		myHashMap.put("Ganguly", 99);
		myHashMap.put("Bumrah", 93);

		System.out.println("\nOriginal Map:");
		myHashMap.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println();

		System.out.println("\nOnly Map Keys:");
		myHashMap.keySet().stream().forEach(k -> System.out.print(k + " "));
		System.out.println();
		
		System.out.println("\nOnly Map Values:");
		myHashMap.values().stream().forEach(v -> System.out.print(v + " "));
		System.out.println();
	}
}
