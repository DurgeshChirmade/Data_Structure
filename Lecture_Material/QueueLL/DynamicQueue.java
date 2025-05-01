package QueueLL;

public class DynamicQueue {

	private Node front,rear;
	
	public DynamicQueue()
	{
		front = rear = null;
	}
	
	public Node createNode(int value)
	{
		Node newnode = new Node();
		newnode.setData(value);
		newnode.setNext(null);
		
		return newnode;
	}
	
	public boolean isEmpty()
	{
		if(front== null && rear == null)
			return true;
		else
			return false;
	}
	
	public void enQueue(int value)
	{
		Node newnode = createNode(value);
		
		if(isEmpty())
		{
			front = rear = newnode;
		}
		else
		{
			rear.setNext(newnode);
			rear = newnode;
		}
	}
	
	public int deQueue()
	{
		int value = -1;
		
		if(!isEmpty())
		{
			value = front.getData();
			
			Node temp = front;
			front = front.getNext();
			temp.setNext(null);
			//release temp
			if(front==null)  //if last node is deleted assign rear with null
				   rear = null;
		}
		else
			System.out.println("\tQueue is Empty...!!!");
		
		return value;
	}
	
	public void display()
	{
		Node temp = front;
		
		if(!isEmpty())
		{
			
		   while(temp!=null)
		   {
			   System.out.print("   "+temp.getData());
			   temp = temp.getNext();
		   }
			
		}
		else
			System.out.println("\tQueue is Empty...!!!");
		
	}
	
}//class










