package com.sraynitjsr.collections;

import java.util.*;

public class MyArrayList {
	public static void start() {
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 2, 5, 4));
		
		System.out.print("Current List is => ");
		myList.forEach(val -> System.out.print(val + " "));
	}
}
