package C2Stack;

import java.util.Scanner;

public class ClientC2Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C2StackArray  c2  = new C2StackArray();
		Scanner sc = new Scanner(System.in);
		
        int value,option;
		
		do{
			System.out.println("\n\n------------Menu----------");
			System.out.println("\n1:Start"+
			                   "\n2:Push1"+
					           "\n3:Push2"+
					           "\n4:Pop1"+
					           "\n5:Pop2"+
			                   "\n6:Display"+
					           "\n0:EXIT");
			System.out.println("\nEnter your choice:: ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("Enter size:: ");
				c2.initStack(sc.nextInt());
				System.out.println("\n\tNew STACK instantiated....");
				break;
				
			case 2:
				System.out.println("\nEnter value to push in stack1:: ");
				value = sc.nextInt();
				
				c2.push1(value);
				break;
				
			case 3:
				System.out.println("\nEnter value to push in stack2:: ");
				value = sc.nextInt();
				
				c2.push2(value);
				break;
				
			case 4:
				value = c2.pop1();
				if(value != -1)
					System.out.println("\tStack1 Popped:: "+value);
				
				break;
			case 5:
				value = c2.pop2();
				if(value != -1)
					System.out.println("\tStack2 Popped:: "+value);
				
				break;
			case 6:
				System.out.println("\n\n-----------------------------");
				c2.display1();
				System.out.println("--------------------------------\n\n");
				c2.display2();
				System.out.println("--------------------------------\n\n");
				
				break;
			case 0:
				System.exit(0);
			
			}//end_switch
		}	

	}//main

}//class
