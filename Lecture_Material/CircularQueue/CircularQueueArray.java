			package CircularQueue;

import java.util.Scanner;

public class CircularQueueArray {
	
	private int size;
	private int []que;
	private int front;
	private int rear;
	
	Scanner sc = new Scanner(System.in);
	
	
	public CircularQueueArray() {
		// TODO Auto-generated constructor stub
		size = 0;
		que =  new int[size];
		front  = rear = -1;
	}
	
	public void initQueue()
	{
		System.out.println("\nEnter size::");
		this.size = sc.nextInt();
		que = new int[this.size];
		front = -1;
		rear = -1;
	}
	
	public boolean isFull()
	{
		if(front==-1 && rear==(size-1))
			return true;
		else if(front == (rear+1)%size)
            return true;
		else
			return false;            	
	}
	
	public boolean isEmpty()
	{
		if(front == rear)
			return true;
		else
			return false;
	}

	public void enQueue(int value)
	{
		if(!isFull())
		{
			rear = (rear+1)%size;
		    que[rear] = value;
		}
		else
			System.out.println("\n\tQueue Overflow....!!!!");
	}//enQueue
	
	public int deQueue()
	{		
		if(!isEmpty())
		{
			front = (front+1)%size;
			return que[front];
		}
		else
			System.out.println("\n\tQueue Underflow...!!!");
		
		return -1;
	}//deQueue
	
	public void display()
	{
		int i;
		if(!isEmpty())
		{
			for(i=front+1 ; i!=rear ;i=(i+1)%size)
			{
				System.out.print("\t"+que[i]);
			}
			System.out.print("\t"+que[i]);
		}
		else
			System.out.println("\n\tQueue Underflow...!!!");
		
	}//display
	
}//class













