package com.blakebartenbach.linkedlist;

class Link {

	public long data;
	public Link next;

	public Link(long data) {
		this.data = data;
	}

	public void displayLink() {
		System.out.print("{" + data + "} ");
	}
}

public class LinkList {

	private Link first;

	public LinkList() {
		first = null;
	}

	public LinkList(long[] datas) {
		for (int i = (datas.length - 1); i > -1; i--) {
			this.insertFirst(datas[i]);
		}
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public boolean search(long data) {
		Link current = first;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void insertFirst(long data) {
		Link newLink = new Link(data);
		newLink.next = first;
		first = newLink;
	}

	public int numberOfValues(long data) {
		Link current = first;
		long times = 0;
		while (current != null) {
			if (current.data == data) {
				times++;
			}
			current = current.next;
		}
		return (int) times;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	public void replace(long search, long replace) {
		Link current = first;
		while (current != null) {
			if (current.data == search) {
				current.data = replace;	
			}
			current = current.next;
		}
	}

	public void zero() {
		Link current = first;
		while (current != null) {
			current.data = 0L;
			current = current.next;
		}
	}

	public int length() {
		Link current = first;
		int counter = 0;
		while (current != null) {
			counter++;
			current = current.next;
		}
		return counter;
	}

	public long[] getArray() {
		long[] longArray = new long[this.length()];
		Link current = first;
		int counter = 0;
		while (current != null) {
			longArray[counter] = current.data;
			current = current.next;
			counter++;
		}
		return longArray;
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}