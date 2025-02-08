package com.sraynitjsr.strings;

public class MyStrings {

	public static void usingString() {
		String myString = "BinarySearch";

		System.out.println("Length of String: " + myString.length());
		System.out.println("Substring (3, 7): " + myString.substring(3, 7));
		System.out.println("Index of 'S': " + myString.indexOf('S'));
		System.out.println("Does string contain 'Search'? " + myString.contains("Search"));
		System.out.println("Starts with 'Bin': " + myString.startsWith("Bin"));
		System.out.println("Ends with 'Search': " + myString.endsWith("Search"));
		System.out.println("Replace 'Binary' with 'Quick': " + myString.replace("Binary", "Quick"));
		System.out.println("String split: " + String.join(", ", myString.split("S")));
		System.out.println("String after trim: " + "   Hello World   ".trim());
		System.out.println("String in uppercase: " + myString.toUpperCase());
		System.out.println("String in lowercase: " + myString.toLowerCase());
		System.out.println("Concatenated String: " + myString.concat(" Algorithm"));
	}

	public static void usingStringBuffer() {
		StringBuffer myBufferString = new StringBuffer("BinarySearch");

		System.out.println("Initial StringBuffer: " + myBufferString);

		System.out.println("Length of StringBuffer: " + myBufferString.length());
		System.out.println("Substring (3, 7): " + myBufferString.substring(3, 7));
		System.out.println("Index of 'S': " + myBufferString.indexOf("S"));
		System.out.println("Does StringBuffer contain 'Search'? " + (myBufferString.indexOf("Search") != -1));
		System.out.println("Starts with 'Bin': " + myBufferString.toString().startsWith("Bin"));
		System.out.println("Ends with 'Search': " + myBufferString.toString().endsWith("Search"));
		System.out.println("Replace 'Binary' with 'Quick': " + myBufferString.toString().replace("Binary", "Quick"));
		System.out.println("StringBuffer split: " + String.join(", ", myBufferString.toString().split("S")));
		System.out.println("StringBuffer after trim: " + new StringBuffer("   Hello World   ").toString().trim());
		System.out.println("StringBuffer in uppercase: " + myBufferString.toString().toUpperCase());
		System.out.println("StringBuffer in lowercase: " + myBufferString.toString().toLowerCase());
		System.out.println("Concatenated StringBuffer: " + myBufferString.append(" Algorithm"));

		myBufferString.append(" Programming");
		System.out.println("After append: " + myBufferString);
		myBufferString.insert(7, " Advanced");
		System.out.println("After insert: " + myBufferString);
		myBufferString.delete(7, 16);
		System.out.println("After delete: " + myBufferString);
		myBufferString.replace(0, 7, "Java");
		System.out.println("After replace: " + myBufferString);
		System.out.println("Capacity of StringBuffer: " + myBufferString.capacity());
		myBufferString.reverse();
		System.out.println("Reversed StringBuffer: " + myBufferString);
		myBufferString.setLength(10);
		System.out.println("After set length: " + myBufferString);
		myBufferString.append(" for DSA");
		System.out.println("After append with DSA: " + myBufferString);
	}

	public static void start() {
		System.out.println("String in Java");
		usingString();
		System.out.println();
		usingStringBuffer();
	}
}
