package com.singly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SinglyMain {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		SinglyLinkedList sl = new SinglyLinkedList();

		int choice = 0;
		Node head = null;

		while (true) {

			System.out.println("\n----------------- MENU ------------------");
			System.out.println("1:Create Node" + "\n2:Add at start" + "\n3:Add at last" + "\n4:Add at position"
					+ "\n5:Display Linked List"+"\n6:Count of nodes" + "\n0:Exit");

			System.out.print("Enter your choice :: ");
			choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				head = sl.create();
				System.out.println("\n New linked node is created...");
				break;

			case 2:
				head = sl.addAtStart(head);
				break;

			case 3:
				head = sl.addAtEnd(head);
				break;

			case 4:
				System.out.print("Enter which position you want to add new node : ");
				int pos = Integer.parseInt(br.readLine());

				head = sl.addAtPosition(head, pos);
				break;

			case 5:
				System.out.println("Linked List Display : ");
				sl.display(head);
				break;
				
			case 6:
				int count = sl.countNodes(head);
				System.out.print("Count of Nodes : "+count);
				break;

			case 0:
				System.exit(0);

			default:
				System.out.println("Invalid choice....");
			}
		}

	}

}
