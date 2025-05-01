package Tree;

public class Node {

	private Node left;
	private Node right;
	private int data;
	
	public Node()
	{
		left = right = null;
		data = 0;
	}
	
	public void setData(int value)
	{
		data = value;
	}
	
	public int getData()
	{
		return data;
	}
	
	public Node getLeft()
	{
		return left;
	}
	 
	public void setLeft(Node left)
	{
		this.left = left;
	}
	
	public void setRight(Node right)
	{
	    this.right = right;	
	}
	
	public Node getRight()
	{
		return right;
	}
}//class











