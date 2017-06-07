/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.numbers;

/**
 *
 * @author blake
 */

public class Numbers {

         private int[] numbers;

	public Numbers(int length) {
		this.numbers = new int[length];
	}
	
	public void display() {
		for (int number : this.numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}	
	
	public void setValue(int index, int value) {
		try {
			if (value < 0) {
				this.numbers[index] = 0;
			} else if (value > 100) {
				this.numbers[index] = 100;
			} else {
				this.numbers[index] = value;
			}
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Index '" + index + "'out of bounds");	
		}
	}

	public int getValue(int index) {
		try {
			return this.numbers[index];
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Index '" + index + "' out of bounds");
		}
		return -1;
	}

	public int getLength() {
		return this.numbers.length;
	}
}
