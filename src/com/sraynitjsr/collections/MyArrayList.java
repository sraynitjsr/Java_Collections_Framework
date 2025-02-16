package com.sraynitjsr.collections;

import java.util.*;

public class MyArrayList {
    public static void start() {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 30, 2, 5, 4));

        System.out.print("\nCurrent List is => ");
        myList.forEach(val -> System.out.print(val + " "));
        
        System.out.println("\n\nArrayList Sorted in Ascending Order");
        Collections.sort(myList);
        myList.forEach(val -> System.out.print(val + " "));
        
        System.out.println("\n\nArrayList Sorted in Descending Order");
        Collections.sort(myList, Collections.reverseOrder());
        myList.forEach(val -> System.out.print(val + " "));
        
        System.out.println("\n\nAdding an element 6 at the end of the list");
        myList.add(6);
        myList.forEach(val -> System.out.print(val + " "));
        
        System.out.println("\n\nAdding element 10 at index 2");
        myList.add(2, 10);
        myList.forEach(val -> System.out.print(val + " "));
        
        System.out.println("\n\nRemoving element 5 from the list");
        myList.remove(5);
        myList.forEach(val -> System.out.print(val + " "));
        
        System.out.println("\n\nRemoving element at index 3");
        myList.remove(Integer.valueOf(3));
        myList.forEach(val -> System.out.print(val + " "));
        
        System.out.println("\nElement at index 1 is " + myList.get(1));
        
        System.out.println("\nSetting element at index 1 to 15");
        myList.set(1, 15);
        myList.forEach(val -> System.out.print(val + " "));
        
        System.out.println("\n\nDoes the list contain 15? " + myList.contains(15));
        
        System.out.println("\nSize of the ArrayList: " + myList.size());
        
        System.out.println("\nClearing all elements from the list");
        myList.clear();
        System.out.println("List after clearing: " + myList);

        myList.addAll(Arrays.asList(8, 9, 12, 7, 6));

        System.out.println("\nIs the list empty? " + myList.isEmpty());
        
        System.out.println("\nIterating through the list using an iterator:");
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
        System.out.println("\n\nIterating through the list using for-each loop:");
        for (Integer num : myList) {
            System.out.print(num + " ");
        }
        
        Integer[] array = new Integer[myList.size()];
        myList.toArray(array);
        System.out.println("\n\nArray converted from ArrayList: " + Arrays.toString(array));        
    }
}
