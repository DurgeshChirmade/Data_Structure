package QueueLL;

import java.util.Scanner;

public class ClientDynamicQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DynamicQueue q = new DynamicQueue();
        Scanner sc  = new Scanner(System.in);
		
		int value,option;
		
		do{
			System.out.println("\n\n------------Menu----------");
			System.out.println("\n1:EnQueue"+
					           "\n2:DeQueue"+
			                   "\n3:Display"+
					           "\n0:EXIT");
			System.out.println("\nEnter your choice:: ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("\nEnter value to enqueue:: ");
				value = sc.nextInt();
				
				q.enQueue(value);
				break;
				
			case 2:
				value = q.deQueue();
				if(value != -1)
					System.out.println("\tDeQueued:: "+value);
				
				break;
			case 3:
				System.out.println("\n\n-----------------------------");
				q.display();
				System.out.println("--------------------------------\n\n");
				
				break;
			case 0:
				System.exit(0);
			
			}//end_switch
		}while(option!=0);
		
	}//main

	
}
