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
		this.priority = priority;
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
