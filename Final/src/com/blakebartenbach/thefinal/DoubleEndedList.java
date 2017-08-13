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
public class DoubleEndedList implements FinalList {

	private Link first;
	private Link last;

	public DoubleEndedList() {
		this.first = null;
		this.last = null;
	}

	@Override
	public boolean isEmpty() {
		return this.first == null;
	}

	@Override
	public void insertFirst(long paramLong) {
		Link localLink = new Link(paramLong);
		if (isEmpty()) {
			this.last = localLink;
		}
		localLink.next = this.first;
		this.first = localLink;
	}

	public void insertLast(long paramLong) {
		Link localLink = new Link(paramLong);
		if (isEmpty()) {
			this.first = localLink;
		} else {
			this.last.next = localLink;
		}
		this.last = localLink;
	}

	public long deleteFirst() {
		long l = this.first.dData;
		if (this.first.next == null) {
			this.last = null;
		}
		this.first = this.first.next;
		return l;
	}

	@Override
	public void displayList() {
		System.out.print("List (first-->last): ");
		Link localLink = this.first;
		while (localLink != null) {
			localLink.displayLink();
			localLink = localLink.next;
		}
		System.out.println("");
	}
}
