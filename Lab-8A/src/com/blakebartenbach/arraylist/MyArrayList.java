/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.arraylist;

/**
 *
 * @author blake
 */
public class MyArrayList {


	private String[] array;


	public MyArrayList(int length) {
		this.array = new String[length];
	}

	public void add(String x) {
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] == null) {
				this.array[i] = x;
				return;
			}
		}
		String[] newarray = new String[this.array.length * 2];
		System.arraycopy(this.array, 0, newarray, 0, this.array.length);
		this.array = newarray;
		add(x);
	}

	public String get(int index) {
		if (index <= this.array.length) {
			return this.array[index];
		}
		return null;
	}

	public int size() {
		return this.array.length;
	}
	
	public int search(String x) {
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] != null) {
				if (this.array[i].equalsIgnoreCase(x)) {
					return i;
				}
			}
		}
		return -1;
	}

	public int searchFromEnd(String x) {
		for (int i = this.array.length - 1; i > 0; i--) {
			if (this.array[i] != null) {
				if (this.array[i].equalsIgnoreCase(x)) {
					return i;
				}
			}
		}
		return -1;
	}

	public int findMatches(String x) {
		int matches = 0;
		for (String y : this.array) {
			if (y != null) {
				if (y.equalsIgnoreCase(x)) {
					matches++;
				}
			}
		}
		return matches;
	}

	public int[] findMatchesArray(String x) {
		int[] matches = new int[findMatches(x)];
		int counter = 0;
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] != null) {
				if (this.array[i].equalsIgnoreCase(x)) {
					matches[counter] = i;
					counter++;
				}
			}
		}	
		return matches;
	}

}
