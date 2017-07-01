/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.lab4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author blake
 */
public class AssemblyLineTestClass {
	
	public AssemblyLineTestClass() {
	}

	AssemblyLine assemblyLine;

	@Before
	public void setUp() {
		assemblyLine = new AssemblyLine();
	}

	/**
	 * Test of insertProduct method, of class AssemblyLine.
	 */
	@Test
	public void testInsertProduct() {
		System.out.println("insertProduct");
		ManufacturedProduct p = new ManufacturedProduct(68);
		ManufacturedProduct q = new ManufacturedProduct(38);
		ManufacturedProduct r = new ManufacturedProduct(20);
		ManufacturedProduct s = new ManufacturedProduct(88);
		ManufacturedProduct t = new ManufacturedProduct(22);
		ManufacturedProduct u = new ManufacturedProduct(9999);
		assemblyLine.insertProduct(p);
		assemblyLine.insertProduct(q);
		assemblyLine.insertProduct(r);
		assemblyLine.insertProduct(s);
		assemblyLine.insertProduct(t);
		assemblyLine.printProducts();
		assertEquals(68, assemblyLine.insertProduct(u).getProductId());
	}

	/**
	 * Test of clearAssemblyLine method, of class AssemblyLine.
	 */
	@Test
	public void testClearAssemblyLine() {
		System.out.println("clearAssemblyLine");
		ManufacturedProduct q = new ManufacturedProduct(38);
		ManufacturedProduct r = new ManufacturedProduct(20);
		ManufacturedProduct s = new ManufacturedProduct(88);
		ManufacturedProduct t = new ManufacturedProduct(22);
		ManufacturedProduct u = new ManufacturedProduct(9999);
		assemblyLine.insertProduct(q);
		assemblyLine.insertProduct(r);
		assemblyLine.insertProduct(s);
		assemblyLine.insertProduct(t);
		assemblyLine.insertProduct(u);
		assemblyLine.printProducts();
		System.out.println("clearing AssemblyLine");
		ManufacturedProduct[] result = assemblyLine.clearAssemblyLine();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println("should be empty");
		assemblyLine.printProducts();
		assertTrue(assemblyLine.isEmpty());
		assertEquals(38, result[0].getProductId());
		assertEquals(20, result[1].getProductId());
		assertEquals(88, result[2].getProductId());
		assertEquals(22, result[3].getProductId());
		assertEquals(9999, result[4].getProductId());
	}
	
}
