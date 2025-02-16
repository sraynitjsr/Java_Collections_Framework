package com.sraynitjsr.designpatterns;

public class MyDesignPatterns {
	public static void start() {
		System.out.println("Design Patterns Using Java");

		System.out.println("\nSingleton Design Pattern");
		MySingleton.start();
		
		System.out.println("\nBuilder Design Pattern");
		MyBuilder.start();
	}
}
