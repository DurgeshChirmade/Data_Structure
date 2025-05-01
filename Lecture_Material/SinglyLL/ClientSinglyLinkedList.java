package SinglyLL;

import java.util.Scanner;

public class ClientSinglyLinkedList {

	public static void main(String arg[])
	{
	
	SinglyLinkedList s1 = new SinglyLinkedList();
	
	Scanner sc = new Scanner(System.in);
	int option=0;
	
	do
	{
		System.out.println("\n------------Menu---------");
		System.out.println("1:Start"+
		                  "\n2:Add At Start"+
				          "\n3:Add At end"+
		                  "\n4:Add At Mid"+
				          "\n5:Delete At Start"+
		                  "\n6:Delete At End"+
				          "\n7:Delete At Mid"+
		                  "\n8:Reverse"+
		                  "\n99:Display"+
				          "\n0:EXIT");
		System.out.println("Enter your choice:: ");
		option = sc.nextInt();
		
		switch(option)
		{
		case 1:
			Node newnode = s1.createNewnode();
			s1.setHead(newnode);
			System.out.println("\tNew Linked List created....!!!");
			break;
		case 2:
			s1.addAtStart();
			break;
		case 3:
			s1.addAtEnd();
			break;
		case 4:
			int value;
			System.out.println("\nEnter node after which to add:: ");
			value = sc.nextInt();
			s1.addAtMid(value);
			break;
		case 5:
			s1.deleteAtStart();
			break;
		case 6:
			s1.deleteAtEnd();
			break;
		case 7:
			System.out.println("\nEnter node to delete:: ");
			value = sc.nextInt();
			s1.deleteAtMid(value);
			break;
		case 8:
			s1.reverse();
			System.out.println("\n\tLinked list has been reversed..!!");
			break;
		case 99:
			System.out.println("\n--------------------------\n");
			s1.display();
			System.out.println("\n--------------------------\n");
			break;
		case 0:
			System.exit(0);			
		
		}//switch
	}while(option!=0);
	
	}//main
}//class











