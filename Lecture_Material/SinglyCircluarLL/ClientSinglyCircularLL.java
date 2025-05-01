package SinglyCircluarLL;

import java.util.Scanner;

public class ClientSinglyCircularLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyCircularLinkedList s1= new SinglyCircularLinkedList();
		Scanner sc = new Scanner(System.in);
		int option=0;
		
		do
		{
			System.out.println("\n------------Menu---------");
			System.out.println("1:Add At Start"+
					          "\n2:Add At end"+
			                  "\n3:Delete At Start"+
			                  "\n4:Delete At End"+
					          "\n99:Display"+
					          "\n0:EXIT");
			System.out.println("Enter your choice:: ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				s1.addAtStart();
				break;
			case 2:
				s1.addAtEnd();
				break;
			case 3:
				s1.deleteAtStart();
				break;
			case 4:
				s1.deleteAtEnd();
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
