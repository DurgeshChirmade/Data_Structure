package com.singly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		EmployeeLinkedList el = new EmployeeLinkedList();

		int choice = 0;
		Nodes head = null;

		while (true) {

			System.out.println("\n----------------- MENU ------------------");
			System.out.println("1:Create Node" + "\n2:Add at position"
					+ "\n5:Display Linked List"+ "\n0:Exit");

			System.out.print("Enter your choice :: ");
			choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				head = el.create();
				System.out.println("\n New linked node is created...");
				break;

			case 2:
				
				head = el.addAtPosition(head);
				break;

			case 5:
				System.out.println("Linked List Display : ");
				el.display(head);
				break;

			case 0:
				System.exit(0);

			default:
				System.out.println("Invalid choice....");
			}
		}

	}

}
