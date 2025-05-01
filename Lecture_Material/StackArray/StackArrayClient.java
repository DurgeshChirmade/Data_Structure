package StackArray;

import java.util.Scanner;

public class StackArrayClient {

	public static void main(String[] args) {
		// TO DO Auto-generated method stub

		StackArray s = new StackArray();
		Scanner sc  = new Scanner(System.in);
		
		int value,option;
		
		do{
			System.out.println("\n\n------------Menu----------");
			System.out.println("\n1:Start"+
			                   "\n2:Push"+
					           "\n3:Pop"+
			                   "\n4:Display"+
					           "\n0:EXIT");
			System.out.println("\nEnter your choice:: ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				s.initStack();
				System.out.println("\n\tNew STACK instantiated....");
				break;
				
			case 2:
				System.out.println("\nEnter value to push:: ");
				value = sc.nextInt();
				
				s.push(value);
				break;
				
			case 3:
				value = s.pop();
				if(value != -1)
					System.out.println("\tPopped:: "+value);
				
				break;
			case 4:
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









