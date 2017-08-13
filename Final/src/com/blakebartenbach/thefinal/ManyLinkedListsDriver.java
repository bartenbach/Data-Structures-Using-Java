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
public class ManyLinkedListsDriver {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// double-ended list test
		DoubleEndedList dEndedList = (DoubleEndedList) ManyLinkedLists.createLinkedList(ListType.DOUBLEENDEDLIST);
		dEndedList.insertFirst(50000L);
		dEndedList.insertFirst(40000L);
		dEndedList.insertFirst(30000L);
		dEndedList.insertLast(60000L); // element inserted at the end
		dEndedList.displayList();

		// doubly linked list test
		DoublyLinkedList dLinkedList = (DoublyLinkedList) ManyLinkedLists.createLinkedList(ListType.DOUBLYLINKEDLIST);
		dLinkedList.insertFirst(50000L);
		dLinkedList.insertLast(60000L);
		dLinkedList.insertAfter(50000L, 55000L); // element inserted in between elements
		dLinkedList.displayList();
		dLinkedList.displayBackward(); // list efficiently traversed backwards
	}
	
}
