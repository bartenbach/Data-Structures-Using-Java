/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.employeelist;

import java.util.Date;

/**
 *
 * @author blake
 */
public class EmployeeListDriver {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// initialize employees
		Employee brian = new Employee("Brian", "Kernighan", 42, new Date( -883582269000L), 85000);
		Employee dennis = new Employee("Dennis", "Ritchie", 418, new Date(-893431869000L), 90000);

		// initialize employee linked list
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.insertFirst(brian);
		list.insertFirst(dennis);

		// print employees
		System.out.println("Employees:");
		list.displayList();
		System.out.println("");

		// get copy of dennis
		Employee dennisCopy = list.find(418);

		// change the copy's salary
		dennisCopy.setSalary(120000);

		// display dennis' salary
		System.out.println("Copy of Dennis' new salary:");
		System.out.println(dennisCopy.toString());
		System.out.println("");

		// display original list
		System.out.println("Employees:");
		list.displayList();
		System.out.println("");
	}
	
}
