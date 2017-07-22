/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.midterm;

/**
 *
 * @author blake
 */
public class MidtermStack {

	private int maxSize;
   	private long[] stackArray;
   	private int top;

    public MidtermStack(int size) {
		maxSize = size;
         stackArray = new long[size];
         top = -1;
    }

    public void push(long j) {
		stackArray[++top] = j;
    }

    public long pop() {
		return stackArray[top--];
    }

    public long peek() {
		return stackArray[top];
    }

    public boolean isEmpty() {
		return (top == -1);
    }

    public boolean isFull() {
		return (top == maxSize-1);
    }

	public int numberOflongs() {
		int objects = 0;
		for (long x : stackArray) {
				objects++;
		}
		return objects;
	}
}