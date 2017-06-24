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
	Numbers numbers = new Numbers(10);
	System.out.printf("Displaying an empty array of 10 integers:\n");
	numbers.display();

	// assign random values
	System.out.println("\nLoading array...");
	for (int i =0; i < 10; i++) {
	    numbers.setValue(i, (int) (Math.random() * 100));
         }	
	    
	// get the first and last values of the array
	System.out.println("\nFirst value of array: " + numbers.getValue(0));
	System.out.println("Last value of array: " + numbers.getValue(numbers.getLength() - 1));

	// show length and display array
	System.out.println("\nLength of array: " + numbers.getLength() + "\n");
	System.out.println("Displaying loaded array:");
	numbers.display();
    }
    
}
