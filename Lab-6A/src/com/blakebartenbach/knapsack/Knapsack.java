/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.knapsack;

import java.util.ArrayList;

/**
 *
 * @author blake
 */
public class Knapsack {

	private final ArrayList<Integer> knapsack;	
	private final int weightLimit;
	private int currentWeight = 0;

	public Knapsack(int weightLimit) {
		this.knapsack = new ArrayList<>();
		this.weightLimit = weightLimit;
	}

	public boolean canHold(int item) {
		if (item > weightLimit) {
			return false;
		} else if ((item + currentWeight) > weightLimit) {
			return false;
		}
		return true;
	}

	public void add(int item) {
		knapsack.add(item);
		currentWeight+=item;
	}

	public int getWeight() {
		int weight = 0;
		for (int i : this.knapsack) {
			weight+=i;
		}
		return weight;
	}

	public int getMaxWeight() {
		return this.weightLimit;
	}

} 
