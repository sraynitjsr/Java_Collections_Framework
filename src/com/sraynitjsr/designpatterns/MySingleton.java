package com.sraynitjsr.designpatterns;

class Singleton {
	private static volatile Singleton singleton = null;

	private Singleton() {
	}

	public static Singleton getSingletonInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}

public class MySingleton {
	public static void start() {
		Singleton obj1 = Singleton.getSingletonInstance();
		Singleton obj2 = Singleton.getSingletonInstance();

		if (obj1.equals(obj2)) {
			System.out.println("Both obj1 and obj2 are the same object");
		} else {
			System.out.println("obj1 and obj2 are different objects");
		}
	}
}
