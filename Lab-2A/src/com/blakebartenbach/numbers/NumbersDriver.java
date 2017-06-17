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

public class NumbersDriver {
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
		// instantiate object
		System.out.println("Creating and randomizing new numbers array...");
		Numbers numbers = new Numbers(10);
		numbers.randomize();
		numbers.display();

		// bubble sort
		System.out.println("\nBubble sorting array...");
		numbers.bubbleSort();
		numbers.display();

		// randomize
		System.out.println("\nRandomizing array...");
		numbers.randomize();
		numbers.display();

		// selection sort
		System.out.println("\nSelection sorting array...");
		numbers.selectionSort();
		numbers.display();

		// randomize
		System.out.println("\nRandomizing array...");
		numbers.randomize();
		numbers.display();

		// insertion sorting
		System.out.println("\nInsertion sorting array...");
		numbers.insertionSort();
		numbers.display();
    }
    
}
