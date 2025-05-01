package com.singly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UpdateMain {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		UpdateLinkedList u = new UpdateLinkedList();

		int choice = 0;
		Node head = null;

		while (true) {
			System.out.println("\n----------------- MENU ------------------");
			System.out.println("1:Create Node" + "\n2:update Linked List" + "\n3:Display Linked List" + "\n0:Exit");

			System.out.print("Enter your choice :: ");
			choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				System.out.print("How many nodes you want to create : ");
				int n = Integer.parseInt(br.readLine());
				head = u.create(n);
				System.out.println("\n New linked node is created...");
				break;

			case 2:
				System.out.print("Enter key which number you want to repalce : ");
				int key = Integer.parseInt(br.readLine());

				System.out.print("Enter rep which number you want to replace : ");
				int rep = Integer.parseInt(br.readLine());

				int cnt = u.replaceLinkedList(head, key, rep);
				System.out.println("Count : " + cnt);
				break;
				
			case 3:
				u.display(head);
				break;

			case 0:
				head = u.eraseAll(head);
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
