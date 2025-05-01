package DoublyLL;

public class Node {

	private int data;
	private Node next;
	private Node prev;
	
	public Node()
	{
		data = 0;
		next = prev = null;
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

	public Node getPrev()
	{
		return prev;
	}
	
	public void setPrev(Node newnode)
	{
		prev = newnode;
	}
}

