package com.sraynitjsr.arrays;

public class MyArrays {

	public static int[] fillArray1D(int[] myArray) {
		for (int i = 0; i < 5; i++) {
			myArray[i] = i * 10;
		}
		return myArray;
	}

	public static int[][] fillArray2D(int[][] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				myArray[i][j] = (i + 1) * (j + 1);
			}
		}
		return myArray;
	}

	public static void start() {
		System.out.println("Arrays in Java");

		int count = 5;
		int[] my1DArrayOne = new int[count];
		for (int i = 0; i < count; i++) {
			my1DArrayOne[i] = i * i;
		}

		int[] my1DArrayTwo = { 1, 2, 4, 5, 3 };
		fillArray1D(my1DArrayTwo);

		System.out.print("Array One: ");
		for (int i = 0; i < my1DArrayOne.length; i++) {
			System.out.print(my1DArrayOne[i] + " ");
		}

		System.out.println();

		System.out.print("Array Two: ");
		for (int i = 0; i < my1DArrayTwo.length; i++) {
			System.out.print(my1DArrayTwo[i] + " ");
		}

		System.out.println();

		int[][] my2DArray = new int[3][3];
		fillArray2D(my2DArray);

		System.out.println("2D Array:");
		for (int i = 0; i < my2DArray.length; i++) {
			for (int j = 0; j < my2DArray[i].length; j++) {
				System.out.print(my2DArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
