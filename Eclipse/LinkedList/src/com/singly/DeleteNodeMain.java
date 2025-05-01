package com.singly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeleteNodeMain {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		DeleteNode d = new DeleteNode();

		int choice = 0;
		Node head = null;

		while (true) {
			System.out.println("\n----------------- MENU ------------------");
			System.out.println("1:Create Node" + "\n2:delete at start" + "\n3:delete at last" + "\n4:delete at position"
					+ "\n5.delete by value" + "\n6:Display Linked List" + "\n0:Exit");

			System.out.print("Enter your choice :: ");
			choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				System.out.print("How many nodes you want to create : ");
				int n = Integer.parseInt(br.readLine());
				head = d.create(n);
				System.out.println("\n New linked node is created...");
				break;

			case 2:
				head = d.deleteAtStart(head);
				break;

			case 3:
				head = d.deleteAtEnd(head);
				break;

			case 4:
				System.out.print("Enter which position you want to delete node : ");
				int pos = Integer.parseInt(br.readLine());

				head = d.deleteAtPosition(head, pos);
				break;

			case 5:
				System.out.print("Enter which value you want to delete node : ");
				int data = Integer.parseInt(br.readLine());

				head = d.deleteAtValue(head, data);
				break;

			case 6:
				System.out.println("Linked List Display : ");
				d.display(head);
				break;

			case 0:
				head = d.eraseAll(head);
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
