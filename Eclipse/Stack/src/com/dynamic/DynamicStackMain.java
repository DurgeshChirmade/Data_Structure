//Dynamic Stack Using Singly Linked List
package com.dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicStackMain {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		DynamicStack d = new DynamicStack();

		int choice = 0;

		while (true) {
			System.out.println("\n----------------- MENU ------------------");
			System.out.println("1:push data in stack" + "\n2:pop data from stack" + "\n3.peek data from stack"
					+ "\n4:Display stack" + "\n0:Exit");

			System.out.print("Enter your choice :: ");
			choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				System.out.print("Enter your data to add in stack : ");
				int data = Integer.parseInt(br.readLine());

				d.push(data);
				break;

			case 2:
				int value = d.pop();
				if (value == 0) {
					System.out.println("\n STACK is EMPTY.\n");
				} else {
					System.out.println("Popped Element : " + value);
				}
				break;

			case 3:
				int val = d.peek();
				if (val == 0) {
					System.out.println("\n STACK is EMPTY.\n");
				} else {
					System.out.println("Peek Element : " + val);
				}
				break;

			case 4:
				d.display();
				break;

			case 0:
				if (d.eraseAll() == null) {
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
