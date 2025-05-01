package com.dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicQueue {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private Node front = null;
	private Node rear = null;

	public boolean isEmpty() {
		if (front == null) {
			return true;
		}
		return false;
	}

	public void enQueue(int data) {

		Node temp = new Node();

		temp.setData(data);
		temp.setNext(null);

		if (rear == null) {
			rear = temp;
			front = temp;
		} else {
			rear.setNext(temp);
			rear = rear.getNext();
		}
	}

	public int deQueue() {

		int value = 0;

		Node temp = new Node();

		if (!isEmpty()) {
			value = front.getData();

			if (front.getNext() == null) {
				front = rear = null;
			}
			temp = front;
			front = front.getNext();
			temp.setNext(null);
		}
		return value;
	}

	public int peek() {

		int value = 0;

		if (!isEmpty()) {
			value = front.getData();
		}
		return value;
	}

	public void display() {

		System.out.println("Queue : ");

		for (Node temp = front; temp != null; temp = temp.getNext()) {
			if (temp.getNext() == null) {
				System.out.println(temp.getData());
			} else {
				System.out.print(temp.getData() + " => ");
			}

		}
		System.out.println();
	}

	public Node eraseAll() {
		Node current = front;
		Node nextNode;

		while (current != null) {
			nextNode = current.getNext();
			current.setNext(null); // Detach the current node
			current = nextNode;
		}

		front = null;
		rear = null;
		return front;
	}

}
