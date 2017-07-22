/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.knapsack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author blake
 */
public class KnapsackDriver {

	private final static int KNAPSACK_MAX_WEIGHT = 20;
	private final static int ITEMS = 5;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// generate items to fill knapsack with
		int[] items = new int[ITEMS];
		Random rdm = new Random();
		for (int i = 0; i < ITEMS; i++) {
			items[i] = (rdm.nextInt(KNAPSACK_MAX_WEIGHT) + 1);
		}
		Arrays.sort(items);
		System.out.println(Arrays.toString(items));

		// create a new knapsack with our weight limit
		Knapsack knapsack = new Knapsack(KNAPSACK_MAX_WEIGHT);

		// check to see if any single item can fill the knapsack
		if (preFillCheck(items, knapsack)) {
			System.out.println("The following items can be added to the knapsack: [" + KNAPSACK_MAX_WEIGHT + "]");
			System.exit(0);
		}

		// fill knapsack
		ArrayList<Integer> itemList = getList(items);
		boolean isPossible = canFillKnapsack(itemList, knapsack.getMaxWeight());

		if (isPossible) {
			GetItemsByStack get = new GetItemsByStack(KNAPSACK_MAX_WEIGHT);
			get.populateSubset(items, 0, items.length);
		} else {
			System.out.println("No combination of items can be added to fill the knapsack.");
		}
	}

	public static boolean canFillKnapsack(final List<Integer> items, final int target) {
		return target == 0 || target > 0 && head(items) != null
				&& (canFillKnapsack(tail(items), target) || canFillKnapsack(tail(items), target - head(items)));
	}

	public static Integer head(final List<Integer> items) {
		return items == null || items.isEmpty() ? null : items.get(0);
	}

	public static List<Integer> tail(final List<Integer> items) {
		return items.size() < 2 ? null : items.subList(1, items.size());
	}

	// could return array index if we care
	public static boolean preFillCheck(int[] items, Knapsack knapsack) {
		for (int i : items) {
			if (i == KNAPSACK_MAX_WEIGHT) {
				knapsack.add(i);
				return true;
			}
		}
		return false;
	}

	public static int[] subArraySum(int[] items, int size, int target) {
		int curr_sum = items[0], start = 0, i;

		// Pick a starting point
		for (i = 1; i <= size; i++) {
			// If curr_sum exceeds the target, then remove the starting elements
			while (curr_sum > target && start < i - 1) {
				curr_sum = curr_sum - items[start];
				start++;
			}

			// If curr_sum becomes equal to target, then return true
			if (curr_sum == target) {
				int p = i - 1;
				return Arrays.copyOfRange(items, start, p+1);
			}

			// Add this element to curr_sum
			if (i < size) {
				curr_sum = curr_sum + items[i];
			}

		}
		System.out.println("No combination of items to fill knapsack found");
		return null;
	}

	public static ArrayList<Integer> getList(int[] items) {
		ArrayList<Integer> itemList = new ArrayList<>();
		for (int i : items) {
			itemList.add(i);
		}
		return itemList;
	}

}
