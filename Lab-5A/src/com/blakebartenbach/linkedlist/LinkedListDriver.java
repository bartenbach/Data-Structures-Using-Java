/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.linkedlist;

import java.util.Arrays;

/**
 *
 * @author blake
 */
public class LinkedListDriver {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// create new list
		System.out.println("Creating new list:");
		LinkList theList = new LinkList(new long[]{22,44,66,889,22});
		theList.displayList();

		// testing insertFirst
		System.out.println("\nTesting insertFirst (inserting 76 at front of list):");
		theList.insertFirst(76);
		theList.displayList();

		// search the list for a value not present and value present
		System.out.println("\nTesting search:");
		theList.displayList();
		System.out.println("Should be false (searching for 234): " + theList.search(234));
		System.out.println("Should be true (searching for 889): " + theList.search(889));

		// test numberOfTimes
		System.out.println("\nTesting number of times");
		theList.displayList();
		System.out.println("Number of times 66 is present: (1) | " + theList.numberOfValues(66));
		System.out.println("Number of times 22 is present: (2) | " + theList.numberOfValues(22));
		System.out.println("Number of times 98 is present: (0) | " + theList.numberOfValues(98));

		// test replace
		System.out.println("\nTesting replace...");
		theList.displayList();
		System.out.println("Replacing values of 22 with 555 (2 values)");
		theList.replace(22L, 555L);
		theList.displayList();

	     // test deleteFirst
		System.out.println("\nTesting deleteFirst (should delete first 76 from list)");
		theList.deleteFirst();
		theList.displayList();

		// test zero
		System.out.println("\nTesting zero...");
		System.out.println("Replacing all values in list with zero");
		theList.zero();
		theList.displayList();

		// test length
		System.out.println("\nTesting length");
		System.out.println("Length of List: " + theList.length());
		
		// test getArray
		System.out.println("\nTesting getArray");
		long[] longArray = theList.getArray();
		System.out.println(Arrays.toString(longArray));

		// test isEmpty with non-empty List
		System.out.println("\nTesting isEmpty with non-empty list");
		System.out.println(theList.isEmpty());

		// clear list
		System.out.println("\nDeleting all elements from list");
		while (!theList.isEmpty()) {
			Link aLink = theList.deleteFirst();
			System.out.print("Deleted ");
			aLink.displayLink();
			System.out.println("");
		}
		System.out.println("Displaying empty list: ");
		theList.displayList();

          
		// test isEmpty with empty list
		System.out.println("\nTesting isEmpty with empty list");
		System.out.println(theList.isEmpty());
	}
	
}
