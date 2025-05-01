package CircularQueue;

import java.util.Scanner;

public class ClientCircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueueArray q = new CircularQueueArray();
		Scanner sc = new Scanner(System.in);

		int option,value;
		
		do {
			System.out.println("\n**************MENU************");
			System.out.println("1:Start"+
			                   "\n2:EnQueue"+
					           "\n3:DeQueue"+
			                   "\n4:Display"+
			                   "\n0:EXIT");
			System.out.println("Enter your choice: ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
			       q.initQueue();
			       System.out.println("      New Queue instantiated \n");
			       break;
			case 2:
				 System.out.println("Enter value to enqueue:: ");
				 value = sc.nextInt();
				 q.enQueue(value);
				 break;
			case 3:
				value = q.deQueue();
				if(value!=-1)
					System.out.println("\tDequeued value:: "+value);
				break;
			case 4:
				System.out.println("---------------QUEUE-----------");
				q.display();
				System.out.println("\n---------------------------\n");
				break;
			case 0:
				System.exit(0);
			}//switch
		}while(option!=0);

	}

}
