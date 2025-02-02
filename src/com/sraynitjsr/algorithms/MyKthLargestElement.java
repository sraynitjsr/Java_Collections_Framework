package com.sraynitjsr.algorithms;

import java.util.PriorityQueue;

public class MyKthLargestElement {
	public static void start() {
		int myArray[] = { 3, 2, 1, 5, 6, 4 };
		int K = 2;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (Integer n : myArray) {
			pq.add(n);
			if (pq.size() > K) {
				pq.poll();
			}
		}
		System.out.println(K + " No. Largest Element is " + pq.peek());
	}
}
