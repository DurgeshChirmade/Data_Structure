package com.doubly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DoublyLinkedList {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Node create(int n) throws Exception {

		if (n <= 0) {
			return null;
		}

		Node first = new Node();

		// Initialize the first node
		System.out.print("Enter Data :: ");
		int data = Integer.parseInt(br.readLine());

		first.setData(data);
		first.setPrev(null);
		first.setNext(null);

		// next node/last node
		Node last = first;

		for (int i = 2; i <= n; i++) {
			System.out.print("Enter Data :: ");
			data = Integer.parseInt(br.readLine());

			// temporary node
			Node temp = new Node();
			temp.setData(data);
			temp.setPrev(null);
			temp.setNext(null);

			last.setNext(temp);
			temp.setPrev(last);
			last = temp;

		}

		return first;
	}

	public void display(Node first) {
		if (first == null) {
			System.out.println("Linked List is empty.");
			return;
		}

		for (Node temp = first; temp != null; temp = temp.getNext()) {
			System.out.print(temp.getData());
			if (temp.getNext() != null) {
				System.out.print("<=>");
			}
		}
		System.out.println();
	}

	public Node eraseAll(Node first) {
		Node temp = first;
		while (first != null) {
			first = first.getNext();
			temp.setPrev(null);
			temp.setNext(null);
			temp = first;
		}
		return first;
	}

	public Node addAtStart(Node first) throws Exception {
		Node temp = new Node();

		System.out.print("Enter Data at start :: ");
		int data = Integer.parseInt(br.readLine());

		temp.setData(data);
		temp.setNext(first);
		if (first != null) {
			first.setPrev(temp);
		}

		return temp;
	}

	public Node addAtEnd(Node first) throws Exception {

		Node temp = new Node();

		System.out.print("Enter Data at Last : ");
		int data = Integer.parseInt(br.readLine());

		temp.setData(data);
		temp.setPrev(null);
		temp.setNext(null);

		if (first == null) {
			return temp;
		}

		Node start;
		for (start = first; start.getNext() != null; start = start.getNext())
			; // no code in loop only traverse s to the last node

		start.setNext(temp);
		temp.setPrev(start);

		return first;

	}

	public Node addByValue(Node first, int key) throws Exception {
		if (first == null) {
			System.out.println("Linked list is empty.");
			return null;
		}

		Node newnode = new Node();

		System.out.print("Enter Data : ");
		int data = Integer.parseInt(br.readLine());

		newnode.setData(data);
		newnode.setPrev(null);
		newnode.setNext(null);

		// add value at first
		if (first.getData() == key) {
			newnode.setNext(first);
			newnode.setPrev(null);
			first = newnode;
			return first;
		}

		Node temp = null;
		for (temp = first; temp != null && temp.getData() != key; temp = temp.getNext())
			;

		// Node not found
		if (temp == null) {
			System.out.println("Node not found...");
			return first;
		}

		// Node found

		newnode.setNext(temp.getNext());
		newnode.setPrev(temp);

		if (temp.getNext() != null) {
			temp.getNext().setPrev(newnode); // fix backward link
		}

		temp.setNext(newnode); // fix forward link

		return first;
	}

	public Node addAtposition(Node first, int pos) throws Exception {

		Node newnode = new Node();

		System.out.print("Enter Data : ");
		int data = Integer.parseInt(br.readLine());

		newnode.setData(data);
		newnode.setNext(null);
		newnode.setPrev(null);

		// Insert at the first position
		if (pos == 1) {
			newnode.setNext(first);
			if (first != null) {
				first.setPrev(newnode);
			}
			return newnode; // newnode become head now
		}

		Node temp = first;
		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.getNext();
		}

		if (temp == null) {
			System.out.println("invalid Position....");
			return first; // no changes in original list
		}

		// Insert node at the desired position
		newnode.setNext(temp.getNext());
		newnode.setPrev(temp);
		if (temp.getNext() != null) {
			temp.getNext().setPrev(newnode);
		}
		temp.setNext(newnode);

		return first;
	}

	public int countNodes(Node first) {
		if (first == null) {
			System.out.println("Linked List is empty...");
			return 0;
		}

		int cnt = 0;
		for (Node temp = first; temp != null; temp = temp.getNext()) {
			cnt += 1;
		}

		return cnt;

	}

	public Node DeleteAtStart(Node first) {
		if (first == null) {
			System.out.println("Linked List is empty.");
			return null;
		}

		// temporary node
		Node temp = first;

		System.out.println("Deleted Node : " + temp.getData());

		first = first.getNext();
		first.setPrev(null);
		temp.setNext(null);

		return first;

	}

	public Node DeleteAtEnd(Node first) {
		if (first == null) {
			System.out.println("Linked List is empty.");
			return null;
		}
		if (first.getNext() == null) {
			System.out.println("Deleted Node : " + first.getData());
			return null;
		}

		Node temp, slast = null;
		for (temp = first; temp.getNext() != null; temp = temp.getNext()) {
			slast = temp;
		}

		System.out.println("Deleted Node : " + temp.getData());
		temp.setPrev(null);
		slast.setNext(null);
		temp = null;

		return first;
	}

	public Node deleteAtPosition(Node first, int pos) {
		if (first == null) {
			System.out.println("Linked List is empty already.");
			return null;
		}

		// delete at first
		if (pos == 1) {
			System.out.println("Deleted Node : " + first.getData());
			first = first.getNext();
			first.getPrev().setNext(null);
			first.setPrev(null);
			return first;
		}

		Node start = first;
		for (int i = 1; i < pos - 1 && start != null; i++) {
			start = start.getNext();
		}

		if (start == null || start.getNext() == null) {
			System.out.println("Invalid Position.");
			return first;
		}

		System.out.println("Deleted node : " + start.getNext().getData());
		start.setNext(start.getNext().getNext());
		start.getNext().getNext().setPrev(start);
		
		start.getNext().setPrev(null);
		start.getNext().setNext(null);
		

		return first;

	}
	
	public Node deleteAtValue(Node first,int key) {
		if(first==null) {
			System.out.println("Linked List is empty already.");
			return null;
		}
		
		//delete by value
		if(first.getData()==key) {
			System.out.println("Deleted Node : "+first.getData());
			first=first.getNext();
			first.getPrev().setNext(null);
			first.setPrev(null);
			
			return first;
		}
		
		Node current=first;
		Node previous=null;
		
		while(current != null && current.getData()!=key) {
			previous=current;
			current=current.getNext();
		}
		
		//Node not found
		if(current==null) {
			System.out.println("Node not found...");
			return first;
		}
		
		System.out.println("Deleted Node : "+current.getData());
		previous.setNext(current.getNext());
		current.getNext().setPrev(previous);
		current.setPrev(null);
		current.setNext(null);
		
		return first;
		
	}
}
