package com.sraynitjsr.loops;

public class MyLoops {
	public static void start() {
		System.out.println("Basic Loops Using Java");
		for (int i = 1; i <= 5; i++) {
			System.out.println("For loop iteration: " + i);
		}

		int j = 1;
		while (j <= 5) {
			System.out.println("While loop iteration: " + j);
			j++;
		}

		int k = 1;
		do {
			System.out.println("Do-while loop iteration: " + k);
			k++;
		} while (k <= 5);

		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int num : numbers) {
			System.out.println("For-each loop element: " + num);
		}
	}
}
