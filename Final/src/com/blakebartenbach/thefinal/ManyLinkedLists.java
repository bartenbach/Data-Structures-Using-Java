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


public class ManyLinkedLists {


	public static FinalList createLinkedList(ListType listType) {
		if (listType == ListType.DOUBLYLINKEDLIST) {
			return new DoublyLinkedList();
		} else if (listType == ListType.DOUBLEENDEDLIST) {
			return new DoubleEndedList();
		}
		return null;
	}

	
}
