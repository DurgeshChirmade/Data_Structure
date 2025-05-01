package com.doubly;

public class Node {

	private int data;
	private Node prev;
	private Node next;

	public Node() {
		this.data = 0;
		this.prev = this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", prev=" + prev + ", next=" + next + "]";
	}

}
