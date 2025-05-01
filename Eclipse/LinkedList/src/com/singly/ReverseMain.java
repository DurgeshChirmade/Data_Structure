package com.singly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseMain {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ReverseLinkedList r = new ReverseLinkedList();

		int choice = 0;
		Node head = null;

		while (true) {
			System.out.println("\n----------------- MENU ------------------");
			System.out.println(
					"1:Create Node" + "\n2:reverse Linked List" + "\n3:print reverse linked list" + "\n4:Display Linked List" + "\n0:Exit");

			System.out.print("Enter your choice :: ");
			choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				System.out.print("How many nodes you want to create : ");
				int n = Integer.parseInt(br.readLine());
				head = r.create(n);
				System.out.println("\n New linked node is created...");
				break;

			case 2:
				head = r.reverseLinkedList(head);
				break;

			case 3:
				r.printReverse(head);
				break;
				
			case 4:
				r.display(head);
				break;

			case 0:
				head = r.eraseAll(head);
				if (head == null) {
					System.out.println("Linked List is clear...");
				}
				System.exit(0);

			default:
				System.out.println("Invalid choice....");
				break;
			}
		}

	}

}
