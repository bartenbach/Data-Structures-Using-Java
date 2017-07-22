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
public class ManyStructures {

	private long[] data;

	public ManyStructures(int length) {
		this.data = new long[length];	
	}

	public long[] getActualArray() {
		return this.data;
	}

	public void setArray(long[] data) {
		this.data = data;
	}

	public long[] getArray() {
		return Arrays.copyOf(this.data, this.data.length);
	}
		
	public MidtermLinkedList getLinkedList() {
		return new MidtermLinkedList(this.data);
	}

	public MidtermStack getStack() {
		MidtermStack stack = new MidtermStack(data.length);
		for (long l : data) {
			stack.push(l);
		}
		return stack;
	}

	public MidtermQueue getQueue() {
		return new MidtermQueue(Arrays.copyOf(data, data.length));
	}
}
