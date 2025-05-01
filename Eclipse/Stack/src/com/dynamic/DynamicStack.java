//Dynamic Stack Using Singly Linked List
package com.dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicStack {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private Node top = null;

	public boolean isEmpty() {

		if (top == null) {
			return true;
		}
		return false;
	}

	public void push(int data) {

		Node temp = new Node();

		temp.setData(data);

		if (top == null) {
			top = temp;
		} else {
			temp.setNext(top);
			top = temp;
		}

		System.out.println("Data is pushed successfully.");

	}

	public int pop() {
		Node temp = new Node();
		int data = 0;

		if (!isEmpty()) {
			data = top.getData();
			temp = top;
			top = top.getNext();
			temp.setNext(null);
		}
		return data;
	}

	public int peek() {

		if (!isEmpty()) {
			return top.getData();
		}
		return 0;
	}

	public void display() {
		if (top == null) {
			System.out.println("Linked List is empty.");
			return;
		}

		for (Node temp = top; temp != null; temp = temp.getNext()) {
			if (temp.getNext() == null) {
				System.out.println(temp.getData());
			} else {
				System.out.print(temp.getData() + " => ");
			}
		}
	}

	public Node eraseAll() {
		Node temp = top;
		while (top != null) {
			top = top.getNext();
			temp.setNext(null);
			temp = top;
		}
		return top;
	}

}
