/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.lab4;

/**
 *
 * @author blake
 */
public class AssemblyLine {


	private final ManufacturedProduct[] products = new ManufacturedProduct[5];


	// starting from the end of the array - 1, shift objects upwards one position
	// the highest object will be removed from assembly line and returned (or null)
	// then set the first element to the new product
	public ManufacturedProduct insertProduct(ManufacturedProduct p) {
		System.out.println("");
		ManufacturedProduct lastProduct = this.products[this.products.length-1];
		for (int i = products.length - 2; i > -1; i--)	 {
			this.products[i+1] = this.products[i];
		}
		this.products[0] = p;
		return lastProduct;
	}

	// order is preserved in array - iterate through normally
	public ManufacturedProduct[] clearAssemblyLine() {
		int items = 0;
		for (ManufacturedProduct p : this.products) {
			if (p != null) {
				items++;
			}
		}
		ManufacturedProduct[] lastProducts = new ManufacturedProduct[items];
		for (int i = 0; i < items; i++) {
			lastProducts[i] = products[products.length - i - 1];
			products[products.length - 1 - i] = null;
		}
		return lastProducts;
	}

	public void printProducts() {
		for (ManufacturedProduct p :products) {
			if (p != null) {
				System.out.println(p.toString());
			} else {
				System.out.println("Null Product");
			}
		}
	}

	public boolean isEmpty() {
		for (ManufacturedProduct p : this.products) {
			if (p != null) {
				return false;
			}
		}
		return true;
	}

}
