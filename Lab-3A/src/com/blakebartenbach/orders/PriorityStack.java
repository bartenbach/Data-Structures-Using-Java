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
public class PriorityStack {

	private int maxSize;
   	private Order[] stackArray;
   	private int top;

    public PriorityStack(int s) {
		maxSize = s;
         stackArray = new Order[maxSize];
         top = -1;
    }

    public void push(Order j) {
		stackArray[++top] = j;
    }

    public Order pop() {
		return stackArray[top--];
    }

    public Order peek() {
		return stackArray[top];
    }

    public boolean isEmpty() {
		return (top == -1);
    }

    public boolean isFull() {
		return (top == maxSize-1);
    }

	public int numberOfOrders() {
		int objects = 0;
		for (Order x : stackArray) {
			if (x != null) {
				objects++;
			}
		}
		return objects;
	}

    public void prioritySort() {
		for (int i = 0; i < this.stackArray.length; i++) {
			for (int j = 1; j < this.stackArray.length; j++) {
				if (this.stackArray[j - 1].getPriority() < this.stackArray[j].getPriority()) {
					Order temp = this.stackArray[j];
					this.stackArray[j] = this.stackArray[j - 1];
					this.stackArray[j - 1] = temp;
				}
			}
		}	
	}

}