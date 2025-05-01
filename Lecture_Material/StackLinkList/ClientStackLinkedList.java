package StackLinkList;

import java.util.Scanner;

public class ClientStackLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackLinkedList s = new StackLinkedList();
        Scanner sc  = new Scanner(System.in);
		
		int value,option;
		
		do{
			System.out.println("\n\n------------Menu----------");
			System.out.println("\n1:Push"+
					           "\n2:Pop"+
			                   "\n3:Display"+
					           "\n0:EXIT");
			System.out.println("\nEnter your choice:: ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("\nEnter value to push:: ");
				value = sc.nextInt();
				
				s.push(value);
				break;
				
			case 2:
				value = s.pop();
				if(value != -1)
					System.out.println("\tPopped:: "+value);
				
				break;
			case 3:
				System.out.println("\n\n-----------------------------");
				s.display();
				System.out.println("--------------------------------\n\n");
				
				break;
			case 0:
				System.exit(0);
			
			}//end_switch
		}while(option!=0);
		
	}//main

}//class
