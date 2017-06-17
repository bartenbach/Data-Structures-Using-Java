/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.numbers;

import java.util.Arrays;
import java.util.Random;

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
		System.out.println(Arrays.toString(this.numbers));
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

	public void randomize() {
		Random rdm = new Random();
		for (int i = 0; i < numbers.length; i++) {
			this.numbers[i] = rdm.nextInt(101);
		}
	}

	public void bubbleSort() {
		for (int i = 0; i < this.numbers.length; i++) {
			for (int j = 1; j < this.numbers.length; j++) {
				if (this.numbers[j - 1] > this.numbers[j]) {
					int temp = this.numbers[j];
					this.numbers[j] = this.numbers[j - 1];
					this.numbers[j - 1] = temp;
				}
			}
		}
	}

	public void selectionSort() {
		for (int i = 0; i < this.numbers.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < this.numbers.length; j++) {
				if (this.numbers[j] < this.numbers[index]) {
					index = j;
				}
			}
			int temp = this.numbers[index];
			this.numbers[index] = this.numbers[i];
			this.numbers[i] = temp;
		}
	}

	public void insertionSort() {
		int temp;
		for (int i = 1; i < this.numbers.length; i++) {
			for (int j = i; j > 0; j--) {
				if (this.numbers[j] <this.numbers[j-1]) {
					temp = this.numbers[j];
					this.numbers[j] = this.numbers[j-1];
					this.numbers[j-1] = temp;
				}
			}
		}
	}
	
	
}
