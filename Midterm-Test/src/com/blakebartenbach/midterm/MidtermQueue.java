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
public class MidtermQueue {


	private long[] data;


	public MidtermQueue(long[] data) {
		this.data = data;
	}


	// starting from the end of the array - 1, shift objects upwards one position
	// the highest object will be removed from queue and returned (or null)
	// then set the first element to the new long
	public long insert(long l) {
		long lastLong = this.data[this.data.length-1];
		for (int i = data.length - 2; i > -1; i--)	 {
			this.data[i+1] = this.data[i];
		}
		this.data[0] = l;
		return lastLong;
	}

	// order is preserved in array - iterate through normally
	public long[] clearQueue() {
		int items = 0;
		for (long l : this.data) {
				items++;
		}
		long[] lastLongs = new long[items];
		for (int i = 0; i < items; i++) {
			lastLongs[i] = data[data.length - i - 1];
			this.data[data.length - 1 - i] = 0L;
		}
		return lastLongs;
	}

	public void printLongs() {
		System.out.println(Arrays.toString(data));
	}

	public boolean isEmpty() {
		for (long l : this.data) {
			if (l != 0) {
				return false;
			}
		}
		return true;
	}

}
