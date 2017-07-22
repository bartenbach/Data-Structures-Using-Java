/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.knapsack;

import java.util.Stack;

public class GetItemsByStack {

	public int target;
	private int sumInStack = 0;
	private final Stack<Integer> stack = new Stack<>();

	public GetItemsByStack(int target) {
		this.target = target;
	}

	public void populateSubset(int[] data, int fromIndex, int endIndex) {
		if (sumInStack == target) {
			print(stack);
			System.exit(0);
			return;
		}

		for (int currentIndex = fromIndex; currentIndex < endIndex; currentIndex++) {
			if (sumInStack + data[currentIndex] <= target) {
				stack.push(data[currentIndex]);
				sumInStack += data[currentIndex];
				populateSubset(data, currentIndex + 1, endIndex);
				sumInStack -= stack.pop();
			}
		}
	}

	private void print(Stack<Integer> stack) {
		System.out.println("The following items can be added to the knapsack: " + stack.toString());
	}
}
