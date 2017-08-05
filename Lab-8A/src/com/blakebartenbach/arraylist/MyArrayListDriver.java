/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.arraylist;

import java.util.Arrays;

/**
 *
 * @author blake
 */
public class MyArrayListDriver {
	

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(5);
		list.add("Alpha");
		list.add("Beta");
		list.add("Gamma");
		list.add("Delta");
		list.add("Epsilon");
		list.add("Alpha");
		System.out.println(list.size());	
		System.out.println(list.search("Alpha"));
		System.out.println(list.searchFromEnd("Alpha"));
		System.out.println(list.findMatches("Alpha"));
		int[] arr = list.findMatchesArray("Alpha");
		System.out.println(Arrays.toString(arr));
		System.out.println(list.get(2));
	}


}
