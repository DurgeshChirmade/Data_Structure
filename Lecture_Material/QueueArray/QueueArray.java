package QueueArray;

import java.util.Scanner;

public class QueueArray {

	private int size;
	private int que[];
	private int front;
	private int rear;
	
    Scanner sc = new Scanner(System.in);
	
	public QueueArray()
	{
		size=0;
		que = new int[size];
		front = rear = -1;
	}
	
	public void initQueue()
	{
		System.out.println("Enter size of the queue:: ");
		size=sc.nextInt();
		que = new int[size];
		front = rear = -1;
	}
	
	public boolean isFull()
	{
		if(rear == size-1 )
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(front==rear)
			return true;
		else
			return false;
	}
	
	public void enQueue(int value)
	{
		if(!isFull() )
		{
			rear++;
			que[rear] = value;			
		}
		else
			System.out.println("Error: Queue is full");
	}
	
	public int deQueue()
	{
		int value=0;
		if(!isEmpty())
		{
			front++;
			value = que[front];
		}
		else
		{
			System.out.println("Error:: Queue is Empty ");
		}
	     return value;	
	}
	
	public void display()
	{
		int i;
		if(!isEmpty())
		{
			for(i=front+1 ; i<=rear ; i++)
				System.out.print("\t"+que[i]);
		}
		else
		{
			System.out.println("Error:: Queue is Empty ");
		}
		
	}
	
}//class
