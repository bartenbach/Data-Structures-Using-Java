/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.midterm;

import java.util.Arrays;

/**
 *
 * @author blake
 */
public class ManyStructuresDriver {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Creating long array...");
		long[] data = { 100L, 200L, 300L, 400L, 500L};

		ManyStructures manyStructures = new ManyStructures(5);
		manyStructures.setArray(data);

		// this is a copy
		long[] copy  = manyStructures.getArray();
		System.out.println("Original data is: " + Arrays.toString(copy));

		// Queue test
		System.out.println("\n\nQUEUE TEST");
		MidtermQueue queue = manyStructures.getQueue();
		System.out.println("Printing queue:");
		queue.printLongs();
		System.out.println("Adding 999 to queue...");
		long l = queue.insert(999L);
		System.out.println("Element removed from queue: " + l);
		System.out.println("Printing queue:");
		queue.printLongs();
		System.out.println("Queue is empty?: " + queue.isEmpty());
		System.out.println("Emptying queue...");
		long[] clearedItems = queue.clearQueue();
		System.out.println("Printing queue...");
		queue.printLongs();
		System.out.println("Queue is empty?: " + queue.isEmpty());
		System.out.println("Items removed from queue: " + Arrays.toString(clearedItems));

		// Stack test
		System.out.println("\n\nSTACK TEST");
		MidtermStack stack = manyStructures.getStack();
		System.out.println("Peek first value:" + stack.peek());
		System.out.println("Is stack empty?: " + stack.isEmpty());
		System.out.println("Is stack full?: " + stack.isFull());
		System.out.println("Pop long off stack: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pushing 999 onto stack...");
		stack.push(999L);
		System.out.println("Peek: " + stack.peek());

		// LinkedList test
		System.out.println("\n\nLINKEDLIST TEST");
		MidtermLinkedList linkedList = manyStructures.getLinkedList();
		System.out.println("Displaying List:");
		linkedList.displayList();
		System.out.println("Inserting 999 at beginning: ");
		linkedList.insertFirst(999L);
		linkedList.displayList();
		System.out.println("Deleting first 999:");
		linkedList.deleteFirst();
		linkedList.displayList();
		System.out.println("Replacing 300 with 999:");
		linkedList.replace(300, 999);
		linkedList.displayList();

		// Test we still have data
		System.out.println("\n\nEnsuring original data is untouched: " + Arrays.toString(manyStructures.getArray()));
	}
	
}
