package com.singly;

class node {
	char data;
	node next;

	node(char data) {
		this.data = data;
		this.next = null;
	}
}

public class Assignment {

	public static node createAZList() {
		node head = null, tail = null;

		for (char c = 'A'; c <= 'Z'; c += 2) {
			// First character
		node first = new node(c);

			// Second character (c + 1) only if within A-Z
			node second = null;
			if (c + 1 <= 'Z') {
				second = new node((char) (c + 1));
				first.next = second;
			}

			// Attach to main list
			if (head == null) {
				head = first;
				tail = (second != null) ? second : first;
			} else {
				tail.next = first;
				tail = (second != null) ? second : first;
			}
		}

		return head;
	}

	public static void display(node head) {
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			if (temp.next != null) {
				System.out.print(" -> ");
			}
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		node head = createAZList();
		display(head);
	}
}
