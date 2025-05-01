package com.singly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assignment7 {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Node create() throws Exception {

		// first node
		Node first = new Node();

		// Initialize the first node
		System.out.print("Enter Data : ");
		int data = Integer.parseInt(br.readLine());

		first.setData(data);
		first.setNext(null);

		return first;

	}

	public void display(Node first) {
		if (first == null) {
			System.out.println("Linked List is empty.");
			return;
		}

		Node temp;
		for (temp = first; temp != null; temp = temp.getNext()) {
			if (temp.getNext() == null) {
				System.out.println(temp.getData());
			} else {
				System.out.print(temp.getData() + " => ");
			}
		}
	}

	public Node addAtStart(Node first) throws Exception {

		Node temp = new Node();

		System.out.print("Enter data at first position : ");
		int data = Integer.parseInt(br.readLine());

		temp.setData(data);
		temp.setNext(first);

		return temp;
	}

	public Node addAtEnd(Node first) throws Exception {

		Node temp = new Node();

		System.out.print("Enter your data at last position : ");
		int data = Integer.parseInt(br.readLine());

		temp.setData(data);
		temp.setNext(null);

		// If the list is empty, return new node as the head
		if (first == null) {
			return temp;
		}

		Node start;
		for (start = first; start.getNext() != null; start = start.getNext())
			; // no code in loop only traverse s to the last node

		start.setNext(temp);

		return first;
	}

	public Node addAtPosition(Node first, int pos) throws Exception {

		Node temp = new Node();

		System.out.print("Enter Data :");
		int data = Integer.parseInt(br.readLine());

		temp.setData(data);

		// Case 1: Insert at the first position
		if (pos == 1) {
			temp.setNext(first);
			return temp; // new node become head
		}

		Node start = first;
		for (int i = 1; i < pos - 1 && start != null; i++) {
			start = start.getNext();
		}

		// Invalid position (greater than list size)
		if (start == null) {
			System.out.println("Invalid Position...");
			return first; // no changes in original list
		}

		// Insert node at the desired position
		temp.setNext(start.getNext());
		start.setNext(temp);

		return first;
	}

	public int findMax(Node first) {
		if (first == null) {
			return -1;
		}
		int max = first.getData();
		for (Node temp = first; temp != null; temp = temp.getNext()) {
			if (temp.getData() > max) {
				max = temp.getData();
			}
		}

		return max;

	}

	public int findOccurence(Node first, int key) {
		if (first == null) {
			return -1;
		}

		int pos = 0;
		for (Node temp = first; temp != null; temp = temp.getNext()) {
			if (temp.getData() == key) {
				pos++;
			}
		}

		if (pos == 0) {
			return -1;
		} else {
			return pos;
		}

	}

	public int countNodes(Node first) {
		if (first == null) {
			System.out.println("Linked List is empty.");
			return 0;
		}

		int sum = 0;
		Node temp;
		for (temp = first; temp != null; temp = temp.getNext()) {
			sum = sum + 1;
		}
		return sum;
	}

}
