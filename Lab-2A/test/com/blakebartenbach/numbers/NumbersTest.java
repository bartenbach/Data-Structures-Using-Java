/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.numbers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blake
 */
public class NumbersTest {


	private Numbers instance;
	
	public NumbersTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
		this.instance = new Numbers(10);
	}
	
	@After
	public void tearDown() {
		this.instance = null;
	}

	/**
	 * Test of setValue method, of class Numbers.
	 */
	@Test
	public void testSetValue() {
		System.out.println("setValue");
		instance.setValue(5, 326);
		instance.setValue(6, -50);
		instance.setValue(7, 59);
		assertEquals(100,instance.getValue(5));
		assertEquals(0, instance.getValue(6));
		assertEquals(59, instance.getValue(7));
	}

	/**
	 * Test of getValue method, of class Numbers.
	 */
	@Test
	public void testGetValue() {
		System.out.println("getValue");
		assertEquals(-1, instance.getValue(68));
		instance.setValue(3, 25);
		assertEquals(25, instance.getValue(3));
	}

	/**
	 * Test of getLength method, of class Numbers.
	 */
	@Test
	public void testGetLength() {
		System.out.println("getLength");
		int expResult = 10;
		int result = instance.getLength();
		assertEquals(expResult, result);
		Numbers temp = new Numbers(55);
		assertEquals(55, temp.getLength());
	}

//	/**
//	 * Test of bubbleSort method, of class Numbers.
//	 */
//	@Test
//	public void testBubbleSort() {
//		System.out.println("bubbleSort");
//		Numbers instance = null;
//		instance.bubbleSort();
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}
//
//	/**
//	 * Test of selectionSort method, of class Numbers.
//	 */
//	@Test
//	public void testSelectionSort() {
//		System.out.println("selectionSort");
//		Numbers instance = null;
//		instance.selectionSort();
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}
//
//	/**
//	 * Test of insertionSort method, of class Numbers.
//	 */
//	@Test
//	public void testInsertionSort() {
//		System.out.println("insertionSort");
//		Numbers instance = null;
//		instance.insertionSort();
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}

}
