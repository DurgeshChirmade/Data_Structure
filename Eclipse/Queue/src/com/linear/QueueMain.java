package com.linear;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueueMain {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		QueueStatic qs = new QueueStatic();

		int option, value;

		while (true) {
			System.out.println("\n************** MENU ***************");
			System.out.println("\n1:Start" + "\n2:EnQueue" + "\n3:DeQueue" + "\n4:Display" + "\n0:EXIT");
			System.out.print("\nEnter your choice : ");
			option = Integer.parseInt(br.readLine());

			switch (option) {
			case 1:
				qs.initQueue();
				System.out.println("\nNew Stack instantiated.");
				break;

			case 2:
				System.out.print("Enter your data : ");
				value = Integer.parseInt(br.readLine());

				qs.enQueue(value);
				break;

			case 3:
				value = qs.deQueue();

				if (value != -1) {
					System.out.println("\nPopped : " + value);

				}
				break;

			case 4:
				System.out.println("\n-------------------------------\n");
				qs.display();
				System.out.println("\n-------------------------------\n");
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Invalid choice....");
				break;
			}

		}

	}

}
