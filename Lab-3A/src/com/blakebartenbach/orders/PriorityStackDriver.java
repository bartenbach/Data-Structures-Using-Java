/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.orders;

/**
 *
 * @author blake
 */
public class PriorityStackDriver {

	public static void main(String[] args) {
		PriorityStack priorityStack = new PriorityStack(5);

		Order order1 = new Order("2GFX1", (byte)1);
		Order order2 = new Order("F8Y3E", (byte)2);
		Order order3 = new Order("N4U3X", (byte)3);
		Order order4 = new Order("N9S0L", (byte)3);
		Order order5 = new Order("K4SD9", (byte)2);

		// testing isEmpty() against empty stack
		System.out.println("Testing isEmpty()...");
		if (priorityStack.isEmpty()) {
			System.out.println("  > Success!\n");
		} else {
			System.out.println("  > Failure!\n");
		}

		// partially loading stack...
		priorityStack.push(order1);
		priorityStack.push(order2);
		priorityStack.push(order3);

		// testing peek() -- last order was N4U3X
		System.out.println("Testing peek function...");
		if (priorityStack.peek().getCode().equalsIgnoreCase("N4U3X")) {
			System.out.println("  > Success!\n");
		} else {
			System.out.println("  > Failure!\n");
		}

		// testing numberOfOrders() -- should be 3 with 2 null objects
		System.out.println("Testing numberOfOrders()...");
		if (priorityStack.numberOfOrders() == 3) {
			System.out.println("  > Success!\n");
		} else {
			System.out.println("  > Failure!\n");
		}

		// finish loading stack...
		priorityStack.push(order4);
		priorityStack.push(order5);

		// testing isFull() -- stack should be full
		System.out.println("Testing isFull()...");
		if (priorityStack.isFull()) {
			System.out.println("  > Success!\n");
		} else {
			System.out.println("  > Failure!\n");
		}

		// sorting the stack...
		System.out.println("Sorting stack by order priority...\n");
		priorityStack.prioritySort();
         
		// popping stack -- should be in order
		System.out.println("Popping orders off the stack...");
		for (int i = 0; i < priorityStack.numberOfOrders(); i ++) {
			System.out.println("  > " + priorityStack.pop().toString());
		}

	}
	
}
