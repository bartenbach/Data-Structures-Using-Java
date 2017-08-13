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
public class Employee {


	private String firstName;
	private String lastName;
	private int id;
	private Date birthDate;
	private int salary;


	public Employee(String firstName, String lastName, int id, Date birthDate, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	/**
	 *  Copy Constructor
	 * @param employee - the employee to clone
	 */
	public Employee(Employee employee) {
		this(employee.firstName, employee.lastName, employee.id, employee.birthDate, employee.salary);
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getId() {
		return this.id;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName + " [" + this.id + "] " + this.birthDate.toString() + " $" + this.salary;
	}
	
}
