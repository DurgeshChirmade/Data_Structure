package com.dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicQueueMain {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		DynamicQueue d = new DynamicQueue();

		int option;

		while (true) {
			System.out.println("\n************** MENU ***************");
			System.out.println(
					"\n1:EnQueue element" + "\n2:DeQueue element" + "\n3:Peek element" + "\n4:Display" + "\n0:EXIT");
			System.out.print("\nEnter your choice : ");
			option = Integer.parseInt(br.readLine());

			switch (option) {
			case 1:
				System.out.print("Enter data to add in queue : ");
				int data = Integer.parseInt(br.readLine());
				d.enQueue(data);
				break;

			case 2:
				int value = d.deQueue();
				if (value == 0) {
					System.out.println("\n Queue is EMPTY.\n");
				} else {
					System.out.println("Popped Element : " + value);
				}
				break;

			case 3:
				int val = d.peek();
				if (val == 0) {
					System.out.println("\n Queue is EMPTY.\n");
				} else {
					System.out.println("front Peek Element : " + val);
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
