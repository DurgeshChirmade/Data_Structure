package Tree;

public class BinarySearchTree {

	private Node root;
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public Node getRoot()
	{
		return this.root;
	}
	
	public Node createNode(int value)
	{
		Node newnode = new Node();
		newnode.setData(value);
		newnode.setLeft(null);
		newnode.setRight(null);
		
		return newnode;
	}
	
	public void addNode(int value)
	{
		Node newnode = createNode(value);
		Node temp = root;
		
		if(root==null)
		{
			root = newnode;
			System.out.println("\n\tRoot created....!!!");
		}
		else if(root!=null) 
		{
			while(true)
			{
				if(value < temp.getData())
				{
					if(temp.getLeft()==null)
					{
						temp.setLeft(newnode);
						System.out.println("\n\tNode added on left of "+temp.getData());
						break;
					}
					else
						temp = temp.getLeft();
					
				}//value<temp
				else if(value > temp.getData())
				{
					if(temp.getRight()==null)
					{
						temp.setRight(newnode);
						System.out.println("\n\tNode added on right of "+temp.getData());
						break;
					}
					else
						temp = temp.getRight();
					
				}//value>temp
				else
				{
					System.out.println("\n\tDuplicates are not allowed...!!!");
					break;
				}
				
			}//while			
			
		}//else_if root!=null
		
		
	}//add()
	
	public void preOrder(Node root)
	{
		Node temp = root;
		if(root!=null)
		{
			System.out.print(" , "+temp.getData());
			preOrder(temp.getLeft());
			preOrder(temp.getRight());
		}
	}//preorder
	
	public void inOrder(Node root)
	{
		Node temp = root;
		
		if(temp!=null)
		{
			inOrder(temp.getLeft());
			System.out.print(" , "+temp.getData());
			inOrder(temp.getRight());
		}
	}
	
	public void postOrder(Node root)
	{
		Node temp = root;
		
		if(temp!=null)
		{
			postOrder(temp.getLeft());
			postOrder(temp.getRight());
			System.out.print(" , "+temp.getData());
		}
	}
	
}//class











