package list;

import java.util.*;

public class MyArrayList {
    public static void start() {
        System.out.println("Inside ArrayList");
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1));
        myList.add(10);
        myList.add(20);
        myList.forEach(data -> System.out.println(data));
    }
}
