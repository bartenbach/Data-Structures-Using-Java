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
class DoublyLinkedList implements FinalList {

	private Link first;
	private Link last;

	public DoublyLinkedList() {
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
		} else {
			this.first.previous = localLink;
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
			localLink.previous = this.last;
		}
		this.last = localLink;
	}

	public Link deleteFirst() {
		Link localLink = this.first;
		if (this.first.next == null) {
			this.last = null;
		} else {
			this.first.next.previous = null;
		}
		this.first = this.first.next;
		return localLink;
	}

	public Link deleteLast() {
		Link localLink = this.last;
		if (this.first.next == null) {
			this.first = null;
		} else {
			this.last.previous.next = null;
		}
		this.last = this.last.previous;
		return localLink;
	}

	public boolean insertAfter(long paramLong1, long paramLong2) {
		Link localLink1 = this.first;
		while (localLink1.dData != paramLong1) {
			localLink1 = localLink1.next;
			if (localLink1 == null) {
				return false;
			}
		}
		Link localLink2 = new Link(paramLong2);
		if (localLink1 == this.last) {
			localLink2.next = null;
			this.last = localLink2;
		} else {
			localLink2.next = localLink1.next;

			localLink1.next.previous = localLink2;
		}
		localLink2.previous = localLink1;
		localLink1.next = localLink2;
		return true;
	}

	public Link deleteKey(long paramLong) {
		Link localLink = this.first;
		while (localLink.dData != paramLong) {
			localLink = localLink.next;
			if (localLink == null) {
				return null;
			}
		}
		if (localLink == this.first) {
			this.first = localLink.next;
		} else {
			localLink.previous.next = localLink.next;
		}
		if (localLink == this.last) {
			this.last = localLink.previous;
		} else {
			localLink.next.previous = localLink.previous;
		}
		return localLink;
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

	public void displayBackward() {
		System.out.print("List (last-->first): ");
		Link localLink = this.last;
		while (localLink != null) {
			localLink.displayLink();
			localLink = localLink.previous;
		}
		System.out.println("");
	}
}