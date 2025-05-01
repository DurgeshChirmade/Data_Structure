package com.linear;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StackMain {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StackStatic st = new StackStatic();

		int option, value;

		while (true) {
			System.out.println("\n************** MENU ***************");
			System.out.println("\n1:Start" + "\n2:Push" + "\n3:Pop" + "\n4:Display" + "\n0:EXIT");
			System.out.print("\nEnter your choice : ");
			option = Integer.parseInt(br.readLine());

			switch (option) {
			case 1:
				st.initStack();
				System.out.println("\nNew Stack instantiated.");
				break;

			case 2:
				System.out.print("Enter your data : ");
				value = Integer.parseInt(br.readLine());

				st.push(value);
				break;

			case 3:
				value = st.pop();

				if (value != -1) {
					System.out.println("\nPopped : " + value);

				}
				break;

			case 4:
				System.out.println("\n-------------------------------\n");
				st.display();
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
