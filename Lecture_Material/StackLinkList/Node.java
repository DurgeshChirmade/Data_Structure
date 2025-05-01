package StackLinkList;

public class Node {

	private int data;
	private Node next;
	
	public Node()
	{
		data = 0;
		next = null;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setData(int value)
	{
		data = value;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public void setNext(Node newnode)
	{
		next = newnode;
	}

	
}
