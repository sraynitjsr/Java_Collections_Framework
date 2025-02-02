package com.sraynitjsr.algorithms;

public class MySlidingWindowOne {
	public static void start() {
		System.out.println("Maximum Consecutive Ones by Flipping Atmost K Zeros");

		int[] myArray = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };

		int K = 2;

		int start = 0, zerosFlipped = 0, maxLength = 0;

		for (int end = 0; end < myArray.length; end++) {
			if (myArray[end] == 0) {
				zerosFlipped++;
			}
			while(zerosFlipped > K) {
				if (myArray[start] == 0) {
					zerosFlipped--;
				}
				start++;
			}
			maxLength = Math.max(maxLength, end - start + 1);
		}
		System.out.println("Maximum Such 1's Window Length is => " + maxLength);
	}
}
