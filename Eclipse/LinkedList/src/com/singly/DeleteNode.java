package com.singly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeleteNode {

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

	public Node deleteAtStart(Node first) {
		if (first == null) {
			System.out.println("Linked List is already empty.");
			return null;
		}

		// temporary node
		Node temp = first;

		System.out.println("Deleted Node : " + temp.getData());

		first = first.getNext();
		temp.setNext(null);
		// free(temp)
		
		return first;
	}
	
	public Node deleteAtEnd(Node first) {
		if(first==null) {
			System.out.println("Linked List is empty already.");
			return null;
		}
		
		if(first.getNext()==null) {
			System.out.println("Deleted Data : "+first.getData());
			first=null;
			return first;
		}
		
		Node temp,slast=null;
		for(temp=first;temp.getNext()!=null;temp=temp.getNext()) {
			slast=temp; //s keeps track of second last node // it will travel to the second last node
		}
		
		System.out.println("Deleted Node : "+temp.getData());
		slast.setNext(null);
		temp=null; //Remove reference to the last node
		
		return first;
	}
	
	public Node deleteAtPosition(Node first,int pos) {
		if(first==null || pos<0) {
			System.out.println("Linked List is empty already.");
			return null;
		}
		
		//delete at first
		if(pos==1) {
			System.out.println("Deleted Node : "+first.getData());
			first=first.getNext();
			return first;
		}
		
		Node start=first;
		for(int i=1;i<pos-1 && start!=null;i++) {
			start=start.getNext();
		}
		
		if(start==null || start.getNext()==null) {
			System.out.println("Invalid Position...");
			return first;
		}
		
		System.out.println("Deleted Node : "+start.getNext().getData());
		start.setNext(start.getNext().getNext());
		
		return first;
	}
	
	//correct this method to delete by value
	public Node deleteAtValue(Node first,int key) {
		if(first==null) {
			System.out.println("Linked List is empty already.");
			return null;
		}
		
		//delete value at first
		if(first.getData()==key) {
			System.out.println("Deleted Node : "+first.getData());
			first=first.getNext();
			return first;
		}
		
		Node current = first;
	    Node previous = null;

	    // Traverse to find the node to delete, keeping track of the previous node
	    while (current != null && current.getData() != key) {
	        previous = current;
	        current = current.getNext();
	    }

	    // Node not found
	    if (current == null) {
	        System.out.println("Node not found...");
	        return first;
	    }

	    // Node found, now delete it
	    System.out.println("Deleted Node : " + current.getData());
	    previous.setNext(current.getNext());
		
		return first;
	}
}
