package com.singly;

public class Nodes {

	private Employee e1;
	private Nodes next;

	public Nodes() {
		this.e1 = null;
		this.next = null;
	}

	public Employee getE1() {
		return e1;
	}

	public void setE1(Employee e1) {
		this.e1 = e1;
	}

	public Nodes getNext() {
		return next;
	}

	public void setNext(Nodes next) {
		this.next = next;
	}

}
