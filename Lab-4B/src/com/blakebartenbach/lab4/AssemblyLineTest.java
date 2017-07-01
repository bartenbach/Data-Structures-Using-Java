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
public class AssemblyLineTest {
	

	public static void main(String[] args) {
		AssemblyLine assemblyLine = new AssemblyLine();

		for (int i = 1; i < 21; i++) {
			ManufacturedProduct p = new ManufacturedProduct(i);
			p.inspection();
			System.out.println("Returned Object: " + assemblyLine.insertProduct(p));
		}

		// LAB 4B
		ManufacturedProduct[] lastProducts = assemblyLine.clearAssemblyLine();
		if (assemblyLine.isEmpty()) {
			System.out.println("\n\nASSEMBLY LINE CLEARED");
		} else {
			System.out.println("\n\nERROR: Products remain on assembly line!");
		}

		System.out.println("\nFinal Products: ");
		for (int i = 0; i < lastProducts.length; i++) {
			System.out.println(lastProducts[i]);
		}
	}
}
