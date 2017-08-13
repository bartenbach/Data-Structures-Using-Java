/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.thefinal;

/**
 *
 * @author blake
 */
public class Link {

	public long dData;
	public Link next;
	public Link previous;

	public Link(long paramLong) {
		this.dData = paramLong;
	}

	public void displayLink() {
		System.out.print(this.dData + " ");
	}
}
