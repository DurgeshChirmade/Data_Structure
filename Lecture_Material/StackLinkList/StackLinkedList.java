package StackLinkList;

public class StackLinkedList {

	private Node top;
	
	public StackLinkedList() {
		// TODO Auto-generated constructor stub
		top = null;
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
		if(top==null)
			return true;
		else
			return false;
	}
	
	public void push(int value)
	{
		Node newnode = createNode(value);
		
		if(isEmpty())
			top = newnode;
		else
		{
			newnode.setNext(top);
			top = newnode;
		}
	}
	
	public int pop()
	{
		int value = -1;
		if(!isEmpty())
		{
			Node temp =top;
			value = top.getData();
			top = top.getNext();
			temp.setNext(null);
			//release temp
		}
		else
			System.out.println("\tStack is empty....!!!");
		
		return value;
	}
	
	public void display()
	{
		Node temp = top;
		
		if(!isEmpty())
		{
			while(temp!=null)
			{
				System.out.println("\t"+temp.getData());
				temp = temp.getNext();
			}
		}
		else
			System.out.println("\n\tStack is empty...!!!");
	}
	
}//class









