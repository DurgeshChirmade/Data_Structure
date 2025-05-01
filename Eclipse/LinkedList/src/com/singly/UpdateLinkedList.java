package com.singly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UpdateLinkedList {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Node create(int n) throws Exception {

		if (n <= 0) {
			return null;
		}

		// Initialize the first node
		Node first = new Node();

		System.out.print("Enter Data :: ");
		int data = Integer.parseInt(br.readLine());

		first.setData(data);

		// next node/last node
		Node last = first;

		for (int i = 2; i <= n; i++) {
			System.out.print("Enter Data :: ");
			data = Integer.parseInt(br.readLine());

			// temporary node
			Node temp = new Node();

			temp.setData(data);

			last.setNext(temp); // store the reference of newnode t in l.next section.
			last = temp; // change position of l to the next node
		}

		return first;
	}

	public void display(Node first) {
		if (first == null) {
			System.out.println("Linked List is empty.");
			return;
		}

		for (Node temp = first; temp != null; temp = temp.getNext()) {
			if (temp.getNext() == null) {
				System.out.println(temp.getData());
			} else {
				System.out.print(temp.getData() + " => ");
			}
		}
	}

	public Node eraseAll(Node first) {
		Node temp = first;
		while (first != null) {
			first = first.getNext();
			temp.setNext(null);
			temp = first;
		}
		return first;
	}

	public int replaceLinkedList(Node first, int key, int rep) {
		int cnt = 0;

		for (Node temp = first; temp != null; temp = temp.getNext()) {
			if (temp.getData() == key) {
				temp.setData(rep);
				cnt++;
			}
		}
		return cnt;
	}
}
