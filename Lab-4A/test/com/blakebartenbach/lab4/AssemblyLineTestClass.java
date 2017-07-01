/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.lab4;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author blake
 */
public class AssemblyLineTestClass {
	
	public AssemblyLineTestClass() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
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
		ManufacturedProduct s = new ManufacturedProduct(38);
		ManufacturedProduct t = new ManufacturedProduct(22);
		ManufacturedProduct u = new ManufacturedProduct(9999);
		AssemblyLine instance = new AssemblyLine();
		instance.insertProduct(p);
		instance.printProducts();
		instance.insertProduct(q);
		instance.printProducts();
		instance.insertProduct(r);
		instance.printProducts();
		instance.insertProduct(s);
		instance.printProducts();
		instance.insertProduct(t);
		instance.printProducts();
		assertEquals(68, instance.insertProduct(u).getProductId());
		
	}
	
}
