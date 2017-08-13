package com.blakebartenbach.employeelist;

class Link {

	public Employee employee;
	public Link next;

	public Link(Employee employee) {
		this.employee = employee;
	}

	public void displayLink() {
		System.out.print("{" + employee.toString()+ "} ");
	}
}

public class EmployeeLinkedList {

	private Link first;

	public EmployeeLinkedList() {
		first = null;
	}

	public EmployeeLinkedList(Employee[] datas) {
		for (int i = (datas.length - 1); i > -1; i--) {
			this.insertFirst(datas[i]);
		}
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public boolean search(Employee data) {
		Link current = first;
		while (current != null) {
			if (current.employee == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public Employee find(int id) {
		Link current = first;
		while (current != null) {
			if (current.employee.getId() == id) {
				return new Employee(current.employee); // returns copy using clone constructor
			}
		}
		return null;
	}

	public void insertFirst(Employee data) {
		Link newLink = new Link(data);
		newLink.next = first;
		first = newLink;
	}

	public int numberOfValues(Employee data) {
		Link current = first;
		long times = 0;
		while (current != null) {
			if (current.employee == data) {
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

	public void replace(Employee search, Employee replace) {
		Link current = first;
		while (current != null) {
			if (current.employee == search) {
				current.employee = replace;
			}
			current = current.next;
		}
	}

	public void removeEmployee() {
		Link current = first;
		while (current != null) {
			current.employee = null;
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

	public Employee[] getArray() {
		Employee[] longArray = new Employee[this.length()];
		Link current = first;
		int counter = 0;
		while (current != null) {
			longArray[counter] = current.employee;
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
