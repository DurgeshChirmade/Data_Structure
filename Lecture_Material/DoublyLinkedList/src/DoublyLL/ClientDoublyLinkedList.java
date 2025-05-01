package DoublyLL;

import java.util.Scanner;

public class ClientDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int option=0;
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		do
		{
			System.out.println("\n------------Menu---------");
			System.out.println("1:Add At Start"+
					          "\n2:Add At end"+
			                  "\n3:Add At Mid"+
					          "\n4:Delete At Start"+
			                  "\n5:Delete At End"+
					          "\n6:Delete At Mid"+
			                  "\n99:Display"+
					          "\n0:EXIT");
			System.out.println("Enter your choice:: ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				dll.addAtStart();
				break;
			case 2:
				dll.addAtEnd();
				break;
			case 3:
				int value;
				System.out.println("\nEnter node after which to add:: ");
				value = sc.nextInt();
				dll.addAtMid(value);
				break;
			case 4:
				dll.deleteAtStart();
				break;
			case 5:
				dll.deleteAtEnd();
				break;
			case 6:
				System.out.println("\nEnter node to delete:: ");
				value = sc.nextInt();
				dll.deleteAtMid(value);
				break;
			case 99:
				System.out.println("\n--------------------------\n");
				dll.display();
				System.out.println("\n--------------------------\n");
				break;
			case 0:
				System.exit(0);			
			
			}//switch
		}while(option!=0);

	}

}
