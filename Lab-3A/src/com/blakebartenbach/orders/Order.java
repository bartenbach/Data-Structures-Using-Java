/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.orders;

/**
 *
 * @author blake
 */
public class Order {


	private final String code;
	private final byte priority;


	public Order(String code, byte priority) {
		this.code = code;
		if (priority == 1 || priority == 2 || priority == 3) {
			this.priority = priority;
		} else {
			throw new IllegalArgumentException("Invalid Order Priority -- Can only be an integer 1 - 3");
		}
	} 

	public String getCode() {
		return this.code;
	}

	public byte getPriority() {
		return this.priority;
	}

	@Override
	public String toString(){
		return "Priority: [" + this.priority + "] " + "Order: " + this.code;
	}
	
}
