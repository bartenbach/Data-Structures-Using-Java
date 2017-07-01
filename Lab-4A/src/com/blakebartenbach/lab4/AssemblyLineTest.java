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
	}
}
